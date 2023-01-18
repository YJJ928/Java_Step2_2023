package chapter14.Clone;

public class Point {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	} // constructor
	
	@Override
	public String toString() { //toString: 객체가 가지고 있는 값을 반납해줌..
		
		return "x = "+x+", y = "+y;
	} //@Override
	
} // class Point
