package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest02 {

	public static void main(String[] args) {
		//부모 = 자식 (자동형변환)
		Customer vc = new VIPCustomer(1003, "김김", 20000);
		//포괄적인 상위클래스 = 상속받은 클래스 로 사용하는 것도 가능함
		System.out.println(vc.showCustomer()); // VIP를 읽는다
		

	}

}
