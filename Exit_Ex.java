package jang12;

public class Exit_Ex 
{
	public static void main(String[] args)
	{	// Ư�� ���̸� ������ ��
		// ���� �����ڸ� ���� �����ؼ� ���� ���°� Ȯ��
		System.setSecurityManager(new SecurityManager()
		{
			@Override
			public void checkExit(int status)
			{
				if(status != 5)
				{	// ���� ���� Ȯ��
					// ���� ������ �߻�
					throw new SecurityException("5�� �ƴϱ��� ����ó���� ���ϴ�.");
				}
			}
		});
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
			try
			{
				//JVM ���� ��û
				System.exit(i); // ȣ��Ǹ� ���� �����ڰ� �ڵ� ȣ��
			}
			catch(SecurityException e)
			{
				
			}
		}
	}
}