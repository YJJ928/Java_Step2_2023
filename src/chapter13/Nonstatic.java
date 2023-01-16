package chapter13;

import javax.swing.JOptionPane;

class Out{
	
	static int a = 1;
	//생성자 프리컴파일(생략)
	
	//메소드
	
	//내부클래스
	public class In {
		
		//필드
		
		//디폴트 생성자
		
		//메소드
		public String Infun() {
			return(a+"번째 Non-static 내부 실습");
		}
	
	}//class In

}//class Out


public class Nonstatic {
	
	public static void main(String[] args) {
		
		//1. 바깥 클래스 객체
		Out obj1 = new Out();
		// obj1.in 나오지 않는다..
		
		//2. 내부 클래스 객체
		//바깥의 바깥클래스 = obj1에 새 클래스..?
		Out.In obj2 = obj1.new In();
		
		//3. 바깥클래스 내부에 있는 메소드
		String str = obj2.Infun();
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
		
	}

} // class Nonstatic
