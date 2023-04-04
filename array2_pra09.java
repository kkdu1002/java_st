package jang11;

public class array2_pra09 
{
	public static void main(String[] args) 
	{
		double array[][] = new double [3][];
		
		array[0] = new double[2];
		array[1] = new double[3];
		array[2] = new double[2];
		
		double count = 1;
		
		for(int i = 0; i < array.length;i++) 
		{
			for(int j = 0; j < array[i].length;j++)
			{
				array[i][j] = count;
				System.out.printf("%.1f\t",count++);
			}
			System.out.println();
		}
		System.out.println("-----------for each-----------");
		count = 1;
		for(double i[] : array) 
		{
			for(double j : i) 
			{
				j = count++;
				System.out.printf("%.1f\t",j);
			}
			System.out.println();
		}
	}
}