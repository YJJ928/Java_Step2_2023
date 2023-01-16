package chapter09;

public class ParentMain {

	public static void main(String[] args) {
		
		ChildExam c1 = new ChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());//상속분
		System.out.println("------------");
		if(c1 instanceof ParentExam) { //c1이 par~~ 안에 들어가있니?
			System.out.println("c1은 parentExam으로부터 상속받았다. 자식클래스이다.");
		} 
		//=====================
		//형변환
		ChildExam ch = new ChildExam();
		ParentExam p1 = new ParentExam();
		System.out.println("--------------");
		p1 = ch; // 자동형변환 (p1 = (ParentExam)ch;)
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("--------------");
		ch = (ChildExam)p1; //명시적인 형변환
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
		
		
		
		
		
	}

}
