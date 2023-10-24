package chap04_controlstatement;

import java.util.Scanner;

public class _14_WrongScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("1. 정보입력");
        	System.out.println("2. 종료");
        	
        	//nextInt는 enter값을 읽어오지 못하기 때문에 다음 nextLine()구문에서
        	//nextInt에서 입력한 enter값이 바로 읽히는 문제가 발생한다.
        	int userInput = sc.nextInt();
        	
        	//nextInt를 사용한 후 nextLine()으로 String 읽어오려면
        	//nextLine()을 사용해서 nextInt에서 입력된 enter값을 없애준다.
        	//아니면 통일된 형태의 값만 받도록 한다.(String이면 String, Int면 Int)
        	sc.nextLine();
        	
        	if(userInput == 1) {
        		while(true) {
        			System.out.println("이름을 입력하세요. (종료하려면 q 입력)");
        			String name = sc.next();
        			
        			if(name.equals("q")) {
        				break;
        			}
        		}
        	
        } else if(userInput == 2) {
        	System.out.println("프로그램을 종료합니다.");
        	break;
        } else {
        	System.out.println("잘 못 입력하셨습니다.");
        	continue;
        }
	}
    //스캐너 객체 메모리에서 삭제시켜주는 역할
	
	sc.close();
	}
	
}
