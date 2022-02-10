package chapter5.practice02;

public class Powder extends Material{
	
	public String toString() {
		return "재료는 powder 입니다";
	}

	@Override
	public void doPrinting() {
		System.out.println("powder printing");
		
	}
	
	
}
