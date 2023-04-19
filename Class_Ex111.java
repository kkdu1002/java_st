package jang12;

public class Class_Ex111 
{
	public static void main(String[] args) 
	{
		Member555 mem = new Member555();
		// 1.��ü ������ , Ŭ���� ���� ���
		Class Member1 = mem.getClass();
		System.out.println(Member1.getName());
		System.out.println(Member1.getSimpleName());
		System.out.println(Member1.getPackage().getName());
		System.out.println();
		
		try
		{
			/*
			 Class �����ڰ� �ִµ� ������(private)�־� new�����ڷ� ��ü ������ �� ����
			 Class.format("��Ű����.Ŭ������"); �ؼ� class��ü�� ���;���
			 2. ��ü ���� X Ŭ���� ��ü ������
			 db�� �帮�� �ε��� �� ���
			*/
			Class Member2 = Class.forName("jang12.Member555");
			System.out.println(Member2.getName());
			System.out.println(Member2.getSimpleName());
			System.out.println(Member2.getPackage().getName());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
