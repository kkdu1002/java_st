package jang12;

class CurrencyConverter
{
	private static double rate;
	// �Ϲ� �޼ҵ� == non-static , static(Ŭ���� = ����) / non-static(�ν��Ͻ� = ����) ����
	public static double toDollar(double won)
	{
//		this = error;
		return won / rate;
	}
	public double toDollar2(double won) 
	{
		int value = 0;
		System.out.println("�Ϲ� �޼ҵ�");
		return won / rate;
	}
	// static �޼ҵ� 
	public static double toKWR(double dollar)
	{
		// value = 0; // ���� ������ static ����� �;���
		return dollar * rate;
	}
	public static void setRate(double r) 
	{
//		this.rate = rate; this ��� �Ұ�
		System.out.println("static �޼ҵ�");
		rate = r;
	}
}
public class change_dal 
{
	public static void main(String[] args) 
	{
		CurrencyConverter.setRate(1121);
		CurrencyConverter CurrencyConverter2 = new CurrencyConverter();
		System.out.println("�鸸���� " + CurrencyConverter.toDollar(1000000) + "�޷� �Դϴ�.");
		System.out.println("�̹鸸���� " + CurrencyConverter2.toDollar2(2000000) + "�޷� �Դϴ�.");
		System.out.println("��޷��� " + CurrencyConverter.toKWR(100) + "�� �Դϴ�.");
	}

}
