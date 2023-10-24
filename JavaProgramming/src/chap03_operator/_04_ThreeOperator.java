package chap03_operator;

public class _04_ThreeOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 삼항 조건연산자
		int num1 = 111;
		int num2 = 10;
		
		//                   true => num1 - 11이 실행 => result = 100;
		int result = num1 / num2 > 0 ? num1 - 11 : num2 - 11;
		System.out.println(result);
		
		//          false => num1 / 10이 실행 => result = 11
		result = num1 < 100 ? num1 * 10 : num1 / 10;
		System.out.println(result);
		
		// 2. 삼항 조건연산자의 중첩
		//           A
		result = num1 / num2 > 8
				?
					//     B 
					//     a
					num1 - 11 == 100 
					?
						// b
						num1 * 2
					:
						// c
						num1 / 2
				:
					//    C
					num2 - 11 < 0
					?
						num2 * 2
					:
						num2 / 2
				;
		System.out.println(result);
		System.out.println("---------------------");
		
		// 3. 대문자는 소문자로 소문자는 대문자로 바꿔서 출력
		char ch = 'A';
		
		//삼항 연산자로 대문자(ch가 A~Z)면 +32 => 소문자
		//          소문자(ch가 a~z)면 -32 => 대문자
		
		char convertCh = ch >= 'A' && ch <= 'Z'
						?
							(char)(ch + 32)
						:
							(char)(ch - 32);
		
		System.out.println(convertCh);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
