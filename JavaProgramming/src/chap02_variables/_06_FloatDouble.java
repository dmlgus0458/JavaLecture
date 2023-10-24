package chap02_variables;

public class _06_FloatDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. float 타입 변수 선언 및 초기화
		//F나 f를 붙이는 것에 차이는 없다.
		float fNum1 = 3.14f;
		float fNum2 = 3.14F;
		
		//2. double 타입 변수 선언 및 초기화
		double dNum1 = 89.12345;
		double dNum2 = 11.975;
		
		//3. 실수형 연산은 double 타입으로 진행
		//float 변수끼리 연산해도 double 타입으로 연산이 진행되고
		//결과도 double 타입으로 반환된다.
		double result1 = fNum1 + fNum2;
		System.out.println(result1);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
