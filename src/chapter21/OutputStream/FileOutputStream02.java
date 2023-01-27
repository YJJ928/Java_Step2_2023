package chapter21.OutputStream;

//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02 {
	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = null;
		fos = new FileOutputStream("output3.txt");
		
		fos.write(71); // G를 써넣음....
		fos.write(72); // H
		fos.write(73); // I
		
		fos.flush(); // 출력버퍼 비우기
		fos.close(); // 닫기
		
		System.out.println("파일이 생성되었습니다.");
		
	}

}
