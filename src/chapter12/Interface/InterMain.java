package chapter12.Interface;

public class InterMain {
	
	public static void main(String[] args) {
		
//		InterTest1 it = new InterTest1() {
//			
//			@Override
//			public int getA() {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//		}; //inter1은 구현된게 없으니 override하라고 함.
		
		InterTest1 it = new InterTest2();
		System.out.println(it.getA());
		
		
		
	}

}
