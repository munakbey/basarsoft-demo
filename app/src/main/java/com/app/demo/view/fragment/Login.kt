package com.app.demo.view.fragment

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.demo.R
import com.app.demo.databinding.FragmentLoginBinding
import com.app.demo.view.activity.MapsActivity
import com.munevver.basarsoft.viewmodel.db.LoginViewModel

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Login : Fragment() {

    private lateinit var loginBinding: FragmentLoginBinding
    private lateinit var viewModel: LoginViewModel

    private lateinit var username: String
    private lateinit var password: String

    private var PRIVATE_MODE = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loginBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login, container, false
        )

        val view: View = loginBinding.getRoot()
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        loginBinding.btnLogin.setOnClickListener(View.OnClickListener {

            username = loginBinding.txtUsername.getText().toString()
            password = loginBinding.txtPassword.getText().toString()

            viewModel.getUser(username)
            observeLiveData()
        })
    }

    fun observeLiveData() {
        viewModel.user.observe(viewLifecycleOwner, Observer { result ->
            result?.let {
                if (password.equals(result.get(0).password)) {
                    activity?.let {
                        //     dataPasser.onDataPass(username)
                        val sharedPref: SharedPreferences = context!!.getSharedPreferences(
                            "com.app.demo.view.fragment",
                            PRIVATE_MODE
                        )
                        sharedPref.edit().putString("username", username).apply()
                        sharedPref.edit().putInt("userId", result.get(0).id).apply()


                        val intent = Intent(it, MapsActivity::class.java)
                        it.startActivity(intent)
                    }
                } else {
                    Log.e("TAG", username + " *****  " + password)
                }
            }
        })
    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Login().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}