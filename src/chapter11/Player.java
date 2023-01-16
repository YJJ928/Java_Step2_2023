package chapter11;

public class Player {
	
	private PlayLevel level;

	public Player() {
		level = new BeginnerLevel(); 
		// PlayLevel level = new BeginnerLevel();이랑 동일하다
		level.showLevelMessage();
	}
	
	public void upgradeLevel(PlayLevel level) {
		this.level = level;
		level.showLevelMessage();
	}//레벨확인
	
	public PlayLevel getLevel() {
		return level;
	}//레벨
	
	public void play(int count) {
		level.go(count);
	}//고

}
