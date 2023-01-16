package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest01 {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10001, "이순신");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomer());
//		customerLee.setBonusRatio(0.5);
		System.out.println("--------");
		
		VIPCustomer customerKim = new VIPCustomer(1002, "김유신", 999);
		customerKim.bonusPoint = 1000;
		System.out.println(customerKim.showCustomer());
		System.out.println("--------");
		
		int price = 10000;
		System.out.println(customerKim.getCustomerName()+" "+customerKim.calcPrice(price)+"원 지불");
		System.out.println(customerLee.getCustomerName()+" "+customerLee.calcPrice(price)+"원 지불");

	}

}
