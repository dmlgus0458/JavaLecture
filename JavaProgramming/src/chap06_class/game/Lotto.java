package chap06_class.game;

import java.util.Random;

public class Lotto {
	//속성값
	//1부터 ~ 45까지 랜덤 값 7개를 가질 배열
	//{0, 1, 2, 3, 4, 5, '6:보너스번호'}
	int[] lotto = new int[7];
	
	//보너스번호가 맞았는지 검사하는 변수
	public boolean bonus = false; //보너스 변수만 public으로 해주겠다.
	
	//기본생성자(배열에 랜덤값 7개 저장)
	public Lotto() {
		Random random = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			//i == 0, lotto[0] = 11;
			//i == 1, lotto[1] = 34;
			//i == 2, lotto[2] = 11;
			lotto[i] = random.nextInt(45) + 1; //1 ~ 45를 의미.
			
			//중복 제거
			if(i > 0) {
				if(isDuplicated(lotto, i)) {
					//i = 2
					i--;
					continue;
				}
			}
			
		}
	}

	//중복체크해주는 메소드
	public boolean isDuplicated(int[] arr, int idx) { //lotto로또번호, i배열번호
		
		for(int i = 0; i < idx; i++) {
			//i == 0       배열번호
			if(arr[idx] == arr[i]) {
			  //로또번호[배열번호] == 로또번호[for문i]
				return true;	//중복되면 true
			}
		}
		
		return false;	//중복안되면 false
	}
	
	//로또번호 출력하는 메소드
	public void printLottoNum() {
		System.out.print("이번주 로또 번호는 ");
		
		for(int i = 0; i < lotto.length; i++) {
			if(i == lotto.length - 1) {
				System.out.println("보너스 번호: " + lotto[i]);
			} else {
				System.out.print(lotto[i] + ", ");
			}
		}
	}
	
	//로또번호와 사용자번호 비교하는 메소드. 몇개 맞았는지 리턴하는 메소드.
	public int compareNum(int[] user) {
		int correctCnt = 0; //몇개 맞았는지 리턴할 변수를 만들었다.
		
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < user.length; j++) {
				//lotto[0] => user[0], user[1], ... user[5]
				//lotto[1] => user[0], user[1], ... user[5]
				//lotto[2] => user[0], user[1], ... user[5]
				//lotto[3] => user[0], user[1], ... user[5]
				//lotto[4] => user[0], user[1], ... user[5]
				//lotto[5] => user[0], user[1], ... user[5]
				//lotto[6] => user[0], user[1], ... user[5]
				if(lotto[i] == user[j]) {
					//번호를 맞춘 상황에서
					if(i == lotto.length -1) { //보너스가 맞는 경우라서 카운트를 안세줄 것이다.
						//lotto배열의 마지막 값이랑 같으면 보너스 번호가 맞는 상황
						//맞은 개수는 증가시키지 않고 bonus만 true로 바꿔줌
						bonus = true;
					} else {
						correctCnt++;
					}
				}
			}
		}
		
		return correctCnt; //int형태를 리턴해줘야 하는 메소드라서 리턴을 꼭 한다.
	}
	

}

















