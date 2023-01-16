package chapter10;

import java.util.Scanner;

public class CalMain {

	public static void main(String[] args) {
		
//		CalculatorExam cm = new CalMinus();
//		CalculatorExam cp = new CalPlus();
//		Scanner scan = new Scanner(System.in);
//		System.out.println("두 수를 입력하세요");
//		System.out.print("> ");
//		int a = scan.nextInt();
//		System.out.print("> ");
//		int b = scan.nextInt();
//		System.out.println("-----------------");
//		System.out.println("두 수의 차: "+cm.getResult(a, b));
//		System.out.println("두 수의 합: "+cp.getResult(a, b));
		
		//다른 방법!
		Scanner scan = new Scanner(System.in);
		CalculatorExam[] calcultors = {new CalPlus(), new CalMinus()};
		System.out.println("두 수를 입력하세요");
		System.out.print("> ");
		int a = scan.nextInt();
		System.out.print("> ");
		int b = scan.nextInt();
		
		for(CalculatorExam ce : calcultors) {
			System.out.println
			(ce.getClass().getSimpleName() + " : " + ce.getResult(a,b));
		}
		//getClass().getSimpleName() : "클래스 명 가져오기"
		
		//다른 방법!!
		int pp = calc(new CalPlus(), a, b);
		int mm = calc(new CalMinus(), a, b);
		System.out.println("합: "+pp+", 차: "+mm);
		
		//다른 방법!!! - 한꺼번에
		System.out.println
		("합: "+calc(new CalPlus(), a, b)+", 차: "+calc(new CalMinus(), a, b));
	}
	
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}

}
