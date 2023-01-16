package chapter11;

public class MainBoard {

	public static void main(String[] args) {
		//기본게임 1단계
		Player player = new Player();
//		PlayLevel playB = new BeginnerLevel();	
		
		player.play(3);
		
		
		//레벨 2단계
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(3);
		
		//레벨 3단계
		MasterLevel mLevel = new MasterLevel();
		player.upgradeLevel(mLevel);
		player.play(3);
		
	}

}
