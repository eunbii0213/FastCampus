package chapter3.practice01;

public class Customer {
	private int id;
	private String name;
	protected String grade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		
		grade= "silver";
		bonusRatio=0.01;
	}
	
	public Customer(String name, int id) {
		this.name = name;
		this.id= id;
		
		grade= "silver";
		bonusRatio=0.01;
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return name +"님의 등급은 "+ grade +"이며, 보너스 포인트는 "+ bonusPoint+"입니다. ";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
}
