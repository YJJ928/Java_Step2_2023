package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class BankMain {

	public static void main(String[] args) {
		
//		Bank bk1 = new Bank("강남점", "010-0000-0000");
//		// bk1.interest = 0.2f; //권장하지 않음...
//		Bank.interest = 0.2f;
//		
//		bk1.getBank();
//		
//		System.out.println("============");
//		
//		Bank bk2 = new Bank("일산점", "010-1111-2222");
//
//		bk2.getBank();
//		
//		Bank.interest = 0.1f;
//		System.out.println("============");
//		bk1.getBank();
//		bk2.getBank();
		
		//방법2
		String point = null;
		String tel = null;
		Scanner scan = new Scanner(System.in);
		
		point = JOptionPane.showInputDialog("지점명");
		tel = JOptionPane.showInputDialog("전화번호");
		Bank bank = new Bank(point, tel);
		
		System.out.print(point+"의 이자를 입력하세요> ");
		Bank.interest = scan.nextFloat();
		System.out.println("-------------");
		bank.getBank();
		
	}

}
