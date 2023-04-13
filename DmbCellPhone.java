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
		System.out.println("ä�� : " + channel + "�� Dmb��� ������ �����մϴ�.");
	}
	void ChangeChannelDmb(int channel)
	{
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	void turnOffDmb()
	{
		System.out.println("Dmb��� ������ ����ϴ�.");
	}
	public static void main(String[] args) 
	{
		DmbCellPhone dmb_phone =  new DmbCellPhone("�ڹ���","����",10);
		System.out.println("�� : " + dmb_phone.model);
		System.out.println("���� : " + dmb_phone.color);
		
		System.out.println("ä�� : " + dmb_phone.channel);
		
		dmb_phone.powerOn();
		dmb_phone.bell();
		dmb_phone.sendVoice("��������");
		dmb_phone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmb_phone.sendVoice("��~ �� �ݰ����ϴ�");
		dmb_phone.hangup();
		dmb_phone.turnOnDmb();
		dmb_phone.ChangeChannelDmb(12);
		dmb_phone.turnOffDmb();
	}

}
