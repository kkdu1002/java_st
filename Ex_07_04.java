package jang7;

public class Ex_07_04 
{
	public static void main(String[] args) 
	{
		int result = 0, i;
		for(i = 1 ; i <= 100 ; i++) 
		{
			result += i;
			if(result > 1000)
				break;
		}
		System.out.printf("1 ~ 100�� �տ��� ���ʷ� 1000�� �Ѵ� ��ġ��? : %d",i);
	}
}