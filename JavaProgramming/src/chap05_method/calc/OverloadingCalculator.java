package chap05_method.calc;

public class OverloadingCalculator {
	public int mul(int a, int b) {
		return a + b;
	}
	
	//오버로딩: 매개변수를 조작하여 같은 이름의 메소드를 생성
	public int mul(int a) {
		return a + a;
	}
	
	public int mul(int a, double b) { //매개변수의 개수는 같지만, 매개변수의 타입이 달라서.
		return (int) (a * b);
	}
	
//	public int mul(int a, double b) { 
//		return (int) (a * b * a);     //기능은 다르지만 매개변수가 동일해서 틀린것이다.
//	}

}
