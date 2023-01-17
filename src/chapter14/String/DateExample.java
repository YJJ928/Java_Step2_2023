package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	
	public static void main(String[] args) {
	
		Date now = new Date();
		
		System.out.println(now);
		
		String strNow1 = now.toString(); 
		// toString: date값인 now를 String으로 바꿔줌..
		// 객체(heap) => String의 타입
		System.out.println(strNow1); 
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //내가 원하는 형태로 뽑아 볼 수 있다.
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
//		System.out.println(sdf); //java.text.SimpleDateFormat@22a24fc 요상한 값...
		
		String strNow3 = sdf.toString(); //객체반환....?
		System.out.println(strNow3); //java.text.SimpleDateFormat@22a24fc 요상한 값...
	}
}
