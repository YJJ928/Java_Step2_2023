package chapter16.generic1;

class MyArrayG<E>{
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {//객체가 들어와야 함
		array[i++] = obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}
}

public class MyArrayTest2 {
	
	public static void main(String[] args) {
		
		MyArrayG<String> myArray1 = new MyArrayG<>();
		myArray1.add(new String("test"));//객체가 들어와야 함
		String str = myArray1.get(0); //(String) 형변환이 필요가 없다.
		System.out.println(str);
		
		MyArrayG<Integer> myArray2 = new MyArrayG<>();
		myArray2.add(new Integer(100));//객체가 들어와야 함
		Integer num = myArray2.get(0); // 형변환이 필요가 없다.
		System.out.println(num);
		//구체적인 타입을 기재하지 않고 변수 형태로 선언 => 쓸때 타입을 정의...
	}

}
