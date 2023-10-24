package chap05_method;

import chap05_method.calc.OverloadingCalculator;

public class _04_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingCalculator ocalc = new OverloadingCalculator();
		
		int result;
		
		result = ocalc.mul(10, 5);
		System.out.println("ocalc.mul(10, 5) = " + result);
		
		result = ocalc.mul(10);
		System.out.println("ocalc.mul(10) = " + result);
		
//		result = ocalc.mul(10.5, 10); //에러발생. 매개변수의 순서도 지켜줘야한다.
		result = ocalc.mul(10, 5.0); //이와 같이 매개변수 타입 순서에 맞게 입력해야한다.
		//중요 : 형태를 잘 찾고 형태를 잘 지키는 것이 매개변수에서 가장 중요한 점이다.
		System.out.println("ocalc.mul(10, 5.0) = " + result);
		
		
		//같은 메소드의 이름이지만 각기 다른 결과가 나오는걸 알 수 있다.
	}

}
