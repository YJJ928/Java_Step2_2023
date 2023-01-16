package chapter12.MultiInterface;

public class InterMenuMain implements Inter_Menu3{

	public static void main(String[] args) {
		
		InterMenuMain im = new InterMenuMain();
		//부모 = 자식;
		Inter_Menu1 im1 = im; // up casting = 자식이 부모한테 자동캐스팅
		Inter_Menu2 im2 = im; 
		Inter_Menu3 im3 = im; 
		
		System.out.println("---Inter_Menu1---");
		System.out.println(im1.jajang());
		System.out.println(im1.JJambong());
		im.show();
		im1.show();
		
		System.out.println("---Inter_Menu2---");
		System.out.println(im2.tangsuyuk());
	
		System.out.println("---Inter_Menu3---");
		System.out.println(im3.boggembab());
		System.out.println(im3.jajang());
		System.out.println(im3.JJambong());
		System.out.println(im3.tangsuyuk());
		im3.show();
		
		
		
	}

	@Override
	public String jajang() {
		return "자장";
	}

	@Override
	public String JJambong() {
		return "잠봉";
	}

	@Override
	public String tangsuyuk() {
		return "탕슉";
	}

	@Override
	public String boggembab() {
		return "볶음밥";
	}

}
