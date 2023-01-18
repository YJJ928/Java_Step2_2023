package chapter14.Hashcode;

public class Key {
	
	public int number;
	public int name;
	public int address;
	
	public Key(int number) {
		this.number = number;
	} // Key method()

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Key) {
			Key compareKey = (Key) obj; //Casting해준다..Key.
			if(this.number == compareKey.number) {
				return true; //값 일치...?
			} 
		}
		return false;
	} // @Override
	
	@Override
	public int hashCode() {
//		return super.hashCode(); //원래 heap 메모리 16진수 주소 반환
		return number; //원래 heap 메모리 16진수 주소 반환..?
	} // @Override
	

} // class Key
