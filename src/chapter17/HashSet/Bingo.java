package chapter17.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Bingo {
	
	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<Integer>();
		int[][] board = new int[5][5];

		for(int i = 0 ; set.size() < 25 ; i++) { //set.size: 5*5 = 25
			set.add(new Random().nextInt(50)+1);
		}
		Iterator<Integer> it = set.iterator();
		
		for (int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++) {
				board[i][j] = (Integer) it.next(); // 언박싱
				System.out.printf("%2d ", board[i][j]); // %decimal type의 2자리
			}
			System.out.println();
		}
	}

}
