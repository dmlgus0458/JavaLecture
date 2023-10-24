package chap05_method.calc;

public class CompleteCalculator {
	//int 형 매개변수 2개를 받아서 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산해주는
	//메소드 5개 (모두 리턴타입 int형)
	
	
	
	
	//덧셈
	public int add(int a, int b) {
		return a + b;
	}
	
	//메소드의 단점2 : int와 double타입별로 메소드를 만들다보면 코드가 복잡해질 수 있기 때문에 
	//				공통적으로 많이 사용되는 기능들만 메소드로 만들어서 사용하는 것을 권장한다.
//	public double add(double a, double b) {
//		return a + b;
//	}
	
	//뺄셈
	public int minus(int a, int b) {
		return a - b;
	}
	
	//곱셈
	public int multip(int a, int b) {
		return a * b;
	}
	
	//나눗셈
	public int division(int a, int b) {
		if(b != 0) {
			return (int)(a / b); //double형으로 나올 수 있으니까 int형으로 바꿔주기
		}else {
			return 0;
		}	
	}
	
	//나머지
	public int mod(int a, int b) {
		if(b != 0) {
			return a % b;
		} else {
			return 0;
		}
	}
	
	
}
