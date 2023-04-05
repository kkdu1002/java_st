package jang12;

public class array_pra13 
{
	public static void main(String[] args) 
	{	
		int score[] = {83, 90, 87};
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) 
		{
			sum += score[i];
		}
		System.out.printf("ÃÑÇÕ : %d\n",sum);
		System.out.println("Æò±Õ :" + sum / (double)score.length);
	}
}