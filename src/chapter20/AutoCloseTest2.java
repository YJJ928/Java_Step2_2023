package chapter20;

public class AutoCloseTest2 {

	
	public static void main(String[] args) {
		
		
		AutoCloseObj obj = new AutoCloseObj(); // java 9부터 밖에서 선언 가능함...
		
		
		try (obj){
			throw new Exception();
		} catch (Exception e) {
			System.out.println("예외부분입니다.");
		}
		
	}

}
