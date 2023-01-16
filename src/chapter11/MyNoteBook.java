package chapter11;

public class MyNoteBook extends NoteBook{
	//Computer 상속받는 경우 거기에 있는 추상2개 일반2개 메소드 들어와 있는거임....
	//Notebook을 상속받는 경우 추상클래스를 상속받는 것이니 아래에 메소드 선언?을 안 해줘도 됨.
	
//	@Override
//	public void display() {
//		// 추상메소드라 super.가 없고 내가 구현해서 써야함...
//	}

	@Override
	public void typing() {
		System.out.println("MyNoteBook typing");
	} 
	
	
	

}
