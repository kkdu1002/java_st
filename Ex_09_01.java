package jang9;

public class Ex_09_01 
{
	public static void main(String[] args) 
	{
		int score = 0;
		String result = " ";
		while(score != 100) 
		{
			score = (int)(Math.random()*31) + 70;
			System.out.printf("���� : %d\n",score);
			if(score >= 90) 
			{
				if(score >=95) 
				{
					result = "A+ �Դϴ�.";
				}
				else
				{
					result = "A �Դϴ�.";
				}
			}
			else if(score >= 80) 
			{
				if(score >=85) 
				{
					result = "B+ �Դϴ�.";
				}
				else
				{
					result = "B �Դϴ�.";
				}	
			}
			else if(score >= 70) 
			{
				if(score >=75) 
				{
					result = "C+ �Դϴ�.";
				}
				else
				{
					result = "C �Դϴ�.";
				}
			}
			System.out.printf("���� : %s\n",result);
		}
	}
}