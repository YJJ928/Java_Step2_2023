package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		//추상클래스는 객체를 만들 수가 없다.
		//메모리를 안주겠다!
		//Computer c1 = new Computer(); -> 이상태 에러남
		//Computer c3 = new NoteBook();
		
		Computer c2 = new DeskTop();
		Computer c4 = new MyNoteBook();
		c2.typing(); //DeskTop것이 구현이 됨.
		c2.display(); //DeskTop
		c4.typing(); //NoteBook
		c4.display(); //MyNoteBook

	}

}
