package chap02_variables;

public class _01_Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수의 선언
		//1-1. 변수는 '자료형 변수명' 형태로 선언
		//좋아요 개수를 저장하는 변수
		int likeCnt;
		//로그인한 사용자가 좋아요를 눌렀는지 검사하는 변수
		boolean isUserLike;
		
		//1-2. 첫 글자는 문자, $, _만 허용된다.
		int $price;
		int _bit;
		int bitJavaBasic;
		
		//문자, $, _가 아닌 문자를 첫글자로 선언하면 에러발생
		//ctrl + /: 단일 행 주석처리
		//ctrl + shift + /: 다중 행 주석처리
		/*
		 * int %bit; int 2023year; int @coding;
		 */
		
		//1-3. 카멜케이스 표기법 사용
		//게시물 개수
		int boardCnt;
		//출력장치의 출력회수
		int outPrintCnt;
		
		//1-4. 변수의 대소문자 구분
		//점심시간
		int lunchTime;
		int lunchtime;
		int luNchTiMe;
		
		//1-5. 본인만 알아볼수 있는 변수명은 사용하지 않는다.
		int aaa;
		int bbb;
		
		//2. 변수의 사용
		//2-1. 변수의 초기화: 최초 값 할당(저장, 대입)
		likeCnt = 125;
		System.out.println("likeCnt : " + likeCnt);
		
		//2-2. 변수 값의 재할당(값을 변경)
		//상수가 아닌 변수의 값은 변경가능하다.
		likeCnt = 10;
		System.out.println("likeCnt : " + likeCnt);
		
		//2-3. 변수의 선언과 동시에 초기화
		int studentCnt = 9;
		System.out.println("studentCnt : " + studentCnt);
		
		//2-4. 초기화되지 않은 변수 사용 시 에러 발생
		int errorVal;
		//System.out.println(errorVal);
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
