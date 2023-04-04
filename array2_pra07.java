package jang11;

public class array2_pra07 
{
	public static void main(String[] args) 
	{
		int [][]aa = new int [3][4];
		int count = 1;
		/*
		aa[0][0] = 1; aa[0][1] = 2; aa[0][2] = 3; aa[0][3] = 4;
		aa[1][0] = 5; aa[1][1] = 6; aa[1][2] = 7; aa[1][3] = 8;
		aa[2][0] = 9; aa[2][1] = 10; aa[2][2] = 11; aa[2][3] = 12;
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력");
		/*
		System.out.printf("%3d %3d %3d %3d\n",aa[0][0],aa[0][1],aa[0][2],aa[0][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[1][0],aa[1][1],aa[1][2],aa[1][3]);
		System.out.printf("%3d %3d %3d %3d\n",aa[2][0],aa[2][1],aa[2][2],aa[2][3]);
		*/
 // for

			for(int i = 0; i < aa.length; i++) 
		{
			for(int j = 0; j < aa[i].length;j++) 
			{
				aa[i][j] = count;
				count++;
				System.out.printf("%d\t",aa[i][j]);
			}
			System.out.println();
		}
			System.out.println("------------------------------");
		// for each 입출력
		
		count = 1;
		for(int[] i : aa)
		{
			for(int j : i) {
				j = count;
				count++;
				System.out.printf("%d\t",j);
			}
			System.out.println();
		}
		System.out.println("------------------------------");
	}
}