package chapter19.Lambda;


@FunctionalInterface // 인터페이스로 구현하되 추상메서드가 하나만 존재할 수 있음.
//자원을 독립적으로 쓴다(혼자만)/병렬처리할 떄 많이 사용
//함수호출기능
//임포트시키는 것 라이브러리랑 동일
public interface Add {
	
	public int add(int x, int y);
	
//	public int sub(int n1, int n2); //에러남
	
//	public default int sub(int n1, int n2) { // default 붙여줘야 add()와 같이 쓸 수 있음.
//		return 0;
//	}
	
	
	
	
}
