package chap04_controlstatement;

public class _06_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 10~1까지 거꾸로 출력(while 사용)
		int i = 10;
		while(i >= 1) {
			System.out.println(i--);
		}
		
		//2. 1~100까지 정수중 4, 5의 공배수만 출력(while 사용)
		int j = 1;
		while(j <= 100) {
			if(j % 4 == 0 && j % 5 == 0 ) {
				System.out.println(j);
				j++;
			}
		}
		
	}

}
