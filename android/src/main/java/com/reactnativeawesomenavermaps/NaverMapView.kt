package com.reactnativeawesomenavermaps

import com.facebook.react.uimanager.ThemedReactContext
import com.naver.maps.map.MapView
import com.naver.maps.map.NaverMap
import com.naver.maps.map.OnMapReadyCallback

class NaverMapView : MapView, OnMapReadyCallback {
  private lateinit var naverMap: NaverMap

  constructor(themedReactContext: ThemedReactContext) : super(themedReactContext) {
    super.onCreate(null)
    super.onStart()
    getMapAsync(this)
  }

  override fun onMapReady(naverMap: NaverMap) {
    this.naverMap = naverMap
  }
}

