package chapter3.practice01;

public class GoldCustomer extends Customer{
	
	double salesRatio;
	
	public GoldCustomer(String name, int id) {
		super(name,id);
		
		grade = "Gold";
		salesRatio = 0.05;
		bonusRatio = 0.02;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += price *bonusRatio;
		return price -(int)(price*salesRatio);
	}
	
	

}
