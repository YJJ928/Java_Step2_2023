package chapter20;

public class ArrayExceptionMain {
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
//		try {
//			for(int i = 0 ; i <= 5 ; i++) {
//				arr[i] = i+1;
//				System.out.print(arr[i]+" ");
//			}
//			
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println(e);
//		} finally {
//			//에러가 나던 나지 않던 무조건 수행
//			System.out.println("Finally");
//		}
//		System.out.println();
//		System.out.println("프로그램종료");
		
		try {
			for(int i = 0 ; i < 5 ; i++) {
				arr[i] = i+1;
				System.out.print(arr[i]+" ");
			}
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			//에러가 나던 나지 않던 무조건 수행
			System.out.println("Finally");
		}
		System.out.println();
		System.out.println("프로그램종료");
		
	}

}
