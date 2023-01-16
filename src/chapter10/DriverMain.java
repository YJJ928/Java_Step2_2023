package chapter10;

public class DriverMain {

	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Bus());
		//driver로 가서 bus넣었으니 bus의 객체인 run을 읽고 
		driver.drive(new Taxi());
		

	}

}
