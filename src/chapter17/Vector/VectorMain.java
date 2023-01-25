package chapter17.Vector;

import java.util.List;
import java.util.Vector;

public class VectorMain {
	
	public static void main(String[] args) {
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		for(int i = 0 ; i <list.size() ; i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.contents+"\t"+board.writer);
		}
		
		list.remove(2); // 2번째를 지운다.
		
		System.out.println("----------------------------");
		
		for(int i = 0 ; i <list.size() ; i++) {
			Board board = list.get(i);
			System.out.println(board.subject+"\t"+board.contents+"\t"+board.writer);
		}
		
	}

}
