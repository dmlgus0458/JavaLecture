package chap03_operator;

public class _02_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대입연산자
		// 왼쪽 피연산자에 오른쪽 피연산자의 값을 대입(저장)한다.
		int num1 = 115;
		int num2 = 27;
		int num3 = 317;
		
		//대입연산자 오른쪽 피연산자로 변수명을 사용해도 된다.
		int num4 = num3;
		System.out.println("num4 : " + num4);
		System.out.println("-------------------------");
		
		// 2. 산술연산자
		int result;
		
		//덧셈
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		//뺄셈
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		//곱셈
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		//나눗셈
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		double dresult = (double)num1 / num2;
		System.out.println("num1 / num2 = " + dresult);
		
		//나머지
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		System.out.println("------------------------");
		
		// 3. 복합대입연산자
		num3 = 100;
		num4 = 15;
		
		num3 += num4; // num3 = 100 + 15 = 115
		System.out.println(num3);
		
		num3 -= num4; // num3 = 115 - 15 = 100
		System.out.println(num3);
		
		num3 *= num4; //num3 = 100 * 15 = 1500
		System.out.println(num3);
		
		num3 /= num4; //num3 = 1500 / 15 = 100
		System.out.println(num3);
		
		num3 %= num4; //num3 = 100 % 15 = 10
		System.out.println(num3);
		System.out.println("--------------------------");
		
		// 4. 복합 산술연산자
		result = num1 + num2 / num3;
		System.out.println("num1 + num2 / num3 = " + result);
		
		result = (num1 + num2) / num3;
		System.out.println("(num1 + num2) / num3 = " + result);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
