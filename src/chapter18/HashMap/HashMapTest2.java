package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	
	public static void main(String[] args) {
		
		//Map map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//팀원 데이터(성함, 학번) 저장
		map.put("허초회", 10000);
		map.put("윤영훈", 10001);
		map.put("이재민", 10002);
		map.put("전솔민", 10003);
		map.put("장여주", 10004);
		map.put("김찬희", 10005);
		
		//팀원의 인원
		System.out.println("총 인원 수: "+map.size());
		
		//팀장의 학번을 알아내자
		System.out.println("팀장학번: "+map.get("허초회"));
		
		//팀원 모두의 학번을 출력
			//객체 키 모두 받기
		Set<String> keySet = map.keySet();
			//Iterator
		Iterator<String> kI = keySet.iterator();
		
		while(kI.hasNext()) {
			String key = kI.next();
			Integer value = map.get(key);
			System.out.println(key+" : "+value);
		}
	}

}
