package chap02_variables;

public class _05_ShortIntLong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. short 타입의 변수 선언 및 초기화
		short sNum1 = 10;
		short sNum2 = 20;
		
		//2. short도 범위 초과하는 값 할당 시 에러 발생
//		short sNum3 = 65536;
		
		//3. int 타입의 변수 선언 및 초기환
		int iNum1 = 200;
		int iNum2 = 2000000000;
		
//		int iNum3 = 3000000000;
		
		//4. long 타입의 변수 선언 및 초기화
		//long 타입의 값 뒤에는 L이나 l을 붙여준다.
		//L이나 l은 차이가 없다.
		long lNum1 = 100L;
		long lNum2 = 100l;
		long lNum3 = 100;
		
		//int 타입의 범위를 초과하는 값을 할당할 때 L이나 l을 붙이지 않으면 에러 발생
		long lNum4 = 3000000000L;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
