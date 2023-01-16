package chapter09;

public class Paprika extends Vegetable{

	private String color;
	private int price;
	private String name; //부모의 name과 겹치고 있다.
	//
	
	public void Set2(String a, int b, String c) {
		color = a;
		price = b;
		name = c;
	}
	
	
	public void Disp1() {
		System.out.println("---Paprika---");
		System.out.println("분류: "+sort);
		System.out.println("계절: "+season);
		System.out.println("이름: "+name); //가까운 name을 불러온다.자식의 이름.
		//멤버변수가 부모로부터 상속받은것과 일치하는 것이 있을 경우 부모클래스의 기본생성자(super)를 이용하여 선언한다. 
		//위에 Vegetable vg = new super Vegetable이 생략되어 있는거나 마찬가지
		System.out.println("이름: "+super.name); //부모의 이름. 부모클래스의 기본 생성자
		//super class: java lang의 최상위 클래스
	}
	
	public void Disp2() {
		System.out.println("---Paprika---");
		System.out.println("색깔: "+color);
		System.out.println("가격: "+price);
		System.out.println("이름: "+name); //가까운 name을 불러온다.자식의 이름.
		//멤버변수가 부모로부터 상속받은것과 일치하는 것이 있을 경우 부모클래스의 기본생성자(super)를 이용하여 선언한다. 
		//위에 Vegetable vg = new super Vegetable이 생략되어 있는거나 마찬가지
		
	}
	
}
