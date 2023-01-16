package chapter12.Interface;

public class CompleteCalc2 extends ComplateCalc1 {
	//상속받아서 times/divided 구현

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
//		try {
//			return num1 / num2;
//		} catch (ArithmeticException e) {
//			return Calc.ERROR;
//		} 
		if(num2 != 0) {return num1/num2;}
		else {return Calc.ERROR;}
	}
	public void showInfo() { 
		System.out.println("Calc 인터페이스 구현하였습니다.");
	}
	//디폴트메소드의 재정의
	@Override
	public void description() {
		
//		Calc.super.description();
		System.out.println("완벽한 계산기입니다.");
	}
	
	
	
	
	
}
