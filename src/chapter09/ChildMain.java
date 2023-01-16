package chapter09;

public class ChildMain {

	public static void main(String[] args) {
		
		Child child = new Child();
		
		child.method1();//부모것
		child.method2();//자식것(2)
		child.method3();//자식것(3)
		
		Parent parent = new Parent();
		parent.method2();//부모것(2)
		
		Parent parent2 = child; //자식객체를 부모객체에게 넘겨 줄 수 있다.
		System.out.println("---");
		//parent2.method1과 2밖에 안뜸
		parent2.method1();//부모것
		parent2.method2();//자식것(2). overriding된 개체가 우선해서 뜬다.
		
		
		
		

	}

}
