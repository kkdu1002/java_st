package jang12;
/*
	3. Local class : �ܺ�Ŭ������ �޼��峪 �ʱ�ȭ�� �ȿ� �����Ͽ�, ����� ���� ���ο����� ��� �� �� �ִ�.
 */
public class LocalClass 
{
	int a = 100;
//	�޼ҵ� ����
	public void innerTest(int k)
	{
//		final ��������(JDK1.8���� �������� , ���������� �� final�����)
		int b = 200; // == final int b = 200;
		final int c = k;
		
//		���� ���� Ŭ���� ����
		class localInner
		{
//			���, ��������
//			���� Ŭ������ ������ �޼ҵ峻�� ���ǵ� �������� ����
			public void getData()
			{
				System.out.println("int a = " + a);
				System.out.println("int b = " + b); // ���Ҵ� �Ұ�
				System.out.println("final int c = " + c);
				System.out.println("method = " + method());
			}	
		};
		localInner i = new localInner(); // ������ �޼ҵ� ���� ���� ����
		i.getData();
		
	}
	public int method()
	{
		int m = 2;
		return m;
	}
	public static void main(String[] args) 
	{
		LocalClass outer = new LocalClass(); // �ܺ�Ŭ���� ��ü����
		outer.innerTest(1000); // �ܺ�Ŭ���� �޼ҵ� ȣ��
		
	}
}