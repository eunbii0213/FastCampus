package chapter2.practice14;

public class Car {
	private  int carId;
	private static int id=10000;
	
	public Car(){
		
		carId = ++id;
	}
	
	
	public int getCarNum() {
		return carId;
	}
	
	
}
