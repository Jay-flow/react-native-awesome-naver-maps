import React from 'react'
import { requireNativeComponent, ViewStyle } from 'react-native'

interface NaverMapProps {
  style?: ViewStyle
}

const NativeNaverMapView = requireNativeComponent<NaverMapProps>('NaverMap')

const NaverMap = ({ style }: NaverMapProps) => {
  return <NativeNaverMapView style={style} />
}

export default NaverMap
