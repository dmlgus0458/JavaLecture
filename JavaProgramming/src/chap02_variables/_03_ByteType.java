package chap02_variables;

public class _03_ByteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. byte 타입의 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		//2. 범위를 넘어가는 값을 할당했을 때는 에러 발생
//		byte num3 = -129;
//		byte num4 = 128;
		
		//3. 할당된 값을 범위를 초과하는 값으로 변경
		//증감연산자(++, --)
		//num1++; => num1 = num1 + 1;
		//num1--; => num1 = num1 - 1;
		
		//num1-- => num1 = -128 - 1;
		//                 1000 0000 - 1
		//                 0111 1112 - 1
		//                 0111 1111 => 127
		num1--;
		System.out.println(num1);
		//num2++ => num2 = 127 + 1;
		//                 0111 1111 + 1
		//                 1000 0000 => -128
		num2++;
		System.out.println(num2);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
