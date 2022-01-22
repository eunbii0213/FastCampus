package chapter3.practice02;

public abstract class Computer {
	
	public abstract void display();
	public abstract void typing();
	
	void turnOn() {
		System.out.println("전원 On");
		
	}
	
	void turnOff() {
		System.out.println("전원을 끕니다");
	}
	
}
