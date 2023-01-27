package chapter21.Reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	
//	public static void main(String[] args) throws IOException {
//	
//		FileInputStream fis = null;
//		fis = new FileInputStream("reader.txt");
//		
//		int i;
//		while((i=fis.read()) != -1) {
//			System.out.println((char)i);
//		}
//		fis.close();
//		System.out.println("end");
//	}
	
	public static void main(String[] args) {
		
		try (FileReader fr = new FileReader("reader.txt")){
			int i;
			while((i = fr.read()) != -1) {
				System.out.println((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
