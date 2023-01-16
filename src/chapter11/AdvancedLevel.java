package chapter11;

public class AdvancedLevel extends PlayLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("turn은 불가능합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****중급자입니다.*****");
	}

}