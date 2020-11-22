package com.app.demo.view.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.app.demo.R
import com.app.demo.databinding.ActivityMainBinding
import com.app.demo.view.fragment.Login
import com.app.demo.view.fragment.Register
import com.munevver.basarsoft.viewmodel.db.LoginViewModel

class MainActivity : AppCompatActivity() , View.OnClickListener {

    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)

        mainBinding.txtRegister.setOnClickListener(this)
        changeFragment(Login())

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_login -> changeFragment(Login())
            R.id.txt_register -> {
                mainBinding.txtRegister.visibility = View.GONE
                changeFragment(Register())
            }
        }
    }

    fun changeFragment(fragment: Fragment) {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()
    }
}