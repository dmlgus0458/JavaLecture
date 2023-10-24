package chap06_class.student;

public class Student {
	
	//속성
	//이름, 학번, 학과
	public String name;
	public int sid; 
	public String major;
	
	//기본생성자 //주의 : 항상 클래스 이름과 동일하게해야 한다.
	public Student() {
		
	}
	
	//이름, 학번, 학과 모두를 초기화하는 생성자(매개변수가 있는 생성자)
	//무조건 생성자는 클래스명과 동일하게 해야한다.
	public Student(String name, int sid, String major) {
		this.name = name;
		this.sid = sid;
		this.major = major;
	}
	
	//학생의 정보를 출력하는 메소드
	public void studentInfo() { //첫글자 소문자로
		System.out.println("이름: " + this.name); //이렇게 써도 되고 this.name
		System.out.println("학번: " + sid);    //이렇게 써도 된다. sid <- 여기서 sid는 맨위에 선언해준 sid를 가리킨다.
		System.out.println("학과: " + major);
	}
}
