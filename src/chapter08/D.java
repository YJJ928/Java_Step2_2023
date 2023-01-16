package chapter08;

import chapter09.A;

public class D extends A{

	public static void main(String[] args) {
		//System.out.println(field); //field가 불러와지지 않음.
		//package가 다른 상태에서 import를 했더라도,
		//protected 로 되어 있기 때문에 불러올 수 없다.
		//System.out.println(this.field); //오류
		

	}

}
