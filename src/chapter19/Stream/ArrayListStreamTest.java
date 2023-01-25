package chapter19.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		// List => Stream
		Stream<String> stream = sList.stream();
		
		//엘리먼트가 들어오면 출력하라는 람다식 구현
		stream.forEach(s -> System.out.print(s+" "));
		System.out.println();
		
		//forEach대신 확장for
		for(String s : sList) {
			System.out.print(s+" ");
		}
		
		System.out.println("==== 정렬 후 ====");
		
		sList.stream().sorted().forEach(s -> System.out.print(s+" ")); //stream으로 만들고 sort9정렬)하고 각요소를 뿌려러(forEach)
		System.out.println();
		sList.stream().map(s -> s.length()).forEach(n -> System.out.print(n+" ")); // 길이를 반납해서 forEach로 뿌려
		System.out.println();
		sList.stream().filter(s -> s.length() >= 5).forEach(s -> System.out.print(s+" ")); // s가 s.length 5이상이면 뿌려
		System.out.println();
		
		
		
		
		
		
		
		
		
	}
	
}
