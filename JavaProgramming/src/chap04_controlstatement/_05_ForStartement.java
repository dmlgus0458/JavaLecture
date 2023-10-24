package chap04_controlstatement;

public class _05_ForStartement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. 1~100까지의 합
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
		}
		
		
		System.out.println("1~100까지의 합은 :  " + sum);
		System.out.println("마지막 i 값 " + i);
        System.out.println("----------------");	
				
	    //2. 1~100까지의 정수중에 2, 3의 공배수만 출력 (for문과 if문을 조합)
		for(int j = 1; j <= 100; j++) {
			if (j % 2 == 0 && j % 3 == 0) {
			    System.out.println(j);
			}     
		}
	    System.out.println("----------------");	
			
        //3. 10~1까지 거꾸로 출력
	    for(int k = 10; k >1; k-- ) {
	    	System.out.println(k);
	    }
	    System.out.println("----------------");	
	    
	    //4. for문 변형
	    //for 무한 루프를 만들고 1~1000까지의 합을 출력
	    int l = 1;
	    int sum2 = 0;
	    
	    for( ; ; ) {
	    	sum2 += l;
	        l++;
	    	if(l > 1000) {
	    	   break;
	    	}
	    }	
	    System.out.println("1~1000까지의 합 : " +  sum2);
	    System.out.println("----------------");	
	    
	     //5. 정수 312의 모든 약수를 구하시오
	    int num = 312;
	    for(int p = 1; p <= num; p++) {
	    	if (312 % p == 0) {
	    		System.out.println(p);
	    	}
	    }
	    System.out.println("----------------");	
	    
	    //임의. 100부터 200까지의 합 for
	    int cum = 0;
	    int o;
	    
	    for(o = 100; o <=200; o++) {
	    	cum += o;
	    			
	    	
	    }
	    System.out.println("100부터 200까지의 합" + cum);
	    
	    
	}
}