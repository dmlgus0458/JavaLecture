package chap04_controlstatement;

//ctrl + shift + o => 자동 임포트
//기본으로 제공되는 클래스를 제외한 클래스들을 사용하려면 import구문으로 참조하여 사용한다.
import java.util.Scanner;

public class _07_infinitewhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Scanner: 사용자가 입력한 값을 받아 올 수 있는 클래스
		Scanner sc = new Scanner(System.in);
			
		
//		System.out.println("정수를 입력하세요.");
//		int num = sc.nextInt();
//		
//		System.out.println("사용자가 입력한 정수는 : " + num);
		
		while(true) {
		   System.out.println("문자열을 입력하세요.");
		   //문자열을 받는 메소드는 두가지: next(), nextline()
		   String str = sc.nextLine();
		
		   System.out.println("사용자가 입력한 문자열 : " + str);
		   
		   
		   //사용자가 q를 입력했을때 while문이 종료 (프로그럄이 종료됩니다.라는 문구 출력) // ==은 주소를 비교, equals는 값을 비교.
		   if(str.equals("q")) {
			   System.out.println("프로그램이 종료됩니다.");
			   break;
		   }
		   
		}
			sc.close();
    }
	
}
