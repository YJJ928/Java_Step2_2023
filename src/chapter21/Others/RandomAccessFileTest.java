package chapter21.Others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	
	//입출력 클래스 중에서 유일하게 입출력이 동시에 가능한 클래스
	//포인터를 이용하여 동시에 입출력이 가능함
	//다양한 자료형 메소드 제공
	
	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100); //4
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer()); // int라서 4바이트..?
		rf.writeDouble(3.14f); //8
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer()); // 4 + 8 = 12
		rf.writeUTF("눈이옵니다"); //3 x 5 = 15 + 2(기본값) = 17
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer()); // 12 + 17 = 29

		rf.seek(0);
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer()); // 0
		rf.seek(4);
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer()); // 4
		
		int i = rf.readInt();
		Double d = rf.readDouble();
		String u = rf.readUTF();
		
		System.out.println("------------");
		System.out.println("파일 포인터의 위치: "+rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(u);
	}

}
