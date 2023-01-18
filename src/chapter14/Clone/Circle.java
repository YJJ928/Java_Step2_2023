package chapter14.Clone;

public class Circle implements Cloneable{
	
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		// 생성자를 통해서 다른 클래스의 객체 생성
		point = new Point(x, y);
		this.radius = radius;
	} //Circle method

	//클래스의 객체 복사
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	} //@Override

	@Override
	public String toString() { //toString: 객체가 가지고 있는 값을 반납해줌..
		
		return "원점은 "+point+" 이고, 반지름은 "+radius+" 입니다.";
	} //@Override
	
	
	
	
	
} // class Circle
