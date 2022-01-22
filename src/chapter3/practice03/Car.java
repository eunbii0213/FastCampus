package chapter3.practice03;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void turnOn() {
		System.out.println("시동 on");
		
	}
	
	public void turnOff() {
		System.out.println("시동 off");
		
	}
	
	public void washCar() {}
	
	final public void run() {
		
		turnOn();
		drive();
		wiper();
		stop();
		turnOff();
		washCar();
	}
}
