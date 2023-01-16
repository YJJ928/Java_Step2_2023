package chapter12.MultiInterface;

public class Customer implements Buy, Sell{

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void sell() {
		System.out.println("판매하기");
	}
	
	//같은 이름의 default메소드는 존재할 수 없으므로 오버라이딩 해야 함.
	//최종 오버라이딩메소드가 출력됨
//	@Override
//	public void order() {
////		Buy.super.order();
//		System.out.println("고객판매주문");
//	}
	
}
