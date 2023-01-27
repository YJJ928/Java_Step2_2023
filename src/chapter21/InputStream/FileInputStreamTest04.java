package chapter21.InputStream;

import java.io.FileInputStream;
//import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest04 {
	
	public static void main(String[] args) throws IOException {
			
		try (FileInputStream fis = new FileInputStream("input2.txt")){
			
			byte[] bs = new byte[10]; // 버퍼로 활용..
			
			int i;
			
			while((i = fis.read(bs)) != -1) { //bs만큼 읽어라..
				//버퍼읽기: 10개씩 출력 / garbage값 안나옴
				
				for(int j = 0 ; j < i ; j++) {
					System.out.print((char)bs[j]+" ");
				}
				
				System.out.println(" : "+i+" byte 읽음");
			}
			
		} catch (IOException e) {
			e.printStackTrace();	
		} 
//			finally {
//			try {
//				fis.close();
//			} catch (IOException e) { 
//				System.out.println(e);
//				//NullPointerException 을 잡지 못함..
//			} catch (NullPointerException e) { //null값도 잡음
//				System.out.println(e);
//			}
//		}
		System.out.println();
		System.out.println("end");
	}

}
