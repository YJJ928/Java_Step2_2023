package chapter17.ArrayList_stack_queue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class PersonManager {
	
	public void personMgr() {
		
		int select;
		Person p;
		ArrayList<Person> personArr = new ArrayList<Person>();
		
		while(true) {
			System.out.println("1. 회원추가");
			System.out.println("2. 회원탈퇴");
			System.out.println("3. 회원정보");
			System.out.println("4. 종   료");
			System.out.print("항목선택");
			
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			
			if(select == 1) {
				System.out.println("1.회원추가를 선택하였습니다.");
				p = new Person(); // 객체 메모리가 생겨야 저장이 가능하다.
				
				System.out.print("이름: ");
				p.setName(scan.next());
				System.out.print("나이: ");
				p.setAge(scan.nextInt());
				System.out.print("전화번호: ");
				p.setTel(scan.next());
				
				personArr.add(p); //p.setName, p.setAge, p.setTel 다 들어감
				
//				int size = personArr.size();
//				for(int i = 0 ; i < personArr.size() ; i++) {
//					Person str = personArr.get(i);
//					System.out.println(i+" : "+str);
//				}
				
			} else if (select == 2) {
				System.out.println("2.회원탈퇴를 선택하였습니다.");
				String removeName = scan.next();
				for(int i = 0 ; i < personArr.size() ; i++) {
					if(personArr.get(i).equals(removeName)) {
						personArr.remove(i);
						System.out.println(removeName+"님의 정보를 삭제하였습니다.");
						break;
					} else {
						if(i + 1 == personArr.size()) {
							System.out.println(removeName+"이 존재하지 않습니다.");
						}
					}
				}
				
			} else if (select == 3) {
//				System.out.println("3.회원정보를 선택하였습니다.");
//				for(int i = 0 ; i < personArr.size() ; i++) {
////				Person P = personArr.get(i);
////				System.out.println(i+" ) "+P.getName()+" / "+P.getAge()+" / "+P.getTel());
//					System.out.println(personArr.get(i).getName());
//					System.out.println(personArr.get(i).getAge());
//					System.out.println(personArr.get(i).getTel());
//				}
				Iterator<Person> it = personArr.iterator();
				while(it.hasNext()) {
					p = it.next();
					System.out.println(p.getName());
					System.out.println(p.getAge());
					System.out.println(p.getAge());
				} // 회원정보는 Iterator로 하는게 맞다.
					
			} else if (select == 4) {
				System.out.println("4.종료합니다.");
				break;
//				return;
			}
			
		}
		
	}
	
	
}
