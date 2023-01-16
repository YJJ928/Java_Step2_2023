package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer cs = new Customer();
		System.out.println("--------Buy--------");
		Buy by = cs; //부모 <- 자식
		by.buy();
		by.order();
		by.order();
		
		System.out.println("--------Sell--------");
		Sell sl = cs; //부모 <- 자식
		sl.sell();
		sl.sellOrder();
//		sl.order();
		//sl 부모 / Customer 자식
		if(sl instanceof Customer) {//sl가 Customer객체를 받았다면
		Customer cs2 = (Customer) sl; //자식 <- (강제형변환) 부모
		System.out.println("---Down Casting---");
		cs2.buy();
		cs2.sell();
		cs2.sellOrder();
		
		
		}
		
		cs.order();
	}

}
