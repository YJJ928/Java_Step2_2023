package chapter08;

public class Guest {
	
	//필드
	private String name;
	private String gender;

	public String getPoint() {
		return Guide.point; //static이라 "객체.요소" 형태로 불러올 수 있다.
	}
		
	//get,set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
//	public Guest() {
//		// TODO Auto-generated constructor stub
//	}
	
//	Guide guide = new Guide();
//	public void Guest(String name, String gender) {
//		this.name = name;
//		this.gender= gender;
//	}

}
