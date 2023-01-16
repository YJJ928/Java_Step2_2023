package chapter11;

public abstract class NoteBook extends Computer{
	// public void typing() 상속된거 안쓰려면
	// abstract 추가해 줘야 함....
	
	@Override
	public void display() {
		System.out.println("NoteBook display");
	}

//	@Override
//	public void typing() {
//		// TODO Auto-generated method stub
//		
//	} // 얘를 안쓰면 

}
