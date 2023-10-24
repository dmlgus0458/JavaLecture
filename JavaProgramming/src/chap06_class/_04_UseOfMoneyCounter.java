package chap06_class;

import java.util.Scanner;

import chap06_class.money.MoneyConuter;

public class _04_UseOfMoneyCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoneyConuter mc = new MoneyConuter();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int a = sc.nextInt();		
//		int a = 78970;
		
		mc.getMoneyInput(a); //실질적으로 동작시키는 것이다.
		
		mc.printMoneyCount();
		
		sc.close();
	}

}
