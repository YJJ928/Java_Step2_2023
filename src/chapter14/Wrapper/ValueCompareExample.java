package chapter14.Wrapper;

public class ValueCompareExample {
	
	public static void main(String[] args) {
		//오토박싱 상태에서는 1 byte 초과시 비교판단이 안됨
		
		System.out.println("[-128 ~ 128 초과값일경우]"); //1 byte = 8 bit
		Integer obj1 = 300;//객체 // 4 byte = 32 bit
		Integer obj2 = 300;//객체
		
		//주소를 비교
		System.out.println("결과: "+(obj1 == obj2));
		//같지않음으로 판단.. 4byte라 초과했기떄문?외부까지 비교해서..
		System.out.println("언박싱 후 결과: "+(obj1.intValue() == obj2.intValue()));
		//내부판단
		
		System.out.println("[-128 ~ 128 범위일경우]"); //1 byte = 8 bit
		Integer obj3 = 100;//객체 // 4 byte = 32 bit
		Integer obj4 = 100;//객체
		//주소를 비교
		System.out.println("결과: "+(obj3 == obj4));
		//
		System.out.println("언박싱 후 결과: "+(obj3.intValue() == obj4.intValue()));
		//내부 
		System.out.println("equals: "+obj3.equals(obj4));
		//내부
		
		
	}
}
