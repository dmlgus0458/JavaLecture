package chap05_method.calc;


//클래스는 접근제어자는 public이랑 default만 허용
public class Calculator { 
	//public이란, 어디서나 접근 가능한 메소드
	public void add() { 
		// void란, 결과값이 없는 것. 만약 void가 아닌 int로 쓰일 때는 항상 결과값을 내줘야 한다. 마지막에 return을 쓴다던가.
		System.out.println(10 +20);
	}
	
	//protected는, 같은 클래스, 같은 패키지내의 클래스, 자식클래스에서 접근
	protected void min() {
		System.out.println(20 - 10);
	}
	
	//default: 같은 클래스, 같은 패키지 내의 클래스에서 접근 가능
	void div() {
		System.out.println(20 / 10);
	}
	
	//private는, 같은 클래스에서 접근 가능
	private void mul() {
		System.out.println(10 * 20);
	}
}
