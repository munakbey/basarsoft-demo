package com.app.demo.view.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.app.demo.R
import com.app.demo.databinding.FragmentRegisterBinding
import com.app.demo.view.activity.MainActivity
import com.munevver.basarsoft.model.User
import com.munevver.basarsoft.viewmodel.db.LoginViewModel


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Register : Fragment() {

    private lateinit var registerBinding: FragmentRegisterBinding
    private lateinit var viewModel: LoginViewModel

    private lateinit var username: String
    private lateinit var password: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        registerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_register, container, false
        )
        val view: View = registerBinding.getRoot()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        registerBinding.btnReg.setOnClickListener(View.OnClickListener {
            username = registerBinding.txtUsername.getText().toString()
            password = registerBinding.txtPassword.getText().toString()

            if (username != "" && password != "") {
                viewModel.addUser(User(username, password))
                Log.e(
                    "TAG",
                    registerBinding.txtUsername.getText()
                        .toString() + " ---" + registerBinding.txtPassword.getText().toString()
                )
                activity?.let {
                    val intent = Intent(it, MainActivity::class.java)
                    it.startActivity(intent)
                }
            }
        })
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Register().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}