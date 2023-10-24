package chap04_controlstatement;

public class _09_DuplicatedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 2~9단까지 구구단 출력
		for(int i = 2; i <=9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.print(i + " * " + j + " = " + (i * j) + "    ");
			}
			System.out.println();
		}
		
		//2. * 세로 5줄 가로 5줄
	
		for(int o = 1; o <= 5; o++) {
			for(int q = 1; q <= 5; q++) {
				System.out.print(" * ");
			}
			System.out.println();
			
		}
		
		//3. * 가로 1~5줄까지 (중첩 for문에서 조건을 걸어서 출력)
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				if(i >= j)
			System.out.print(" * ");
			}	
			System.out.println();
		}
	}

}
