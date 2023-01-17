package chapter14.Hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		//key: 단서 / String: 꺼내야할 값
		
		
		System.out.println(hashMap);
		//식별키의 객체를 이용하여 이름을 반환
		hashMap.put(new Key(1), "홍길동");
		System.out.println(hashMap);
		// Key class의 override 없이: {chapter14.Hashcode.Key@1877ab81=홍길동}
		// Key class의 override 후: {chapter14.Hashcode.Key@1=홍길동}
		hashMap.put(new Key(2), "김유신");
		System.out.println(hashMap);
		// {chapter14.Hashcode.Key@1=홍길동, chapter14.Hashcode.Key@2=김유신}
		
//		hashMap
		
	}

}
