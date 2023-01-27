package chapter21.InputStream;

//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest02 {
	
	public static void main(String[] args) throws IOException {
		//txt파일이 한글이면깨짐.....
//		FileInputStream fis  = null;
		FileReader fis = null;
		
		try {
//			fis = new FileInputStream("input.txt"); 
			fis = new FileReader("input.txt");
			//fis.read(): 파일을 끝까지 읽으면 -1을 반환해줌.
			int i;
			while((i = fis.read()) != -1) {
				System.out.print((char)i+" ");
			}
		} catch (IOException e) {
			e.printStackTrace();	
		} finally {
			try {
				fis.close();
			} catch (IOException e) { 
				System.out.println(e);
				//NullPointerException 을 잡지 못함..
			} catch (NullPointerException e) { //null값도 잡음
				System.out.println(e);
			}
		}
		System.out.println();
		System.out.println("end");
	}

}
