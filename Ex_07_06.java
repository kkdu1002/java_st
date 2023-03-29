package jang7;

public class Ex_07_06 
{
	public static void main(String[] args) 
	{
		int i , result = 0 ;
		
A:		for(;;) 
		{
			for (i = 1 ; i <= 100; i++) 
			{
				result += i;
				if(result > 2000) {
					System.out.printf("%d\n",result);
					result = 0;
					break A;
				}
			}
		//	break;
	//		System.out.println("아직도 반복중");
		}
	}
}