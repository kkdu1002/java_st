package jang12;

public class overloading 
{
	// �޼ҵ� �����ε�
	//(�޼ҵ� �̸��� �������� ������ ���� , �������� �ݵ��(Ÿ��,������ �޶����)
	// �ϳ��� �޼ҵ� ������ �پ��� �۾��� �� �� �ִ�. ��� x
	public int getSum(int i, int j) 
	{
		return i + j;
	}
	public int getSum(int i, int j , int k) 
	{
		return i + j + k;
	}
	public double getSum(double i, double j) 
	{
		return i + j;
	}
	public static void main(String[] args) 
	{
		overloading o = new overloading();
		int i = o.getSum(1, 2);
		int j = o.getSum(1, 2, 3);
		double k = o.getSum(1.1, 2.2);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}
}