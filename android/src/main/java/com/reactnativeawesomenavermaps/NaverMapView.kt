package com.reactnativeawesomenavermaps

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.PermissionChecker
import com.facebook.react.modules.core.PermissionListener
import com.facebook.react.uimanager.ThemedReactContext
import com.naver.maps.map.*
import com.naver.maps.map.util.FusedLocationSource
import java.util.jar.Manifest


class NaverMapView : MapView, OnMapReadyCallback {
  private val themedReactContext: ThemedReactContext
  private lateinit var naverMap: NaverMap


  constructor(themedReactContext: ThemedReactContext) : super(themedReactContext) {
    super.onCreate(null)
    super.onStart()
    this.themedReactContext = themedReactContext
    getMapAsync(this)
  }

  override fun onMapReady(naverMap: NaverMap) {
    naverMap.uiSettings.isLocationButtonEnabled = true
    this.naverMap = naverMap
    myLocationHandling()
  }

  private fun myLocationHandling() {
    val LOCATION_PERMISSION_REQUEST_CODE = 1000
    val locationSource = FusedLocationSource(themedReactContext.currentActivity!!, LOCATION_PERMISSION_REQUEST_CODE)
    this.naverMap.locationSource = locationSource
    this.naverMap.locationTrackingMode = LocationTrackingMode.Follow
  }
}

