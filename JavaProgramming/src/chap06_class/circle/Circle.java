package chap06_class.circle;

public class Circle {
	
	//속성으로는 실수(double) 상수 PI(3.14), 정수형 반지름 radius
	//값을 바꿀 수 없는 상수
	public final double PI = 3.14;
	public int radius;	//반지름
	
	//기본생성자 만들기
	public Circle() {
		
	}
		
	//반지름을 받아서 초기화하는 생성자	
	public Circle(int radius) {
		this.radius = radius;		
	}
	
	
	//원의 둘레를 리턴하는 메소드 (2* PI * radius)
	public double circleRound() {					
		return 2 * PI * radius;
	}
	
	//원의 넓이를 리턴하는 메소드 (PI * radius * radius)
	public double circleAre() {
		return PI * radius * radius;
	}
	
	
	
}
