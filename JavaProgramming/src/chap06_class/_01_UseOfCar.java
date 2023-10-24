package chap06_class;

import chap06_class.car.Car;

public class _01_UseOfCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수로 객체 생성 // 자동차 부품
		
		//Car타입의 변수를 만든다.
		Car car = new Car(); //처음에는 기본생성자. //컨트롤 쉬프트 O로 import 하자

		//객체의 속성값이나 메소드에 접근할 때는 변수명. 으로 접근한다.
		car.company		= "현대";
		car.model		= "제네시스";
		car.price		= 50000000;
		car.color		= "black";
		
		//메소드들도 사용할 수 있겠지. 
		car.turnOn();
		car.speedUp();
		car.speedDown();
		car.turnOff();
		
		
		car.carInfo();
		
	}

}
