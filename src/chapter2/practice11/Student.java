package chapter2.practice11;

public class Student {
	int money;
	String name;
	
	public Student(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public void takeTaxi(int money) {
		this.money-=money;
	}
	
	public void showStudentInfo() {
		System.out.println(name+"님의 남은 돈은 "+money+"원 입니다.");
	}
}
