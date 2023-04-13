package jang12;

public class Tire 
{
	public int maxRotation; //�ִ� ȸ����
	public int accumulatedRotation; // ����ȸ����
	public String location; // Ÿ�̾� ��ġ
	
	public Tire(String location , int maxRotation)
	{
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll()
	{
		++accumulatedRotation;
		if(maxRotation > accumulatedRotation)
		{
			System.out.println(location + "���� ȸ���� : " + (maxRotation - accumulatedRotation));
			return true;
		}
		else
		{
			System.out.println(location + "Ÿ�̾� ��ũ");
			return false;
		}
	}
}