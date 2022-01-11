package chapter2.practice14;

public class CarFactory {
	private static CarFactory carFactory = new CarFactory();
	
	
	private CarFactory() {
		
	}
	
	public Car createCar() {
		
		Car car = new Car();
		return car;

	}
	
	public static CarFactory getInstance() {
		return carFactory;
	}
	
	
}
