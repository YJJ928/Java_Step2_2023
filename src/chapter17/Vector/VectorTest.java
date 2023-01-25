package chapter17.Vector;

import java.util.Vector;

public class VectorTest {
	
	public static void main(String[] args) {
		
		Object obj;//크기1의 배열 선언
		
		Vector<Object> vec = new Vector<Object>(1);
		
		//------------------------------
		
		obj=20221227;
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #1 : "+ vec.capacity()); // 벡터 내부 저장되어 있는 엘리먼트의 수를 부여줌
		System.out.println("크기는 #1 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="some people";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #2 : "+ vec.capacity()); // 벡터 내부 저장되어 있는 엘리먼트의 수를 부여줌
		System.out.println("크기는 #2 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="dream of success";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #3 : "+ vec.capacity()); // 1->2->4
		System.out.println("크기는 #3 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="kk";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #4 : "+ vec.capacity()); // 1->2->4->4????
		System.out.println("크기는 #4 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="234234";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #5 : "+ vec.capacity()); // 1->2->4->4->8?????
		System.out.println("크기는 #5 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="234234";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #6 : "+ vec.capacity()); // 1->2->4->4->8->8
		System.out.println("크기는 #6 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="sdfs";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #7 : "+ vec.capacity()); // 1 2 44 8888
		System.out.println("크기는 #7 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="wer";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #8 : "+ vec.capacity()); // 1 2 44 8888
		System.out.println("크기는 #8 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="234234";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #9 : "+ vec.capacity()); // 1 2 44 8888 1616
		System.out.println("크기는 #9 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="234234";
		
		vec.addElement(obj); // 엘리먼트 추가
		
		System.out.println("용량은 #10 : "+ vec.capacity()); // 1 2 44 8888 1616
		System.out.println("크기는 #10 : "+ vec.size()); // 크기
		System.out.println();
		
		//=================================
		
		obj="16";vec.addElement(obj);
		obj="16";vec.addElement(obj);
		obj="16";vec.addElement(obj);
		obj="16";vec.addElement(obj);
		obj="16";vec.addElement(obj);
		obj="16";vec.addElement(obj);
		
		obj="32";vec.addElement(obj); //32//17
		
		System.out.println("용량은 #Last : "+ vec.capacity()); 
		System.out.println("크기는 #Last : "+ vec.size()); // 크기
		System.out.println();
					
		System.out.println(vec);
			
	}

}
