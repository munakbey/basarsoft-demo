package com.app.demo.viewmodel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.Button
import android.widget.TextView
import com.app.demo.R
import com.app.demo.model.Work
import com.app.demo.view.activity.MapsActivity
import com.app.demo.view.fragment.Form


class MenuAdapter(
    var context: Context,
    var header: MutableList<Work>
) : BaseExpandableListAdapter() {

    companion object {
        var mLat: Double? = null
        var mLong: Double? = null
    }


    override fun getGroupCount(): Int {
        return header.size
    }

    override fun getChildrenCount(groupPosition: Int): Int {
        return 1
    }

    override fun getGroup(groupPosition: Int): Work {
        return header[groupPosition]
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Any {
        return 0
    }

    override fun getGroupId(groupPosition: Int): Long {
        return groupPosition.toLong()
    }

    override fun getChildId(groupPosition: Int, childPosition: Int): Long {
        return 0
    }

    override fun hasStableIds(): Boolean {
        return false
    }

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        if (convertView == null) {
            var inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_group, null)
        }
        var title: TextView = convertView?.findViewById(R.id.txt_group_name)!!
        title.setText(getGroup(groupPosition).workOder)
        return convertView
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView
        if (convertView == null) {
            var inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.list_item, null)
        }

        var btnShowDetails: Button = convertView?.findViewById(R.id.btn_show_details)!!
        var btnGoToLocation: Button = convertView?.findViewById(R.id.btn_go_to_location)!!

        btnGoToLocation.setOnClickListener(View.OnClickListener {
            mLat = getGroup(groupPosition).latitude
            mLong = getGroup(groupPosition).longitude


            Log.e("TAG", "loc  " + getGroup(groupPosition).workOrderDetail)
            val intent = Intent(context?.applicationContext, MapsActivity::class.java)
            intent.putExtra("lat", mLat)
            intent.putExtra("long", mLong)
            context.startActivity(intent)
        })

        btnShowDetails.setOnClickListener(View.OnClickListener {
            val bundle = Bundle()
            bundle.putString("work_order_details", getGroup(groupPosition).workOrderDetail)
            bundle.putString("work_order", getGroup(groupPosition).workOder)

            val fragment = Form.newInstance("", "")
            fragment.arguments = bundle
            val transaction = (context as MapsActivity)?.supportFragmentManager?.beginTransaction()
            transaction?.replace(R.id.map_form_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        })

        return convertView!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int): Boolean {
        return true
    }


}