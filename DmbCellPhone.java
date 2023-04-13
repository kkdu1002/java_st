package jang12;

public class DmbCellPhone extends CellPhone
{
	int channel;
	DmbCellPhone(String model , String color , int channel)
	{
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	void turnOnDmb()
	{
		System.out.println("채널 : " + channel + "번 Dmb방송 수신을 시작합니다.");
	}
	void ChangeChannelDmb(int channel)
	{
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb()
	{
		System.out.println("Dmb방송 수신을 멈춥니다.");
	}
	public static void main(String[] args) 
	{
		DmbCellPhone dmb_phone =  new DmbCellPhone("자바폰","검정",10);
		System.out.println("모델 : " + dmb_phone.model);
		System.out.println("색상 : " + dmb_phone.color);
		
		System.out.println("채널 : " + dmb_phone.channel);
		
		dmb_phone.powerOn();
		dmb_phone.bell();
		dmb_phone.sendVoice("여보세요");
		dmb_phone.receiveVoice("안녕하세요! 저는 홍길동인데요");
		dmb_phone.sendVoice("아~ 예 반갑습니다");
		dmb_phone.hangup();
		dmb_phone.turnOnDmb();
		dmb_phone.ChangeChannelDmb(12);
		dmb_phone.turnOffDmb();
	}

}
