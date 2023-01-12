package chapter08;

public class Guest01 {
	
	private String name;
	private String gender;
	
	private String getPoint() {
		return Guide01.point; //static인 String point를 만든다.
	}

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
		

}
