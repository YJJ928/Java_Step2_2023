package chapter17.ArrayList_stack_queue;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("draw shape");
	}
}

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw circle");
	}
	
	void circle() {
		System.out.println("원모양 입니다.");
	}
}

class Rectangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw rectangle");
	}
	
	void rectangle() {
		System.out.println("사각형 입니다.");
	}
}

class Triangle extends Shape{

	@Override
	void draw() {
		System.out.println("draw triangle");
	}
	
	void triangle() {
		System.out.println("삼각형 입니다.");
	}
}


public class ShapeTest {
	
	//shape와 shape를 상속받은 모든 클래스 타입이 사용하는 ArrayList 
	ArrayList<Shape> sList = new ArrayList<Shape>(); //<>generic의 class만 들어올 수 있는데..
	
	public static void main(String[] args) {
		
		ShapeTest sTest = new ShapeTest();
		System.out.println("---업캐스팅---");
		sTest.addShape(); //밑에 addShape()만들고 sTest에서 addShpae을 실행함.
		//Shape sc = new Circle 부모에게 = 자식을 할당하는 거니까, 업캐스팅
		sTest.testCasting();
		
	}
	
	public void addShape() {
		
		sList.add(new Circle()); // Circle s = new Circle(); 동일
		sList.add(new Rectangle()); //
		sList.add(new Triangle()); //
		
		for(Shape s: sList) {
			s.draw();
		}
	}
	
	public void testCasting() {
		
		for(int i = 0 ; i < sList.size() ; i++) {
			//자식클래스의 객체여야 읽을 수 잇다.
			Shape s = sList.get(i); //일단 부모타입(Shape)으로 가져왔다.
			//상속받은 자식들이 공유해서 사용할 수 있다.
			if(s instanceof Circle) {//s가 circle의 부모냐?
				Circle c = (Circle) s; // 다운캐스팅이면 자동으로 슈룩
				c.circle();
			} else if (s instanceof Rectangle) {
				Rectangle r = (Rectangle) s; //  다운캐스팅이면 자동으로 슈룩
				r.rectangle();
			} else if (s instanceof Triangle) {
				Triangle t = (Triangle) s; //  다운캐스팅이면 자동으로 슈룩
				t.triangle();
			} else {
				System.out.println("지원되지 않는 타입입니다.");
			} // 부모클래스 코드를 이용하는게 좋은 코딩이다.
		}
		
	}

}
