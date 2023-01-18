package chapter16.generic2;

public class Water extends Material{

	@Override
	public String toString() {
		
		return "재료는 Water 입니다.";
	}

	@Override
	public void doprinting() {
		System.out.println("Water 재료는 불가능 합니다.");
		
	}
	
	

}
