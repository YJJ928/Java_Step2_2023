package chapter11;

public class MasterLevel extends PlayLevel{
	@Override
	public void run() {
		System.out.println("매우 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한바퀴 turn합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*****고급자입니다.*****");
	}

}
