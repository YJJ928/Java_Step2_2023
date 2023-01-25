package chapter19.Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
	
	public static void main(String[] args) {
		
		//가방
		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		//객체생성
		TravelCustomer customerLee = new TravelCustomer("이순신", 15, 15000);
		TravelCustomer customerKim = new TravelCustomer("김순신", 20, 20000);
		TravelCustomer customerHong = new TravelCustomer("홍순신", 25, 25000);
		
		//추가
		customerList.add(customerHong);
		customerList.add(customerLee);
		customerList.add(customerKim);
		
		//고객명단이 추가된 순서대로 출력
		System.out.println("--고객명단이 추가된 순서대로 출력--");
		
		//map: 데이터를 특정조건에 해당하는 값으로 변환해 줌..
		customerList.stream().map(c -> c.getName()).forEach(s->System.out.println(s));
		
		//mapToInt: int형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum(); // mapInt로 getprice를 가져와서 sum을 해라
		System.out.println(total);
		
		//filter 특정조건에 맞는 데이터만 걸러낸다.
		System.out.println("--특정조건 정렬 출력--"); // 20세 이상, 이름을 정렬해서 출력
		customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
		
	}

}
