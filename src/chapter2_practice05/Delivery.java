package chapter2_practice05;

public class Delivery {
	
	public String orderNumber; //주문접수번호
	public int customerPhoneNumber;
	public String customerAddress;
	public int orderDate;
	public int orderTime;
	public int totalPrice;
	public int menuNumber;//메뉴 번호 
	
	public Delivery(String orderNumber, int customerPhoneNumber, String customerAddress, int orderDate, int orderTime,int totalPrice,int menuNumber) {
		this.orderDate = orderDate;
		this.orderNumber = orderNumber;
		this.customerAddress = customerAddress;
		this.customerPhoneNumber = customerPhoneNumber;
		this.menuNumber = menuNumber;
		this.totalPrice = totalPrice;
		this.orderTime = orderTime;
	}
	
	public void showInfo() {
		
		System.out.println("주문 접수 번호 : " + orderDate);
		System.out.println("주문 핸드폰 번호 : " + customerPhoneNumber);
		System.out.println("주문 집 주소 : " + customerAddress);
		System.out.println("주문 날짜 : " + orderDate);
		System.out.println("주문 시간 : " + orderTime);
		System.out.println("주문 가격 : " + totalPrice);
		System.out.println("메뉴 번호 : " + menuNumber);
		
	}
}
