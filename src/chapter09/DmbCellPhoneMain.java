package chapter09;

public class DmbCellPhoneMain {

	public static void main(String[] args) {
		
		DmbCellPhone dmbcellphone = new DmbCellPhone("Javaphone", "검정", 10);
		
		//Cellphone으로부터 상속받은 필드
		System.out.println(dmbcellphone.model);
		System.out.println(dmbcellphone.color);
		System.out.println("---------");
		
		//DmbCellPhone으로부터 상속받은 필드
		System.out.println(dmbcellphone.model);
		System.out.println(dmbcellphone.color);
		System.out.println(dmbcellphone.channel);
		System.out.println("---------");
		
		//Cellphone의 메소드를 사용하여 전화통화 구현
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("send message");
		dmbcellphone.receiveVoice("receive message");
		dmbcellphone.hangUp();
		dmbcellphone.powerOff();
		System.out.println("---------");
		
		//DmbCellPhone의 메소드를 사용하여 채널을 변경
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeCannelDmb(3);
		System.out.println(dmbcellphone.channel);
		dmbcellphone.turnOffDmb();
		System.out.println("---------");
		
		
		CellPhone cp = dmbcellphone;
		System.out.println(cp.model);
		System.out.println(cp.color);
		System.out.println("---------");
	
	}

}
