package jang10;

public class Ex_10_09 
{
	public static void main(String[] args) 
	{
		int count = 1 , result = 0;
		
		while(count <= 100) 
		{
			result += count;
			if(count % 10 == 0) 
			{
				System.out.printf("1 ~ %d 까지의 합 : %d\n",count,result);
			}
			count++;
		}
	}
}