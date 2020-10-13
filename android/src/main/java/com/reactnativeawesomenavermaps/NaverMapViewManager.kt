package com.reactnativeawesomenavermaps

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;


class NaverMapViewManager(val reactContext: ReactApplicationContext) : ViewGroupManager<NaverMapView>() {
  override fun getName(): String {
    return "NaverMap"
  }

  override fun createViewInstance(reactContext: ThemedReactContext): NaverMapView {
    return NaverMapView(reactContext)
  }
}
