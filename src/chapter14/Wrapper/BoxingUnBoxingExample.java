package chapter14.Wrapper;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//AutoBoxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(200);
		Integer obj3 = Integer.valueOf(300);
		Integer total1 = obj1 + obj2;
		Integer total2 = obj2 + obj3;
//		Integer total3 = obj1 + obj2 + obj3;
		
		System.out.println("Integer total1: "+total1);
		System.out.println("Integer total2: "+total2);
		System.out.println();
		
		//UnBoxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		Integer total3 = value1+value2+value3;
		System.out.println("Integer total3: "+total3);
		
	}

}
