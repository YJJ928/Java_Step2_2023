package chapter16.generic2;

public class ThreeDPrinterMain {

	public static void main(String[] args) {
		
		ThreeDPrinter tdp = new ThreeDPrinter();
		
		Powder p1 = new Powder();
		
		tdp.setMaterial(p1);
		System.out.println(p1);
		p1.doprinting();
		
		Powder p2 = (Powder) tdp.getMaterial();
		//getmaterial: object type
		System.out.println(p2);
		System.out.println("--");
		
		Plastic p3 = new Plastic();
		tdp.setMaterial(p3);
		System.out.println(p3);
		p3.doprinting();
		
		Plastic p4 = (Plastic) tdp.getMaterial();
		System.out.println(p4);
		
		

	}

}
