package chapter12.Interface;

public class CalcMain {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		
		Calc calc = new CompleteCalc2();
		
		calc.description();
		
		System.out.println("-----Static method-----");
		int[] arr = {1,2,3,4,5};
		System.out.println("1~5합: "+Calc.total(arr));
		
		System.out.println("-----Interface method-----");
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		//child
		CompleteCalc2 calc2 = new CompleteCalc2();
		
		calc2.showInfo();
		

	}

}
