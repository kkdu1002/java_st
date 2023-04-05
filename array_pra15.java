package jang12;

public class array_pra15 
{
	public static void main(String[] args) 
	{
		int score[] = {83 , 90, 87 , 93 , 87};
		int sum = 0;
		
		for(int i : score) 
		{
			sum += i;
		}
		System.out.printf("ÃÑÇÕ : %d\n",sum);
		System.out.println("Æò±Õ : " + sum / (double)score.length);
	}
}