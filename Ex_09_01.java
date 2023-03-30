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
			System.out.printf("점수 : %d\n",score);
			if(score >= 90) 
			{
				if(score >=95) 
				{
					result = "A+ 입니다.";
				}
				else
				{
					result = "A 입니다.";
				}
			}
			else if(score >= 80) 
			{
				if(score >=85) 
				{
					result = "B+ 입니다.";
				}
				else
				{
					result = "B 입니다.";
				}	
			}
			else if(score >= 70) 
			{
				if(score >=75) 
				{
					result = "C+ 입니다.";
				}
				else
				{
					result = "C 입니다.";
				}
			}
			System.out.printf("학점 : %s\n",result);
		}
	}
}