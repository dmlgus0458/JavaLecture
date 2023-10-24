package chap05_method;

import chap05_method.calc.ParameterCalculator;

public class _03_Parameter {
	
	public static void main(String[] args) {
		
		ParameterCalculator pcalc = new ParameterCalculator();
		
		//add 메소드가 int 매개변수 두 개를 가지고 있기 때문에 호출할 때
		//int형 매개변수 두 개를 무조건 전달해야 한다.
		pcalc.add(10, 20);
		
		
		//매개변수는 꼭 값만 전달 할 수 있는 것은 아니다.
		//값이 저장된 변수를 지정할 수도 있다.
		int num1 = 10;
		int num2 = 20;
		pcalc.add(num1, num2); 
		
		
		double dNum = pcalc.div(num1, num2);
		System.out.println(dNum); //메소드(println)와 매개변수(dNum)
		
		String str = pcalc.addString("hello", "java");
		System.out.println(str);
	}

}
