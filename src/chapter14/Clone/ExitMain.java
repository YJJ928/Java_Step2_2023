package chapter14.Clone;

public class ExitMain {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
			if(i == 5) {
//				System.exit(i); //5일때 찍고 빠져나옴..아래 종료코드가 안찍힘
				//main method에서 나감
				break;
				//for에서 나감
			}
		}
		System.out.println("종료코드");
	} // main
	
} // class ExitMain
