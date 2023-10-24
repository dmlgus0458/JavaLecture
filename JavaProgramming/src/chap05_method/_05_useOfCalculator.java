package chap05_method;

import java.util.Scanner; //컨트롤 shift o 로 임포트 무조건 넣어줘야 한다.

import chap05_method.calc.CompleteCalculator;

public class _05_useOfCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		String operator = "";
		
		System.out.println("정수를 입력하세요.");			
		num1 = sc.nextInt();
		
		System.out.println("정수를 입력하세요.");
		num2 = sc.nextInt();
		
		sc.nextLine();							// 엔터값을 처리하기 위해 있는 것이다.
		System.out.println("연산자를 입력하세요.(+, -, *, /, %)");
		operator = sc.nextLine();
		
		
		int result = 0;
		CompleteCalculator ccalc = new CompleteCalculator();
		
		//ComCalculator의 메소드 5개 결과 값을 출력하세요.
		//메소드에 전달할 매개변수는 사용자가 입력하는 num1, num2
		
//		if (operator == "+") { //틀림!! 만약에 이렇게 한다면, 주소값과 비교하게 되서 정확하지 않다.

//		if (operator.equals("+")) {
//		result = ccalc.add(num1, num2); //모듈화를 해서 코드를 재사용할 수 있고, 가독성이 높아지는 장점이 있다.
//		//result - num1 + num2;
//		System.out.println(num1 +" + " + num2 + " = " + result);
//		}
//		else if(operator.equals("-")) {
//		result = ccalc.minus(num1, num2);
//		System.out.println(num1 +" - " + num2 + " = " + result);
//		}
//		else if(operator.equals("*")) {
//		result = ccalc.multip(num1, num2);
//		System.out.println(num1 +" * " + num2 + " = " + result);
//		}
//		else if(operator.equals("/")) {
//		result = ccalc.division(num1, num2);
//		System.out.println(num1 +" / " + num2 + " = " + result);
//		}
//		else if(operator.equals("%")) {
//		result = ccalc.mod(num1, num2);
//		System.out.println(num1 +" % " + num2 + " = " + result);
//		}
//		else {
//			System.out.println("연산자를 잘못 입력하셨습니다.");
//		}
		
		switch(operator) {
		case "+":
			result = ccalc.add(num1, num2);		
			System.out.println(num1 +" + " + num2 + " = " + result);
			break;
		
		case "-":
			result = ccalc.minus(num1, num2);
			System.out.println(num1 +" - " + num2 + " = " + result);
			break;
			
		case "*":
			result = ccalc.multip(num1, num2);
			System.out.println(num1 +" * " + num2 + " = " + result);
			break;
			
		case "/":
			result = ccalc.division(num1, num2);
			System.out.println(num1 +" / " + num2 + " = " + result);
			break;
			
		case "%":
			result = ccalc.mod(num1, num2);
			System.out.println(num1 +" % " + num2 + " = " + result);
			break;
		
		default:
			System.out.println("연산자를 잘못 입력하셨습니다.");
			break;
		}
		
		
		sc.close();
	}

}
