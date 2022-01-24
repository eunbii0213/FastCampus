package chapter3.practice04;

public class CalculatorTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.abs(num1,num2));
		System.out.println(calc.multiple(num1,num2));
		System.out.println(calc.divide(num1,num2));
		//calc에 정의된 method만 쓸 수 있음
		
		
	}

}
