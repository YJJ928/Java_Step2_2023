package chapter21.InputStream;

import java.io.IOException;

public class SystemTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("알파벳 여러개를 쓰고[Enter]를 누르세요.");
		
		
		int i;
		try {
			while ((i = System.in.read()) != '\n') { // 엔터가 없을때까지
				System.out.println(i + " "+ (char)i); //아스키코드 + 아스키코드를 문자
			}
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
		
	}

}
