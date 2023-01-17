package chapter14.String;

import java.util.Date;

class Book{
	String title;
	String author;
	
	public Book(String title, String author) {
//		super();
		this.title = title;
		this.author = author;
	}
	
	//String 처리해서 본다!//String 문자열로 출력해주는 toString 재정의.
	@Override
	public String toString() { // 메소드 이름 못바꿈...!
//		return super.toString();
		return title+", "+author;
	}
	
}

public class ToStringEx1 {
	
	public static void main(String[] args) {
	
		Book book = new Book("자바", "홍길동");
		//객체는 heap메모리를 사용
		//heap메모리는 16진수 주소값을 갖고 있음.
		System.out.println(book);
		System.out.println(book.toString()); //toString() 메소드를 직접 호출
		
		
		//객체 자체에 있는것을 heap memory 처리한다고?
		//.toString: 객체에 대한 결과값을 문자로 보여준다...!
		
		String str = new String("test");
		System.out.println(str);
		
		
		
		
		
		
		
	}

}
