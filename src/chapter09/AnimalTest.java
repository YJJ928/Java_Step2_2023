package chapter09;

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
	
	public void moveAnimal(Animal animal) {//메소드 명 + x로 사용 가능하다~
		animal.move(); 
		System.out.println("------");
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		Animal animal = new Human(); //왼쪽 상위클래스 오른쪽 하위클래스 표현 가능
		aTest.moveAnimal(animal); // (new Human())이랑 같음
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
		
//	public void moveAnimal(Tiger t) {
//		t.move();
//	}

}
