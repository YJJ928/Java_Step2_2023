package chapter13;

import javax.swing.JOptionPane;

class Out2{
	
	static int a = 11;
	int b;
	
	public static class In {
		
		String Infun() {
			return (a+"번째 static 내부 클래스");
		} //Infun() method
		
	} //class In
	
}


public class EmbedMain {

	public static void main(String[] args) {
		
		Out2.In obj3 = new Out2.In();
		String strr = obj3.Infun();
		
		JOptionPane.showMessageDialog(null, strr+"\n Success");
		

	}

}
