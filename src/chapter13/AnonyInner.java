package chapter13;

public class AnonyInner {
	

	public void test() {
		new TestInter() { // TestInter ti = new TestInter -> ti.printData();
			
			@Override
			public void printData() {
				System.out.println("dd");				
			}// @Override printData() 추상메소드 구현 
		}.printData(); // 이렇게 호출해서 쓰기도 함...! // new TestInter()
	} //public void test() method
	
	
	public static void main(String[] args) {
		AnonyInner in = new AnonyInner();
		in.test();
	} // main

} // class AnonyInner
