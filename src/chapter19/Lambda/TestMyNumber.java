package chapter19.Lambda;

public class TestMyNumber {
	
	public static void main(String[] args) {
		
		//인스턴스변수방에 구현부를 저장한다.
		//간단한 식일경우 이게 더 편함
		MyNumber max = (x, y) -> ((x >= y)? x : y);
		
		//구현부를 대입하여 실행함.
		System.out.println(max.getMax(3, 5)); //.getMax에는 구현부가 없으니, 3,5인 구현부를 넣어줌.
		
		
		//람다식으로 구현하면 이렇게 됨
//		MyNumber aa = new MyNumber() { //추상메소드가 있는 .... 객체를 만들수가 없다.
//			
//			@Override
//			public int getMax(int x, int y) {
//				int max = ((x >= y)? x : y);
//				return max;
//			}
//		};
//		System.err.println(aa.getMax(3, 20));
//		
		
		
		
	}

}
