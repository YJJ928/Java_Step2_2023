package chapter12.MultiInterface;

public interface Sell {
	
	void sell();
	
	//같은 이름의 default메소드는 존재할 수 없으므로 오버라이딩 해야 함.
//	default void order() {
//		System.out.println("판매주문");
//		//디폴트는 구현부없이 두개 못씀..
//	}
	
	default void sellOrder() {
		System.out.println("판매주문");
	}

}
