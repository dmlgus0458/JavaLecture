package chap06_class;

import java.util.Scanner;

import chap06_class.game.Lotto;

public class _07_UseOfLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		
		int[] user = new int[6];
		
		Scanner sc = new Scanner(System.in);
		
		//로또 결과
		lotto.printLottoNum();

		//사용자가 번호 입력하게 하기
		for(int i = 0; i < user.length; i++) {
			System.out.println("1~45 중 정수 하나를 입력하세요.");
			user[i] = sc.nextInt();
			
			if(user[i] < 1 || user[i] > 45) {
				System.out.println("잘못 입력하셨습니다.");
				i--;
				continue;
			} else {
				//중복제거
				if(i > 0) {
					if(lotto.isDuplicated(user, i)) {
						System.out.println("중복된 값이 존재합니다. 다시 입력하세요.");
						i--;
						continue;
					}
				}
			}
					
		}
		
		
		//로또번호와 사용자 번호 비교
		int correctCnt = lotto.compareNum(user);
		
		if(correctCnt == 6) {
			System.out.println("1등 입니다.");
		} else if(correctCnt == 5) {
			if(lotto.bonus) {
				System.out.println("2등 입니다.");
			} else {
				System.out.println("3등 입니다.");
			}
		} else if(correctCnt == 4) {
			System.out.println("4등 입니다.");
		} else if(correctCnt == 3) {
			System.out.println("5등 입니다.");
		} else {
			System.out.println("꽝");
		}
		
		sc.close();	
		
	}

}





















