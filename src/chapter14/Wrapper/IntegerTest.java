package chapter14.Wrapper;

//Wrapper
public class IntegerTest {

	public static void main(String[] args) {
		
//		Integer i = new Integer(100); // int i = 100;
		
		Integer num = 1000; //오토박싱: 일반자료 => 클래스로 선언
		
		int iNum = num.intValue(); //언박싱: 클래스 => 일반자료
		
		int jNum = 2000;
		int sum = iNum + jNum;
		System.out.println(sum);
		
		//언박싱(클래스를 일반자료로)
		int total = num + jNum;
		System.out.println(total); //언박싱은 자동
		
		//오토박싱(int = > Integer, 일반자료를 클래스로)
		Integer i = jNum; 
		System.out.println(i); //Integer.valueOf(jNum);로 변환하는 것과 같음..
		
		
	}

}
