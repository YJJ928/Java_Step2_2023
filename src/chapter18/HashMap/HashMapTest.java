package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("홍길동", 85);
		map.put("ㄴㄴ", 90);
		map.put("ㅇㅇ", 98);
		map.put("ㄷㄷ", 75);
		System.out.println("총 Entry 수: "+map.size());
		
		//객체 찾기
		System.out.println("\t홍길동: "+map.get("홍길동")); //String이 key integer가 값...?
		
		//객체 키 모두 받기
		Set<String> keySet = map.keySet(); //set계열로 받았으니 중복을 허용치 않는다.
		
		//Iterator
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) { // 하나씩 가지고 와
			String key = keyIterator.next(); // 하나씩 나열한다.
			Integer value = map.get(key);
			System.out.println("\t"+key+": "+value);
		}
		
		System.out.println();
		
		map.remove("홍길동");
		
		System.out.println("총 Entry 수: "+map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue(); //값 꺼내온다.
			System.out.println("\t"+key+" : "+value);
		}
		System.out.println();
		
		map.clear(); // 객체 전체 삭제
		System.out.println("총 Entry수: "+map.size());
		
	}

}
