package chapter3.practice03;

public class AICar extends Car {
	
	
	@Override
	public void drive() {
		System.out.println("자율주행을 합니다");
		
	}

	@Override
	public void stop() {
		System.out.println("자율주행을 멈춥니다");
	}

	@Override
	public void wiper() {
		// TODO Auto-generated method stub
		
	}
	
	public void washCar() {
		System.out.println("세차합니다");
	}

}
