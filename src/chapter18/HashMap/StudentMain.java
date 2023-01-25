package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StudentMain {
	
	public static void main(String[] args) {
		//학생정보
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(2, "김민주"), 80);
		map.put(new Student(3, "서주희"), 9);
		map.put(new Student(4, "하동길"), 5);
		
		//저장된 총 entry 수 출력
		System.out.println("총 entry수: "+map.size()); // 중복데이터를 허용하지 않음.
		
		//하나씩 처리하는 방법
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t"+key+": "+value);
		} //순서 뒤죽박죽 //전체 key값과 value값 보여줌....
		
		Scanner scan = new Scanner(System.in);
		Student std;//선언
		int input;
		String name;
			
		while(true) {
			System.out.print("학생번호를 입력하세요: ");
			input = scan.nextInt();
			System.out.print("학생이름을 입력하세요: ");
			name = scan.next();
			std = new Student(input, name); // heap
			
			if(map.containsKey(std)) {
				System.out.println(name+" 학생의 점수: "+map.get(std) );
				break;
			} else {
				System.out.println("해당학생 존재x");
			}
				
				
			System.out.println();
			
		}
		
		
	}

}
