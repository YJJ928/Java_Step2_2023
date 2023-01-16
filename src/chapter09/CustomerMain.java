package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		//VIP고객
		
		System.out.println("-----VIP고객-----");
		int price = 10000;
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipPrice = vipcs.calcPrice(price);
		System.out.println(vipcs.showCustomer());
		System.out.println(vipcs.getCustomerName()+"님이 "+vipPrice+"원을 지불하였습니다.");
		
		System.out.println("-----일반고객-----");
		
		price = 10000;
		Customer cs = new Customer(1001, "김김김");
		//cs.setCustomerID(1001);
		int nPrice = cs.calcPrice(price);
		System.out.println(cs.showCustomer());
		System.out.println(cs.getCustomerName()+"님이 "+nPrice+"원을 지불하였습니다.");	
		
	}
//	public void main(Customer cs) {
//		int price = 10000;
//		int nPrice = cs.calcPrice(price);
//		cs.setCustomerName("이이이");
//		System.out.println(cs.showCustomer());
//		System.out.println(cs.getCustomerName()+"님이 "+nPrice+"원을 지불하였습니다.");
//	}
	
	
	
	

}
