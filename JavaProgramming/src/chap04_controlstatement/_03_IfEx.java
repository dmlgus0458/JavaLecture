package chap04_controlstatement;

public class _03_ifEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 111;
		int num2 = 322;
		int num3 = 471;
		
		int evenCnt = 0;	//짝수
		int oddCnt = 0;		//홀수
		
		//num1, num2, num3이 짝수인지 홀수인지 판단하는 if구문을 완성하고 짝수의 개수와
		//홀수의 개수를 출력하세요.		
		/*
		int namuge = 0;
		namuge = num1 %= 2;
		System.out.println(namuge);
		*/		
		if(num1 %2 == 0) {
			System.out.println("num1은 짝수입니다.");
			evenCnt++;
		} else {
			System.out.println("num1은 홀수입니다.");
			oddCnt++;
		}
		
		if(num2 %2 == 0) {
			System.out.println("num2은 짝수입니다.");
			evenCnt++;
		} else {
			System.out.println("num2은 홀수입니다.");
			oddCnt++;
		}
		
		if(num3 %2 == 0) {
			System.out.println("num3은 짝수입니다.");
			evenCnt++;
		} else {
			System.out.println("num3은 홀수입니다.");
			oddCnt++;
		}
		
		System.out.println("짝수 : " + evenCnt);
		System.out.println("홀수 : " + oddCnt);
		
	}

}
