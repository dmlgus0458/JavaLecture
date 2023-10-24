package chap02_variables;

public class _04_CharType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. char 타입의 변수 선언 및 초기화
		char ch1 = 'A';
		//유니코드 값을 알고 있을 때는 유니코드 값을 직접 할당 가능
		char ch2 = 65;
		
		System.out.println("ch1 : " + ch1);
		System.out.println("ch2 : " + ch2);
		
		//2. 유니코드를 모르는 문자의 유니코드 값을 추출하는 방법
		//   문자 하나만 담는 char 형태의 변수에는 작은따옴표를 사용
		//   문자 여러개가 합쳐진 문자열은 큰따옴표를 사용
		int unicode = '자';
		String str = "자바";
		System.out.println("자의 유니코드 값 : " + unicode);
		
		//3. 유니코드에는 완전한 빈칸이 존재하지 않기 때문에 빈칸을 사용할 때는
		//   스페이스를 입력한다.
		//char ch3 = ''; //에러
		char ch3 = ' ';
		//문자열은 완전 빈칸의 값을 가질 수 있다.
		String str2 = "";
	}

	
	
	
	
	
	
	
	
	
	
}
