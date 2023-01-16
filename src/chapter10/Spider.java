package chapter10;

public class Spider extends Animal {
	
	String web = "슉슉 집짓기";
	
	//부모객체의 특징이 맞지 않아 오버라이딩으로 우선순위를 준다!
	@Override
	public int getEye() {
//		return super.getEye(); //부모개체의 특징을 super로 return하는게 아니라
		return 8; //8을 불러와준다
	}

	@Override
	public int getLeg() {
//		return super.getLeg();
		return 8;
	}
	
	
	
}
