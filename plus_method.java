package jang12;

public class plus_method 
{
	public int plus(int v1 , int v2)
	{
		int result;
		result = v1 + v2;
		return result;
	}
	public static void main(String[] args) 
	{
		int hap;
		//��ü ������ ���� , ��ü��.�޼ҵ�(��,��);
		plus_method p = new plus_method();
		hap = p.plus(100,200);
		System.out.printf("100�� 200�� plus()�޼ҵ� ����� : %d\n",hap);
	}
}
