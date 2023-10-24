package chap06_class.car;

public class Car {
	//자동차의 속성들 //맨처음에 선언할 때는 int형은 0, String은 null값이 들어있겠지.
	public String company;
	public String model;
	public int price;		
	public String color;    
	
	//자동차의 기능
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	//시동끄는 기능
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	//속도 올리는 기능
	public void speedUp() {
		System.out.println("속도를 올린다.");
	}
	
	//속도 줄이는 기능
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	
	//차량의 종류를 출력하는 기능
	public void carInfo() { 
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
