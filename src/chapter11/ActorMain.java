package chapter11;

import java.util.Scanner;

public class ActorMain {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Actor ac = new Actor();
		
		System.out.print("검색할 배우: ");
		String act = "["+scn.next()+"]";
		System.out.println(act);
		ac.showActor(act);
	}

}
