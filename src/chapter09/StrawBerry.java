package chapter09;

public class StrawBerry extends Berry{
	//다중상속은 못함. fruit을 상속받은 berry를 상속받으면 fruit과 berry의 인자를 다 쓸 수 있다.
	private String color;
	private int price;
	
	public void Set3(String a, int b) {
		color = a;
		price = b;
	}
	
	public void Disp3() {
		System.out.println("색깔 : "+color);
		System.out.println("가격 : "+price);
	}
	

}
