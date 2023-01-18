package chapter15;

public class StBufferMain1 {

	public static void main(String[] args) {
		
		StringBuffer buf = new StringBuffer("NiceDay");
		System.out.println(buf.toString()); //NiceDay
		System.out.println(buf.length()); //7
		//StringBuffer의 기본 용량 16 + 추가(7) = 23 
		System.out.println(buf.capacity()); //23
		buf.ensureCapacity(48); 
		// 23을 넘어가면 허용범위 (24 ~ 48) 까지는 갖고있는 용량*2+2 = 
		System.out.println(buf.capacity()); //23이면 23/24~48이면 48/49부터 갖고있는 용량
		buf.insert(0, "Hi! ");
		System.out.println(buf);
		buf.insert(11, " everybody!");
		System.out.println(buf);
		buf.delete(0, 4);
		System.out.println(buf);
	
	}
}
