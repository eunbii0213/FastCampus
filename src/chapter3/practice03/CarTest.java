package chapter3.practice03;

public class CarTest {

	public static void main(String[] args) {
		
		Car ai = new AICar();
		ai.run();
		
		System.out.println("");
		
		Car car = new ManualCar();
		car.run();
		
		

	}

}
