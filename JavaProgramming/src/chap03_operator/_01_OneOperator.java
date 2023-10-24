package chap03_operator;

public class _01_OneOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 부호연산자
		int num1 = 10;
		
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println("-------------------");
		
		// 2. 증감연산자
		// 2-1. 전위 증감연산자
		int num2 = 20;
		
		//num2 = 21
		if(++num2 > 20) {
			System.out.println("num2는 20보다 큽니다.");
		}
		
		//num2 - 1 => 20
		System.out.println(--num2); //출력: 20, num2: 20
		System.out.println("-------------------");
		
		// 2-2. 후위 증감연산자
		int num3 = 20;
		
		if(num3++ > 20) {
			System.out.println("num3는 20보다 큽니다.");
		}
		
		//num3 = 21
		System.out.println(num3--); //출력: 21, num3: 20
		System.out.println("-------------------");
		
		//3. 전위, 후위 증감연산자 혼합
		int num4 = 10;
		//증감연산를 이용해서
		//11
		//출력: 11, num4: 11
		System.out.println(++num4);
		//12
		//출력: 12, num4: 12
		System.out.println(++num4);
		//12
		//출력: 12, num4: 11
		System.out.println(num4--);
		//10
		//출력: 10, num4: 10
		System.out.println(--num4);
		//10
		//출력: 10, num4: 9
		System.out.println(num4--);
		//8
		//출력: 8, num4: 8
		System.out.println(--num4);
		//출력되도록
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
