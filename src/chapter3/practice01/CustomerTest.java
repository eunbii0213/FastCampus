package chapter3.practice01;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer lee = new Customer();
		lee.setName("Lee");
		lee.setId(10010);
		lee.bonusPoint=1000;
		
		int price = lee.calcPrice(1000);
		System.out.println("lee price : "+price);
		System.out.println(lee.showCustomerInfo());
		
		
		VIPCustomer kim = new VIPCustomer();
		kim.setName("Kim");
		kim.setId(10020);
		kim.bonusPoint=10000;
		
		price = kim.calcPrice(1000);
		System.out.println("kim price : "+price);
		System.out.println(kim.showCustomerInfo());
		
		
		ArrayList<Customer> list = new ArrayList<Customer>();
		
		Customer t = new Customer("tomas",10010); 
		Customer l = new Customer("lisa",10020);
		Customer d = new GoldCustomer("diana",10030);
		Customer k = new GoldCustomer("kevin",10040);
		Customer j = new VIPCustomer("judith",10050);
		
		list.add(t);
		list.add(l);
		list.add(d);
		list.add(k);
		list.add(j);
		
		for(Customer customer : list) {
			
			price=1000;
			System.out.println(customer.showCustomerInfo());
			
			int cost = customer.calcPrice(price);
			System.out.println(cost);
		}
		
	}

}
