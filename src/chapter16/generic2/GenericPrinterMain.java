package chapter16.generic2;

public class GenericPrinterMain {

	public static void main(String[] args) {
		
//		ThreeDPrinter tdp = new ThreeDPrinter();
		
		GenericPrinter<Powder> gp1 = new GenericPrinter<Powder>();
		gp1.setMaterial(new Powder());
		System.out.println(gp1.getMaterial());
		gp1.getMaterial().doprinting();
		
		GenericPrinter<Plastic> gp2 = new GenericPrinter<Plastic>();
		gp2.setMaterial(new Plastic());
		System.out.println(gp2.getMaterial());
		gp2.getMaterial().doprinting();
		
		//물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생한다.
		GenericPrinter<Water> gp3 = new GenericPrinter<Water>();
		gp3.setMaterial(new Water());
		System.out.println(gp3.getMaterial());
		System.out.println();
		
	}

}
