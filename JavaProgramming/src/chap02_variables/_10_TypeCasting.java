package chap02_variables;

public class _10_TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 자동 형변환1
		//   byte 크기가 작은 타입에서 byte 크기가 큰 타입으로는 자동 형변환한다.
		short sNum1 = 10;
		
		int iNum1 = sNum1;
		
		//2. 자동 형변환2
		//	 좀 더 세밀한 표현 범위를 갖는 타입으로 자동 형변환한다.(정수->실수)
		long lNum1 = 1000000L;
		
		float fNum1 = lNum1;
		
		//3. 강제 형변환
		//   byte 크기가 작은 타입으로 변환할 때는 타입을 명시한다.
		int iNum2 = 20;
		
		short sNum2 = (short)iNum2;
		
		int unicode = 65;
		System.out.println("유니코드 값 : " + unicode);
		
		char ch = (char)unicode;
		System.out.println(ch);
		
		//   덜 세밀한 표현 범위를 갖는 자료형으로 변환할 때도 타입을 명시한다.
		float fNum2 = 3.14f;
		long lNum2 = (long)fNum2;
		
		// 4. 연산에서의 형변환
		//    연산되는 값 중 byte 크기가 큰 타입으로 변환된 후 연산이 진행된다.
		long result1 = lNum2 + iNum2;
		
		// 강제 형변환을 이용해서 작은 크기의 타입으로 변환한 후 연산을 진행할 수도 있다.
		int result2 = (int)lNum2 + iNum2;
		int result3 = (int)(lNum2 + iNum2);
		
		// 5. 문자열 결합 연산에서의 형변환
		String str = "java";
		int version = 17;
		
		String result4 = str + version;
		
		System.out.println(str + version);
	}

	
	
	
	
	
	
	
	
	
	
}
