package chap04_controlstatement;

public class _12_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. for문의 continue
		for(int i = 0; i < 10; i++) {
			//0~4까지는 출력되지 않고
			//5부터 출력되도록
			if(i < 5) {
				continue;
		}
			System.out.println(i);
	}
	    //2. while 문의 continue
		int num = 0;
		
		while(num <= 100) {
			num++;
			
			//3의 배수만 제외하고 출력 continue 사용
			
			if(num % 3 == 0) {
				continue;
			}
				System.out.println(num);
			
		}
		
		
		
	}
}
