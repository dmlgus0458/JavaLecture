package chap06_class;

import java.util.Scanner;

import chap06_class.circle.Circle;

public class _05_UseOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("반지름을 입력하세요.(정수 타입)");	
		
		int radius = sc.nextInt();
			
		Circle circle = new Circle(radius); //이걸 사용하려면, 기본생성자를 만들어야 한다.
		
		
		System.out.println("반지름: " + circle.radius);
		
		System.out.println("원 둘레: " + circle.circleRound());
		System.out.println("원 넓이: " + circle.circleAre());

	}

}
