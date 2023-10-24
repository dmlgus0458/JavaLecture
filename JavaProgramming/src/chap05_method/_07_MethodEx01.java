package chap05_method;

import java.util.Scanner;

public class _07_MethodEx01 {
	
	//static이라는 키워드란, 자동으로 메모리에 생성된 메소드이다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		add(); //에러.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num1 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num2 = sc.nextInt();
		System.out.println("정수를 입력하세요.");
		int num3 = sc.nextInt();
		
		//사용자가 입력한 두 정수 중에 큰 수를 출력하는 메소드 compareTwoNum을 완성하세요.		
//		compareTwoNum (num1, num2);
		
		
		
		//사용자가 입력한 세 정수의 크기를 비교하여
		//최대값 : 100, 중간값: 72, 최소값: 50
		//출력하는 메소드 compareThreeNum을 완성하세요.
		compareThreeNum(num1, num2, num3);
		
		sc.close();
	}
	
//	public void add() {
//		
//	}
	
	//void 형태는 return을 가질 수 없어서 바로 출력하면 된다.
	public static void compareTwoNum(int a, int b) {
			
		if(a > b) { //조건이 참일 때 true라고 인식 하기 때문에 부등호를 넣기 않아도 된다.
			System.out.println("큰 숫자는 : " + a);
		} else if (a < b == true) {
		//else if (b > a) {  
			System.out.println("큰 숫자는 : " + b);
		} else if (a == b) {
			System.out.println("서로 같은 숫자 입니다.");
		} else {
			System.out.println("다시!!");
		}
		
	}
	
	
	//사용자가 입력한 세 정수의 크기를 비교하여
	//최대값 : 100, 중간값: 72, 최소값: 50
	//출력하는 메소드 compareThreeNum을 완성하세요.
	public static void compareThreeNum(int a, int b, int c) {
		
//		if(a>b && b>c) { 			
//			System.out.println("최대값 : "+a+", 중간값: "+b+", 최소값: "+c);			
//		}else if(b>a && a>c) {
//			System.out.println("최대값 : "+b+", 중간값: "+a+", 최소값: "+c);		
//		}else if(c>b && b>a) {
//			System.out.println("최대값 : "+c+", 중간값: "+b+", 최소값: "+a);		
//		}else if(b>a && a>c) {
//			System.out.println("최대값 : "+b+", 중간값: "+a+", 최소값: "+c);		
//		}
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		//if문에 걸리지 않으면 b>a조건이 true가 된다.
		if(a > b) {
			if(b > c) { 
			// a>b>c
				max = a;
				mid = b;
				min = c;
			} else if(a > c) { //c가 b보다 크다는 의미.
			// a>c>b
				max = a;
				mid = c;
				min = b;
			} else { //  c가 제일 크다는 의미.
			// c>a>b
				max = c;
				mid = a;
				min = b;
			}			
		} 
		//여기서 부터는 무조건 b가 a보다 크다는 전제이다.
		else if(a > c) { //b가 a보다 크다는 의미. 따라서 a랑 c만 비교하면 되겠지.
		// b>a>c	
			max = b;
			mid = a;
			min = c;
		} 
		//여기서 부터는 b>a && c>a 전제이다. a가 최소값이라는 의미.
		else if(b > c) { //b와 c가 a 보다 크다는 의미. 
		// b>c>a
			max = b;
			mid = c;
			min = a;
		} else { 
		//c>b>a
			max = c;
			mid = b;
			min = a;
		}
		
		System.out.println("최대값 : " + max + ", 중간값 : " + mid + ", 최소값 : " + min);
		
		
		
	}
	
	

}
