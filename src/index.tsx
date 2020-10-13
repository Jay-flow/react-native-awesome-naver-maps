import { NativeModules } from 'react-native';

type AwesomeNaverMapsType = {
  multiply(a: number, b: number): Promise<number>;
};

const { AwesomeNaverMaps } = NativeModules;

export default AwesomeNaverMaps as AwesomeNaverMapsType;
