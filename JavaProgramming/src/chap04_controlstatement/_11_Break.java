package chap04_controlstatement;

import java.util.Scanner;

public class _11_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        while(true) {
        	System.out.println("1. 정보입력");
        	System.out.println("2. 종료");
        	
        	String userInput = sc.nextLine();
        	
        	if(userInput.equals("l")) {
        		while(true) {
        			System.out.println("이름을 입력하세요. (종료하려면 q 입력)");
        			String name = sc.nextLine();
        			
        			if(name.equals("q")) {
        				break;
        			}
        		}
        	
        } else if(userInput.equals("2")) {
        	System.out.println("프로그램을 종료합니다.");
        	break;
        }
	}
    //스캐너 객체 메모리에서 삭제시켜주는 역할
	
	sc.close();
	}
	
}
