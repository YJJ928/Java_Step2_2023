package chapter09;

public class Berry extends Fruit{//Fruit으로부터 상속 받아 Berry에서 사용 가능하다.
	//Fruit(부모) / Berry(자식)
	//상속을 받게되면 그대로 들어오는 거임 이 화면에 똑같이 쓰는거랑 같음
	private String name;
	private String size;
	
	public void Set2(String a, String b) {
		name = a;
		size = b;
	}
	
	public void Disp2() {
		System.out.println("이름 : "+name);
		System.out.println("크기 : "+size);
	}
	

}
