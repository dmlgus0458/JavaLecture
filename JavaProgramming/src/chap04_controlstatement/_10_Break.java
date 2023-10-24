package chap04_controlstatement;

public class _10_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //for문들이 몇 번씩 실행됐는지 저장 할 변수
		int outSideForCnt = 0;
		int inSideForCnt = 0;
		
		for(int i = 0; i < 5; i++) {
			//0, 1, 2일 때만 아래의 내용 실행되고
			//3일 때 외부 for은 종료
			if(i == 3) {
				break;
			}
			outSideForCnt++;
		
		    for(int j = 0; j < 5; j++) {
		    	if(i == 2) {
		    		break;
		    	}
		    	inSideForCnt++;
		    }
	}
		
        System.out.println(outSideForCnt);
        System.out.println(inSideForCnt);
	} 
}
