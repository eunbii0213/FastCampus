package chapter3.practice04;

public abstract class Calculator implements Calc{

	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int abs(int num1, int num2) {
		
		return num1-num2;
	}

	
	

}
