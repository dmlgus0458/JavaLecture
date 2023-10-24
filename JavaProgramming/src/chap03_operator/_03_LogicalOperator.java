package chap03_operator;

public class _03_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 관계연산자
		int num1 = 110;
		int num2 = 215;
		
		System.out.println("num1 < num2 : " + (num1 < num2));
		System.out.println("num1 <= num2 : " + (num1 <= num2));
		System.out.println("num1 > num2 : " + (num1 > num2));
		System.out.println("num1 >= num2 : " + (num1 >= num2));
		System.out.println("num1 == num2 : " + (num1 == num2));
		System.out.println("num1 != num2 : " + (num1 != num2));
		
		//==, != 기본자료형의 값 비교에서만 사용된다.
		//기본자료형만 stack 영역에 값이 직접 저장되기 때문이다.
		//참조형 타입 값들은 equals 메소드를 통해서 값의 비교를 진행한다.
		String str1 = "hello1";
		String str2 = new String("hello");
		String str3 = "hello1";
		
		System.out.println("str1 == str3 : " + (str1 == str3));
		System.out.println("str1.equals(str2) : " 
										+ str1.equals(str2));
		
		// 2. 논리연산자
		int num3 = 10;
		int num4 = 33;
		
		boolean result;
		
		result = num1 < num2 && num3 / num4 == 0; // true && true => true
		System.out.println("num1 < num2 && num3 / num4 : " + result);
		
		result = false || num2 < 100; // false || false => false
		System.out.println("false || num2 < 100 : " + result);
		
		result = !(num4 > 2000); //!false => true
		System.out.println("!(num4 > 2000) : " + result);
	}

	
	
	
	
	
	
	
	
	
}
