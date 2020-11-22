package com.app.demo.view.fragment

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.app.demo.R
import com.app.demo.databinding.FragmentMenuBinding
import com.app.demo.model.Work
import com.app.demo.view.activity.MapsActivity
import com.app.demo.viewmodel.MenuAdapter
import com.app.demo.viewmodel.MenuViewModel


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Menu() : Fragment() {
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var menuViewModel: MenuViewModel
    private lateinit var menuBinding: FragmentMenuBinding
    var fragment = Menu

    val header: MutableList<Work> = ArrayList()
    val body: MutableList<MutableList<String>> = ArrayList()

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
        menuBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_menu, container, false)
        val view: View = menuBinding.getRoot()
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        menuViewModel = ViewModelProviders.of(this).get(MenuViewModel::class.java)

        val sharedPreferences = context!!.getSharedPreferences(
            "com.app.demo.view.fragment",
            android.content.Context.MODE_PRIVATE
        )

        val mId = sharedPreferences.getInt("userId", 998)
        Log.e("TAG", " ID= " + mId.toString())
        menuViewModel.getWorkByUserId(mId)
        observeWorkList()
        menuBinding.expandableListView.setAdapter(MenuAdapter(context!!, header))
    }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Menu().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    fun observeWorkList() {
        menuViewModel.work.observe(viewLifecycleOwner, Observer { result ->
            result?.let {
                for (i in result) {
                    Log.e("TAG", i.workOder + "\n")
                    if (header.size != 0) {
                        header.clear()
                    }
                    header.addAll(0, result)

                }
            }
        })
    }


}
