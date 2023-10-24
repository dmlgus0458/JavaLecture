package chap02_variables;

public class _09_Constant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 상수 선언 및 초기화
		final int MAX_STUDENT_COUNT = 30;
		
		//2. 상수는 선언만 하고 나중에 값을 저장해도 무방하다.
		final double PI;
		
		PI = 3.14;
		
		//3. 한 번 값이 지정된 상수는 값을 변경할 수 없다.
//		MAX_STUDENT_COUNT = 40;
		
		//4. 원의 넓이, 둘레 계산 시 상수 사용
		int r = 14;
		
		System.out.println("반지름 14인 원의 넓이 : " + (PI * r * r));
		System.out.println("반지름 14인 원의 둘레 : " + (2 * PI * r));
	}

}
