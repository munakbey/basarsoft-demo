package com.app.demo.view.activity

import android.app.AlertDialog
import android.location.Geocoder
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.app.demo.R
import com.app.demo.databinding.ActivityMapsBinding
import com.app.demo.view.fragment.Form
import com.app.demo.view.fragment.Menu
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.GoogleMap.OnMarkerDragListener
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.Marker
import com.google.android.gms.maps.model.MarkerOptions
import java.io.IOException
import java.io.Serializable
import java.util.*
import kotlin.collections.ArrayList


class MapsActivity : AppCompatActivity(), OnMapReadyCallback,
    GoogleMap.OnInfoWindowClickListener, Serializable {


    private var clickCount: Int = 0
    private var click: Int = 0


    companion object {
        var coordinats: ArrayList<Double> = ArrayList()
        lateinit var mMap: GoogleMap
        lateinit var mapBinding: ActivityMapsBinding
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mapBinding = DataBindingUtil.setContentView(this, R.layout.activity_maps)
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)


        mapBinding.icon.setOnClickListener(View.OnClickListener {
            clickCount++
            if (clickCount % 2 == 0) {

                val fragmentTransaction = supportFragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.map_form_fragment, Form())
                fragmentTransaction.commit()
            } else {
                mapBinding.icon.setImageResource(R.drawable.icon_tick)
                onAlertDialog(mapBinding.root)

                mMap.setOnMapClickListener { marker ->
                    var coordinat = LatLng(marker.latitude, marker.longitude)
                    if (click == 0) {
                        mMap.addMarker(
                            MarkerOptions().position(coordinat).draggable(true)
                        )

                        coordinats.add(marker.latitude)
                        coordinats.add(marker.longitude)
                    }
                    click++

                }
                mMap.setOnMarkerClickListener { marker ->
                    if (marker.isInfoWindowShown) {
                        marker.hideInfoWindow()
                    } else {
                        marker.showInfoWindow()
                    }
                    marker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                    true
                }

                mMap.setOnMarkerDragListener(object : OnMarkerDragListener {
                    override fun onMarkerDragStart(marker: Marker) {
                    }

                    override fun onMarkerDrag(marker: Marker) {

                    }

                    override fun onMarkerDragEnd(marker: Marker) {
                        if (coordinats.size > 0) {
                            coordinats.clear()
                        }

                        val latLng = marker.position
                        val geocoder = Geocoder(applicationContext, Locale.getDefault())
                        try {
                            val address =
                                geocoder.getFromLocation(latLng.latitude, latLng.longitude, 1)[0]
                        } catch (e: IOException) {
                            e.printStackTrace()
                        }
                        coordinats.add(marker.position.latitude)
                        coordinats.add(marker.position.longitude)

                        Log.e(
                            "TAG",
                            marker.position.latitude.toString() + " -- " + marker.position.longitude.toString()
                        )
                        marker.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED))
                    }
                })

            }
        })

        mapBinding.imgMenu.setOnClickListener(View.OnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.map_form_fragment, Menu())
            fragmentTransaction.commit()
        })
    }

    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        var bundle: Bundle? = intent.extras
        if (bundle != null) {
            var mLat = bundle!!.getDouble("lat") // 1
            var mLong = bundle!!.getDouble("long") // 1
            Log.e("TAG", mLat.toString() + " #### " + mLong.toString())

            val coord = LatLng(mLat!!, mLong!!)
            mMap.moveCamera(CameraUpdateFactory.newLatLng(coord))
            val options = MarkerOptions().position(coord)
            mMap.addMarker(options)
        }
    }

    override fun onInfoWindowClick(p0: Marker?) {
        Toast.makeText(this, p0?.getTitle(), Toast.LENGTH_LONG).show();
    }

    fun onAlertDialog(view: View) {
        val builder = AlertDialog.Builder(view.context)
        builder.setTitle(getString(R.string.info))
        builder.setMessage(getString(R.string.info_detail))
        builder.setNegativeButton(
            getString(
                R.string.ok
            )
        ) { dialog, id ->
        }

        builder.show()
    }


}