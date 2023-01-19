package chapter17.List;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		
		int iArray[] = {50,40,30,20,10};
		String sArray[] = new String[5];
		//Arrays: 항목에 대하여 정렬, 항목 검색, 항목 비교에 관한 메소드..특정한 메소드때문에 사용함..
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray); // 정렬할 때 사용..
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good"); // array에 채운다.
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("Seoul","incheon","busan","deagu","jeju", "D");
		for(int i = 0 ; i < City.size() ; i++) {
			System.out.println(City.get(i).toString()); //aslist로 나열을 했으면, 배열인데 컬렉션이랑 호환이 됨. 어레이즈로 바꿔서 리스트로 넣을 수 잇따. 추가해도 추가가 됨
		}
		
		

	}

}
