package chap05_method.calc;

public class ParameterCalculator {
	public void add(int a, int b) {
		System.out.println(a + b);
	}
	
	public double div(int a, int b) {
		return (double)a / b;
	}
	
	public String addString(String a, String b) {
		return a + " " + b;
	}

}
