package chap02_variables;

public class _07_BooleanType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 사용자 id 생성
		String userId = "javabasic";
		
		//2. 사용자 id 유효성 검사 플래그 변수 생성
		boolean idValidation = false;
		
		//3. 사용자 id가 8자 이상 20자 이하면 유효성 통과
		if(userId.length() >= 8 && userId.length() <= 20) {
			idValidation = true;
		}
		
		//4. 유효성 통과했으면 
		if(idValidation == true) {
			System.out.println("사용할 수 있는 아이디입니다.");
		}
		//5. 유효성 통과하지 못했으면
		else {
			System.out.println("아이디는 8자 이상 20자 이하로 설정해주세요.");
		}
	}

}
