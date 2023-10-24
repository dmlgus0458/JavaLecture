package chap04_controlstatement;

import java.util.Random;
import java.util.Scanner;

public class _17_RockScisserPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        //컴퓨터가 랜덤한 값을 가지고 있어야 한다.
        //랜덤 값을 만드는 방법 1.
        //Random 클래스 사용
        Random rd = new Random();
        int comRd2 = rd.nextInt(100); //0~99까지 랜덤하게 하나의 값 선택
        int comRd3 = rd.nextInt(100) + 1; //1~100까지 랜덤하게 하나의 값 선택
        
        //랜덤 값을 만드는 방법 2.
        //Math클래스에 있는 random()메소드 이용
        //randowm() 메소드는 0~1사이의 실수를 랜덤하게 선택
        //double형으로 반환000
        //0 <= comRd4 < 1
        double comRd4 = Math.random();
        
        //0이라서 의미 없는 값
        int comRd5 = (int)Math.random();
        
        //0 * 100 <= comRd6 < 1 * 100
        //0 <= comRd < 100
        //(int) 0 <= comRd < (int)100
        //0~99까지의 랜덤한 정수
        int comRd6 = (int)(Math.random() * 100);
        
        //0 <= comRd7 <= 99
        //0 + 1 <=comRd <= 99 + 1
        //0 <= comRd7 <= 100
        int comRd7 = (int)(Math.random() * 100) + 1;
        
        //0 <= comRd <3
        int comRd8 = (int)(Math.random() * 3);
        
        boolean isExit = false;
        
        int gameCnt = 0;
        int winCnt = 0;
        int drawCnt = 0;
        int loseCnt = 0;
        
        while(true) {
	        //가위(0) 바위(1) 보(2)
	        int comRd1 = rd.nextInt(3); //0, 1, 2중 하나를 랜덤하게 선택
	        System.out.println("가위, 바위, 보 중 하나를 입력하십시오.");
	        String input = sc.nextLine();
	        
	        int inputNum = 0;
	        
	        switch(input) {
	            case "가위":
	            	inputNum = 0;
	            	break;
	            case "바위":
	            	inputNum = 1;
	            	break;
	            case "보":
	            	inputNum = 2;
	            	break;
	            case "q":
	            	isExit = true;
	            	break;
	            default:
	            	System.out.println("잘 못 입력하셨습니다.");
	            	continue;
	        }
	        
	        if(isExit == true) {
	        	System.out.println("게임을 종료합니다.");
	        	System.out.println(" 총 " + gameCnt + " 전" + winCnt + " 승 " + drawCnt + " 무 " + loseCnt + " 패 " );
	        	break;
	        }
	        
	        switch(comRd1) {
	            case 0:
	            	System.out.println("컴퓨터: 가위");
	            	break;
	            case 1:
	            	System.out.println("컴퓨터: 바위");
	            	break;
	            case 2:
	            	System.out.println("컴퓨터: 보");
	            	break;
	        }
	        
	        
	        if(inputNum == comRd1) { //int값 두개를 비교함.
	        	drawCnt++;
	        	System.out.println("비겼습니다");
	        } else if((inputNum == 0 && comRd1 == 2) ||
	                (inputNum == 1 && comRd1 == 0) ||
	                (inputNum == 2 && comRd1 == 1)) {
	        	winCnt++;
	        	System.out.println("이겼습니다");
		        } else {
		        loseCnt++;
		        	System.out.println("패배했습니다.");
		        }
	        gameCnt++;
	        }
	      
		}

}
