package chap06_class.phone;

public class PhoneInfo {
	//속성값 //항상 변수먼저 입력한다.
	//이름 100개 배열
	String[] name = new String[100];
	//전화번호 100개 배열
	String[] phone = new String[100];
	
	//배열의 현재 인덱스를 가지고 있는 변수
	int currentIdx = 0;
	
	
	//기능들
	//이름과 전화번호를 받아서 배열에 저장하는 메소드
	public void savePhoneInfo(String name, String phone) {
		this.name[currentIdx] = name;
		this.phone[currentIdx] = phone;
		currentIdx++;	
	}
	
	//저장된 모든 연락처 출력하는 메소드
	public void printAllPhoneInfo() {
		for(int i = 0; i < currentIdx; i++) {
			System.out.println("이름: " + name[i] + ", 번호: " + phone[i]);
		}
	}
	
	
}
