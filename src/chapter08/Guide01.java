package chapter08;

public class Guide01 {
	
	static String point;
	Guest01[] guest; //n개 인 Guest배열
	
	public Guide01() {
		//Guide01 생성자 초기화		
	}
	public Guide01(int n) {
		point = "발리";
		guest = new Guest01[n];
		for(int i = 0 ; i < guest.length ; i++) {
			guest[i] = new Guest01(); // Guest01[] guest = new Guest01();
			
		}//Guest01을 끌어옴..
	}
	
	//선택에 따른 관광객 정보 등록
	public void list() {
		
	}
	

}
