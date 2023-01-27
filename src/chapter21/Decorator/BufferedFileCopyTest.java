package chapter21.Decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest {
	
	public static void main(String[] args) {
		
		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip");
			BufferedInputStream bis = new BufferedInputStream(fis); //buffer를 끼워서 stream을 돌린다.,,,? 속도차이가 난다.
			BufferedOutputStream bos = new BufferedOutputStream(fos)
			) {
			
			millisecond = System.currentTimeMillis();
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			millisecond = System.currentTimeMillis() - millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일을 복사하는데 걸리는시간: "+millisecond+" ms");
		
	}

}
