package chap02_variables;

public class _08_VarVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. var 자료형 변수 선언 및 초기화
		var str = "hello";
		
		//2. var 자료형 선언만 하고 초기화를 안하면 에러 발생
//		var str1;
//		str1 = "java";
		
		//3. 자료형 추론이 완료된 상태에서 다른 타입의 값을 저장하면 에러 발생
		//str은 String 타입으로 정해진 상태에서
		//int 타입의 값을 저장하면 에러 발생
		str = "java";
//		str = 100;
		
		//4. 연산 결과의 자료형을 확신할 수 없을 때 주로 사용한다.
		int iNum = 100;
		double dNum = 12.532;
		
		var result = iNum + dNum;
		
		System.out.println(result);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
