package chap05_method.game;

import java.util.Random;
import java.util.Scanner;

public class NumBaseball {
	//게임 : 무한도전 숫자야구
	//게임 룰: 컴퓨터가 3개의(0~9) 랜덤 값을 가지고 012~987
	// 		 사용자가 3개의 정수입력 012~987
	// 		 컴퓨터의 3개의 정수값과 사용자가 입력한 3개의 정수 값을 비교
	//		 숫자와 위치까지 같으면 스트라이크
	//       위치는 다르지만 숫자는 같으면 볼
	//       3스트라이크(3개의 숫자와 위치까지 맞혀야) 끝나는 게임
	//       컴퓨터 123 -> 사용자 534 1볼 -> 사용자 312 3볼 
	//			 -> 사용자 134 1스트라이크 1볼 -> 사용자 123 3스트라이크 게임종료


//--매개변수가 없는 생성자 설명-----------------------------------------------
//	매개변수 없는 생성자를 : '기본 생성자'라고 한다. 생성자를 따로 정이ㅡ하지 않아도 제공되는 생성자.	
//	public NumBaseball() {
//		int strike = 10;
//		int ball = 10;
//	}
//----------------------------------------------------------------------
	
	
	
	
//--매개변수가 잇는 생성자 설명-----------------------------------------------
//	매개변수가 있는 생성자를 사용하려면 항상 클래스내에 정의를 해야한다.
//	주의할 점 : 매개변수가 있는 생성자를 정의하면 기본 생성자가 제공되지 않는다. 때문에 기본 생성자도 함께 정의해주는 것이 좋다.
//	public NumBaseball() {
//		
//	}
//	
//	public NumBaseball(int a, int b) {
//		this.strike = a;
//		this.ball = b;
//	}
//---------------------------------------------------------------------
	
	
	
	
	//필요한 변수 선언
	//스트라이크와 볼의 개수를 저장할 변수
	private int strike = 0;
	private int ball = 0;
	
	//랜덤값 3개의 정수를 담아줄 배열
	//배열의 형태 : {int, int, int}
	//{1, 2, 3}
	int[] com = new int[3];
	
	//사용자가 입력한 3개의 정수를 담아줄 배열
	//{5, 4, 1}
	int[] user = new int[3];
	

	private Scanner sc = new Scanner(System.in);
	
	//게임 시작하는 메소드
	public void start() {
		for(int i = 0; i < com.length; i++) {
			com[i] = generateRandom();
			
			//중복 체크
			if(i > 0) {
				if(isDuplicated(com, i)) {
					i--;
					continue;
				}
			}
		}
		
		while(true) {
			strike = 0;
			ball = 0;
			
			//컴퓨터 숫자 확인
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);
			
			getUserInput();
			
			//사용자 숫자 확인
			System.out.println(user[0] + ", " + user[1] + ", " + user[2]);
			
			//스트라이크 볼 판정
			judgeStrike();
			
			if(strike == 3) {
				System.out.println("3스트라이크 아웃. 게임을 종료합니다.");
				break;
			} else {
				System.out.println(strike + "스트라이트, " + ball + "볼");
			}
		}
		
		sc.close();
	}
	
	//랜덤 값을 생성하는 메소드
	public int generateRandom() {
		Random rd = new Random();
		return rd.nextInt(10);
	}
	
	//세 개의 값에 중복이 있는 지 없는 지 검사하는 메소드
//	public boolean isDuplicated(int idx) {
//		for(int i = 0; i < idx; i++) {
//			//현재 idx에 저장된 값과
//			//현재 idx보다 작은 위치에 저장된 값들을 비교
//			if(com[idx] == com[i]) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
//	
//	public boolean isDuplicated2(int idx) {
//		for(int i = 0; i < idx; i++) {
//			//현재 idx에 저장된 값과
//			//현재 idx보다 작은 위치에 저장된 값들을 비교
//			if(user[idx] == user[i]) {
//				return true;
//			}
//		}
//		
//		return false;
//	}
	
	public boolean isDuplicated(int[] arr, int idx) {
		for(int i = 0; i < idx; i++) {
			//현재 idx에 저장된 값과
			//현재 idx보다 작은 위치에 저장된 값들을 비교
			if(arr[idx] == arr[i]) {
				return true;
			}
		}
		
		return false;
	}
	
	//사용자의 입력값을 받아서 user 배열에 저장해주는 메소드(중복제거 포함)
	public void getUserInput() {
		
		for(int i = 0; i < user.length; i++) {
			System.out.println("정수를 입력하세요.");
			user[i] = sc.nextInt();
			
			//중복제거
			if(i > 0) {
				if(isDuplicated(user, i)) {
					System.out.println("중복된 값이 존재합니다. 다시 입력해주세요.");
					i--;
					continue;
				}
			}
		}
	}
	
	//스트라이크 볼 판정해주는 메소드
	public void judgeStrike() {
		for(int i = 0; i < com.length; i++) {
			for(int j = 0; j < user.length; j++) {
				//값이 같고
				//com = {1, 2, 3}
				//user = {4, 5, 1}
				//배열에서 해당 index의 값을 가져오는 방식
				//com[index]
				if(com[i] == user[j]) {
					//위치까지 같으면 strike
					if(i == j) {
						strike++;
					}
					//위치가 다르면
					else {
						ball++;
					}
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
