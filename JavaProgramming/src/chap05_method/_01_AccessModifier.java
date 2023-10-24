package chap05_method;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		//Calculator와 패키지가 다르기 때문에 public 메소드만 호출 가능
		// public 메소드 어디서나 접근(호출) 가능
		calc.add();
		
		//calc. 이라고 타이핑하고 컬트롤 스페이스 눌러주면, 사용가능 한게 뜬다.
		
	}

}
