package chapter09;

public class Customer {
	
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	public double bonusPoint;
	protected double bonusRatio;
	
	
	//기본생성자
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 포인트비율
	}
	
	//overloading
	public Customer(int customerID, String customerName) {
//		super();
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01; // 포인트비율
	}
	public int getCustomerID() {
		return customerID;
	}
	
	//포인트와 가격
	public int calcPrice(int price) {
		bonusPoint += bonusPoint + bonusRatio*price;
		return price;
	} 
	
	public String showCustomer() {
		return customerName+"님의 등급은 "+customerGrade+" 이고, 보너스 포인트는 "+bonusPoint+"P 입니다.";
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	

}
