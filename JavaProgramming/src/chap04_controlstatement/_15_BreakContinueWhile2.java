package chap04_controlstatement;

import java.util.Scanner;

public class _15_BreakContinueWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        //외부 while문을 종료시키기 위한 플래그 변수
        boolean isExit = false;
        
        while(true) {
        	System.out.println("1. 정보입력");
        	System.out.println("2. 종료");
        	
        	String userInput = sc.nextLine();
        	//switch~case~default 구문으로 변경
        	//switch~case~default도 break 사용 필수
        	switch(userInput) {
        	case "1":
        		System.out.println("이름을 입력하세요. (종료하려면 q 입력)");
        		while(true) {
        			System.out.println("이름을 입력하세요. (종료하려면 q 입력)");
        			String name = sc.nextLine();
        			
        			if(name.equals("q")) {
        				
        				break;
        			}
        		}
        		break;
        			
  
			case "2":
				isExit = true;
				System.out.println("프로그램을 종료합니다.");
				//switch문을 종료시키는 break;
				break;
		    default:
		    	System.out.println("잘 못 입력하셨습니다");
		    	continue;
        }
		if(isExit == true) {
			//외부 while문을 종료하는 break
			break;
		}
    //스캐너 객체 메모리에서 삭제시켜주는 역할
	
    	sc.close();
        }
	}
	
}
