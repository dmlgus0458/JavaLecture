package chap06_class;

import chap06_class.car.CarConstructor;

public class _02_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		CarConstructor car = new CarConstructor("현대"); //컴퍼니가 지정된. car는 현대차만 찍는 공장이 되겠지.
		CarConstructor car = new CarConstructor("현대", "제네시스", 50000000, "black"); 
		CarConstructor car1 = new CarConstructor();		//빈 것.
		
		car.carInfo();
		System.out.println("-------------------");
		car1.carInfo();
		
	}

}
