package jang8;

public class Ex_08_06 {

	public static void main(String[] args) {
		try 
		{
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}	
	}
	public static int safeAdd(int left , int right) 
	{
		if((right > 0)) 
		{
			// max : 2_147_483_647
			// 2_000_000_000 > 147_483_647 <--- (2_147_483_647 - 2_000_000_000 )
			if(left > Integer.MAX_VALUE - right) 
			{	// ���� ó������
				throw new ArithmeticException("�����÷ο� �߻�");
				// ArithmeticException�� ()�� ����
			}
		}
		else 
		{
			// min : -2_147_483_648
			// 2_000_000_000 < 147_483_647 <----- (- 2_147_483_648 - 2_000_000_000 )
			if(left < Integer.MIN_VALUE - right) 
			{
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		return left + right;
	}

}
