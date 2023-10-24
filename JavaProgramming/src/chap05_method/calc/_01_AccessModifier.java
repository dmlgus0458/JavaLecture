package chap05_method.calc;

public class _01_AccessModifier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//같은 패키지의 클래스 (설계도)를 사용할 때는 import 
		Calculator calc = new Calculator();
		
		//같은 패키지내의 클래스이기 때문에
		//public, protected, default 접근제어자를 갖는
		//메소드를 호출할 수 있다.
		calc.add();
		calc.min(); //protected
		calc.div();
		
		//private 접근제어자는 해당 클래스 안에서만 접근할 수 있다.
		//private은 변수에 지정을 해서 보안성을 높여준다. 예를들면 유저정보
//		calc.mul();

	}

}
