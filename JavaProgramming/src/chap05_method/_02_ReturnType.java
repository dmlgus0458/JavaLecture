package chap05_method;

import chap05_method.calc.ReturnCalculator;

public class _02_ReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnCalculator rcalc = new ReturnCalculator();
		
		//기능만 하는 메소드(결과값이 없는 메소드)의 호출
		rcalc.add();
		
		//결과 값이 있는 메소드의 호출
//		rcalc.div(); //이렇게 해도 에러는 안난다. 이렇게 호출하면 결과가 2.0이 메인메소드에 호출된다음에 사라지게 되겠지. 
		//위에 이것만 하면 에러는 발생하지 않으나 의미없는 행동이 되겠다.
		
		//그래서 위를 의미있는 값으로 사용하려면, double타입으로 변수를 만들어서 결과를 선언해서 받아주시거나, 
		double dNum = rcalc.div(); 

		
		//결과를 출력해서 사용하면 되겠지.
		System.out.println(rcalc.div());
		
		System.out.println(dNum);
		System.out.println(10 + dNum); 	
		//그래서 결과값이 있는 메소드 들은 항상 변수에 저장하는 것이 좋겠다. 그래야 이것저것 활용해서 쓸 수 있을 테니까.
		
		String str = rcalc.hello();
		System.out.println(str);
		
		
	}

}
