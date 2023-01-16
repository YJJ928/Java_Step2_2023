package chapter12.MultiInterface;

public class Multiple extends CompleteCalc implements Calc, Runnable{ 
	// 일반class에서 다중 상속은 안됨 근데 implement해서 calc는 받을 수 있다....?
	// impl~~하면 뼈대만 있다. 설계도가 없다. 
	// runnable - run이 들어있고 설계도면을 만들어준다....?
	
	public static void main(String[] args) {
		
	}

	@Override
	public void x() {
		
	}

	@Override
	public void y() {
		
	}

	@Override
	public void myMethod() {
		
	}

	@Override
	public void run() {
		
	}

}
