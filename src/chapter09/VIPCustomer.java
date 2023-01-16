package chapter09;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
//		this.customerID = customerID; //위에 super가 this.~~의 역할을 한다.
//		this.customerName = customerName;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		this.agentID = agentID; //전문상담원
		saleRatio = 0.1;
		//this.saleRatio = 0.1; 와 동일한 것이다. (this.가 생략 가능한 것이다.)
	}
	//포인트적립 & 물건가격
	@Override
	public int calcPrice(int price) {
		bonusPoint =(price-(int)(saleRatio*price))*bonusRatio;
		return price = (int)(price - price*saleRatio); //물건가격
	}
	
	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문상담원은 "+agentID+" 입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
	
	
}
