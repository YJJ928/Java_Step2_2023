package chapter19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//sum()은 integer로 반환하므로 int로 받음
		//한번 생성된 스트림은 재 사용시 다시 생성해야 함.
		int sumVal = Arrays.stream(arr).sum();//합계
		//long type이므로 int로 캐스팅
		int count = (int) Arrays.stream(arr).count();//갯수반환
		
		System.out.println(sumVal+", "+count);
		
		//int =>  IntStream 형변환
		IntStream stream = Arrays.stream(arr); //arr을 IntStream으로 int+stream타입으로 받음
		int sum = stream.sum();
		System.out.println(sum);
		
		//이미 사용했으므로 소멸된 stream
//		int count2 = stream.count();//에러
		int count2 = (int) Arrays.stream(arr).count(); // 재선언 가능
		System.out.println(count2);
		
		
		//reduce(): (초깃값, 전달되는 요소 -> 각요소가 수행해야 하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0, (a,b) -> (a+b)));//(초기값, 해야할 일(덧,뺄,나...등등등 가능함))
	}


}
