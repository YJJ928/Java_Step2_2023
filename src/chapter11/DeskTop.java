package chapter11;

public class DeskTop extends Computer{

	@Override
	public void display() {
		// 추상메소드라 super.가 없고 내가 구현해서 써야함...
		System.out.println("DeskTop display");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop typing");
	}

	
}
