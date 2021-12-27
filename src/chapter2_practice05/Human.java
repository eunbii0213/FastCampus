package chapter2_practice05;

public class Human {
	
	public int height;
	public double weight;
	public int age;
	public String name;
	
	public String showInfo() {
		return "이름 : "+name+", 나이 : "+age+", 키 : "+height+", 몸무게 : "+weight;
	}
}
