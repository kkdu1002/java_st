package jang11;

public class array_usemain 
{
	public static void main(String[] args) 
	{
		double sum = 0;
		
		for(int i = 0; i < args.length; i++) 
		{
			sum += Double.parseDouble(args[i]);
		}
		System.out.printf("ÇÕ°è : %.1f\n",sum);
		System.out.printf("Æò±Õ : %.14f",sum/args.length);
	}
}