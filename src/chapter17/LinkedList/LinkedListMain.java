package chapter17.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class LinkedListMain {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list1.add(0, String.valueOf(i));
		}
				
		endTime=System.nanoTime();
		System.out.println("ArrayList로 걸린 시간(nanosec)\t"+(endTime - startTime));
		
		
		startTime = System.nanoTime();
		for(int i = 0 ; i < 10000 ; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime=System.nanoTime();
		System.out.println("LinkedList로 걸린 시간(nanosec)\t"+(endTime - startTime)); //  LinkedList가 훨씬 적은 시간이 걸린다.
		
		
		
	}

}
