package chapter17.HashSet;

import java.util.HashSet;
//import java.util.Random;

public class SetNumber {
	
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			int v = (int) (Math.random()*45+1);
//			int v2 = new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size() >= 6) {
				break;	
			}

		} 
		System.out.println(hs);
		
	}

}
