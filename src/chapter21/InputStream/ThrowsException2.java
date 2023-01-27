package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {
	
	public Class loadClass(String flieName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(flieName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	
	public static void main(String[] args) {
		
		ThrowsException2 test = new ThrowsException2();
		
		try {
			
			test.loadClass("b.txt", "java.lang.String"); // try catch 씌워라
			
		} catch (FileNotFoundException | ClassNotFoundException e) { //비트연산자 사용 가능, //논리연산자 사용 가능한가?????
			
			e.printStackTrace();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		System.out.println("end");
	}

}
