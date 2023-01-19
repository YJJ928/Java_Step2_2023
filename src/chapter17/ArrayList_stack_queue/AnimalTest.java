package chapter17.ArrayList_stack_queue;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람은 두발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람은 책을 읽습니다.");
	}
}

class Tiger extends Animal{
	public void move() {
		System.out.println("호랑이는 네발로 걷습니다.");
	}
	
	public void hunt() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal{
	public void move() {
		System.out.println("독수리는 하늘을 납니다");
	}
	
	public void fly() {
		System.out.println("독수리는 날개를 펴고 날아다닙니다.");
	}
}


public class AnimalTest {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	//addAnimal -> 업캐스팅 메소드
	public void addAnimal() {
		System.out.println("---업캐스팅---");
		aniList.add(new Human()); //Animal 형으로 자동 형변환
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal a : aniList) {
			a.move();
		}
		
	}
	
	//testCasting -> 다운캐스팅 메소드
	public void testCasting() {
		System.out.println("---다운캐스팅---");
		for(int i = 0 ; i < aniList.size() ; i++) {
			//자식클래스의 객체여야 읽을 수 잇다.
			Animal a = aniList.get(i); //일단 부모타입(Shape)으로 가져왔다.
			//상속받은 자식들이 공유해서 사용할 수 있다.Animal a = new Animal();
			if(a instanceof Human) {//a가 human의 부모냐?
				Human h = (Human) a; // 다운캐스팅이면 자동으로 슈룩
				h.readBook();
			} else if (a instanceof Tiger) {
				Tiger t = (Tiger) a; //  다운캐스팅이면 자동으로 슈룩
				t.hunt();
			} else if (a instanceof Eagle) {
				Eagle e = (Eagle) a; //  다운캐스팅이면 자동으로 슈룩
				e.fly();
			} else {
				System.out.println("지원되지 않는 타입입니다.");
			} //if
			
		} //for		
		
	} //testCasting() method
	
	public static void main(String[] args) {
		
		AnimalTest at = new AnimalTest();
		at.addAnimal(); // 업캐스팅
		at.testCasting(); // 다운캐스팅
	}

}
