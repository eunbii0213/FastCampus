package chapter3.practice01;

public class VIPCustomer extends Customer{
	
	double salesRatio;
	int agentID;
	
	public VIPCustomer() {
		
		grade ="VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public VIPCustomer(String name, int id) {
		
		super(name, id);
		grade ="VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	public int getAgentID() {
		return agentID;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint+=price*bonusRatio;
		price -=(int)price*salesRatio;
		return price;
	}
	
	

}
