package chapter14.Clone;

import java.util.ArrayList;

class MyBook implements Cloneable{
	
	String title;

	public MyBook(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	} // @Override

	@Override
	public String toString() {
		
		return title;
	} // @Override
	
} // class MyBook

public class ObjectArrayClone {

	public static void main(String[] args) {
		
		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		//객체에 대한 인자값을 받으려면 generic을 받아야 된다...?
		MyBook book1 = new MyBook("자바");
		MyBook book2 = new MyBook("스프링");
		MyBook book3 = new MyBook("파이썬");
		
		bookList.add(book1); // 자바가 맨 밑에 들어감.. 객체가 들어간다.
		bookList.add(book2); // 스프링이 중간에
		bookList.add(book3); // 파이썬이 맨 위에
		
		ArrayList<MyBook> copyList = (ArrayList)bookList.clone();
		
		System.out.println(bookList);
		System.out.println(copyList);
		System.out.println(bookList == copyList);
		System.out.println("---");
//		MyBook copybook = new MyBook("C++");
//		copyList.add(copybook);
		
		copyList.add(new MyBook("Oracle"));
		
		System.out.println(bookList);
		System.out.println(copyList);
		System.out.println("---");
		
		book3.setTitle("C++");
		System.out.println(bookList);
		System.out.println(copyList);
		System.out.println("---");
		
	} // main

} // class ObjectArrayClone
