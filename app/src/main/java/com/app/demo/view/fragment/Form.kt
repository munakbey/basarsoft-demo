package com.app.demo.view.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.demo.R
import com.app.demo.databinding.FragmentFormBinding
import com.app.demo.model.Work
import com.app.demo.view.activity.MapsActivity
import com.app.demo.viewmodel.MapsViewModel
import com.munevver.basarsoft.viewmodel.db.LoginViewModel


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Form : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var formBinding: FragmentFormBinding
    private lateinit var mapsViewModel: MapsViewModel
    private lateinit var loginViewModel: LoginViewModel

    private var userid: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        formBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_form, container, false)

        val sharedPreferences = context!!.getSharedPreferences(
            "com.app.demo.view.fragment",
            android.content.Context.MODE_PRIVATE
        )
        userid = sharedPreferences.getInt("userId", 998)
        Log.e("TAG", "Form-ID= " + userid.toString())


        formBinding.btnSave.setOnClickListener(View.OnClickListener {
            var input1 = formBinding.txtFormInput1.getText().toString()
            var input2 = formBinding.txtFormInput2.getText().toString()
            var latitude: Double = MapsActivity.coordinats.get(0)
            var longitude: Double = MapsActivity.coordinats.get(1)


            val sharedPreferences = context!!.getSharedPreferences(
                "com.app.demo.view.fragment",
                android.content.Context.MODE_PRIVATE
            )

            val showName = sharedPreferences.getString("username", "")
            Log.e("TAG", showName + " ######3 " + sharedPreferences.getInt("userId", 5).toString())
            if (showName != null) {
                loginViewModel.getUser(showName)
            }
            observeLiveUserData()
            mapsViewModel.addWork(Work(input1, input2, latitude, longitude, userid))
            activity!!.startActivity(Intent(activity, MapsActivity::class.java))
        })

        formBinding.btnCancel.setOnClickListener(View.OnClickListener {
            mapsViewModel.getWorkByUserId(userid)
            activity!!.startActivity(Intent(activity, MapsActivity::class.java))
        })

        var workOrderDetail = arguments?.getString("work_order_details")
        var workOrder = arguments?.getString("work_order")

        if (workOrderDetail != null) {
            formBinding.txtFormInput1.setText(workOrder)
            formBinding.txtFormInput2.setText(workOrderDetail)
            formBinding.txtFormInput1.isEnabled = false
            formBinding.txtFormInput2.isEnabled = false
            formBinding.btnCancel.visibility = View.GONE
            formBinding.btnSave.visibility =  View.GONE
        }

        return formBinding.getRoot()

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mapsViewModel = ViewModelProviders.of(this).get(MapsViewModel::class.java)
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

    }

    fun observeLiveUserData() {
        loginViewModel.user.observe(viewLifecycleOwner, Observer { result ->
            result?.let {
                userid = result.get(0).id
            }
        })
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Form().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}