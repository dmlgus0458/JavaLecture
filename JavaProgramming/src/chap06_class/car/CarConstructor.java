package chap06_class.car;

public class CarConstructor { //여기가 this.속성값을 꺼낼 수 있는 공간.
	//자동차의 속성들 //맨처음에 선언할 때는 int형은 0, String은 null값이 들어있겠지.
	public String company; //속성변수명
	public String model;
	public int price;		
	public String color;    
	
	//'생성자' 정의 위치 : '생성자'는 웬만하면 속성(위에)과 기능(아래) 사이에 정의하는 경우가 많다.
	//아무것도 정해져있는게 없는 차를 만드는 것.
	public CarConstructor() {
		
	}
	
	//제조사(company를 받아오는 것)가 지정된 차를 만드는것.
	//!주의! : 생성자에서 받아오는 매개변수는 어떤 변수를 초기화할지 명확하게 하기위해 (맨위에 있는) 속성 변수명이랑 일치 시켜주는 경우가 많다.
	public CarConstructor(String company) { //제조사가 지정된 차를 만들 수 있을 것이다.
	
		//this: 생성자를 통해서 만들어지는 객체를 지칭하는 키워드(CarConstructor 객체를 의미)
		this.company = company;		
//		company = company;		
//		company = c;		//c를 맨위에 선언된 변수명을 따라서 똑같이 일치 시켜주는 경우가 많다.
	}
	
	//모든 것들이 지정된 차를 만드는 것.
	public CarConstructor(String company, String model, int price, String color) {
		this.company	= company;
		this.model		= model;
		this.price		= price;
		this.color		= color;
	}
	
	//자동차의 기능
	public void turnOn() {
		System.out.println("시동을 겁니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void speedUp() {
		System.out.println("속도를 올린다.");
	}
	
	public void speedDown() {
		System.out.println("속도를 줄인다.");
	}
	
	public void carInfo() { //차량의 종류를 출력하는 
		System.out.println("제조사: " + company);
		System.out.println("모델: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}
}
