package chapter17.Stack_queue;

import java.util.Stack;

public class StackTest1 {
	
	public static void main(String[] args) {
		
		Object obj;
		//empty stack 생성
		Stack<Object> st = new Stack<Object>();
		
		//입력
		if(st.empty()) { //스택이 비어있으면 underflow??
			for(int i = 0 ; i <= 3 ; i++) {
				st.push(new String("Hi! "+i)); // 객체를 넣어야 한다.
				System.out.println(" 입력"+i+"번째 : "+st.peek()); // stack memory구조를 확인할 수 있는..
			}
		} //if
		
		//출력
		st.pop(); // output //밖으로 나오는 출력, 나중에 들어간 순서대로 나온다. 3이 나온것이다..
		st.pop();
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("hihi"));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
		st.push(new String("good"));
		System.out.println("현재 Top의 위치(peek) : "+st.peek());
	}

}
