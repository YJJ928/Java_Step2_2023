package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null; //선언만 하고 메모리는 아직
		
//		fis = new FileInputStream("a.txt"); //이렇게만 못씀
		//try catch를 사용해야한다.
		
		try { //open전용 try catch
			
			fis = new FileInputStream("a.txt"); //a.txt 파일을 가져와라
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			
		} finally {
			
			try { //close전용 try catch
				
				fis.close();
				
			} catch (IOException e) {
				
				e.printStackTrace();
				
			}
			System.out.println("Finally");
			
		}
		System.out.println("End");
		
	} //파일 찾을 수 없어 에러

}
