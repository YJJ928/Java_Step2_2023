package chapter14.Clone;

public class SyetemTimeMain {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		int sum = 0;
		
		for(int i = 1 ; i <= 100000 ; i++) {
			sum += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1 ~ 100000 까지의 합 : "+sum);
		System.out.println("계산소요시간(nano sec) : "+(time2 - time1));
	}

}
