package chapter10;

public class ComputerMain {

	public static void main(String[] args) {
		int r = 10;
		Calculator cal = new Calculator();
		Computer cp = new Computer();
		
		System.out.println(cal.areaCircle(r));
		System.out.println(cp.areaCircle(r));

	}

}
