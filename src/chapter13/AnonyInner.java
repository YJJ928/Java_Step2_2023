package chapter13;

public class AnonyInner {

	public void test() {
		new TestInter() { // TestInter ti = enw TestInter -> ti.printData();
			
			@Override
			public void printData() {
				System.out.println("dd");				
			}//추상메소드 구현
		}.printData(); // 이렇게 호출해서 쓰기도 함...!
	} //public void test() method
	
	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test();
	}

}
