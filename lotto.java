package jang12;

public class lotto 
{
	static int lottoNum() 
	{
		return (int)(Math.random() * 45 + 1);
	}
	public static void main(String[] args) 
	{
		System.out.println("** �ζ� ��÷�� �����մϴ�. **\n");
		
		int lotto_num[] = new int [6];
		int num;
		char e = 'E';
		
		for(int i = 0; i < 6;) 
		{
			num = lottoNum();
			for(int j = 0; j < 6; j++) 
				if(lotto_num[j] == num) 
					e = 'D';
			if(e == 'E')
				lotto_num[i++] = num;
			else
				e = 'E';
		}
		System.out.print("��÷�� �ζ� ��ȣ ==>  ");
		for(int i = 0; i < 6; i++) 
		{
			System.out.printf("%d\t",lotto_num[i]);
		}
		
	}
}

/*
		int lotto_num;
		System.out.print("��÷�� �ζ� ��ȣ ==>  ");
		for(int i = 0; i < 6; i++) 
		{
			lotto_num = (int)(Math.random() * 45 + 1);
			System.out.printf("%d\t",lotto_num);
		}
 * */
