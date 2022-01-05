package chapter2.practice11;

public class Taxi {
	int earnMoney;
	String brand;
	
	public Taxi (String brand) {
		this.brand = brand;
	}
	
	public void takeTaxi(int earnMoney) {
		this.earnMoney += earnMoney;
	}
	
	public void showTaxiInfo() {
		System.out.println(brand+" 수입은 "+earnMoney+" 입니다.");
	}
}
