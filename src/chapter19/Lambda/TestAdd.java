package chapter19.Lambda;

public class TestAdd {
	
	public static void main(String[] args) {
		//Lambda: 메소드 이름이 없음. 매개변수와 구현부만 존재
		
		Add addF = (x, y) -> (x + y);
		
		System.out.println(addF.add(3, 5));
		
	}

}
