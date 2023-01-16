package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		
		System.out.println("-----곰-----");
		Bear b = new Bear();
		System.out.println("눈 "+b.getEye()+"개에 다리는 "+b.getLeg()+"개");
		System.out.println("특징: "+b.woong);
		System.out.println("----사 자----");
		Lion l = new Lion();
		System.out.println("눈 "+l.getEye()+"개에 다리는 "+l.getLeg()+"개");
		System.out.println("특징: "+l.galgi);
		System.out.println("----거 미----");
		Spider sp = new Spider();
		System.out.println("눈 "+sp.getEye()+"개에 다리는 "+sp.getLeg()+"개");
		System.out.println("특징: "+sp.web);
		
//		Animal animal = new Animal();

	}

}
