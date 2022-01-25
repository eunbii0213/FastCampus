package chapter3.practice06;

public class CompleteCalc extends Calculator{

	@Override
	public int divide(int num1, int num2) {
		if(num2==0 || num1 ==0) {
			return ERROR;
		}
		
		return num1/num2;
	}

	@Override
	public int multiple(int num1, int num2) {
	
		return num1*num2;
	}
	
	public void showInfo() {
		System.out.println("모두 구현함 ");
	}
	
	public void description() {
		System.out.println("overriding");
	} //default method

}
