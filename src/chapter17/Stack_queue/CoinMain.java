package chapter17.Stack_queue;

import java.util.Stack;

public class CoinMain {
	
	public static void main(String[] args) {
		
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(10));
		
		System.out.println(!coinBox.isEmpty()); 
		//coinbox가 비엇냐가 아니냐(안비었냐) = true
		
		while(!coinBox.isEmpty()) { //underflow를 막기위해...
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전: "+coin.getValue());
		} // coinbox가 비워지면 stop
		
	}

}
