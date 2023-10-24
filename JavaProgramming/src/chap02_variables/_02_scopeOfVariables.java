package chap02_variables;

public class _02_scopeOfVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 지역변수
		//메인메소드의 변수 선언
		int mainNum = 10;
		int sum = 0;
		
		//조건문
		//sum이 0일 때 중괄호 블록안의 내용 실행
		//sum이 0이 아닐 때는 else 뒤의 중괄호 블록안의 내용 실행
		if(sum == 0) {
			//if문의 지역변수 선언
			int fNum = 20;
			sum = mainNum + fNum;
		} else {
			//else문의 지역변수 선언
			int fNum = 30;
			sum = mainNum + fNum;
		}
		
		System.out.println("sum : " + sum);
		
		//if {} else {} 중괄호 블록안의 지역변수인 fNum을 사용하면 
		//선언되지 않은 변수로 인식해서 에러 발생
		//System.out.println("fNum : " + fNum);
		
		//메소드의 호출
		getSum();
		//메소드의 호출 종료(실행 종료)
//		System.out.println(localResult);
//		System.out.println(localVal1);
	}
	
	//메소드 선언
	public static void getSum() {
		//메소드 지역 변수 선언
		//메소드의 지역 변수는 메소드가 호출됐을 때 생성됐다가 호출이 끝나면 삭제된다.
		int localVal1 = 10;
		int localVal2 = 20;
		int localResult = localVal1 + localVal2;
		
		System.out.println("localResult : " + localResult );
	}
	
	
	
	
	
	

}
