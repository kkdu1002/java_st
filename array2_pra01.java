package jang11;

// int intArray[row : ��][col : ��]

public class array2_pra01 
{
	public static void main(String[] args) 
	{
		int intArray[][] = {{90,90,110,110},
							{120,110,100,110},
							{120,140,130,150}};
		
		double sum = 0;
		/*
		for(int i = 0 ; i < intArray.length; i++) 
		{
			for(int j = 0; j < intArray[i].length;j++) 
			{
				sum += intArray[i][j];
				System.out.printf("[%d][%d] = %d ",i,j,intArray[i][j]);
			}
			System.out.println();
		}
		*/
		
		/*
			1���� �迭�϶� for each������ ���� : for(int i : �迭��)
			2���� �迭�϶� for each������ ���� : for(int i[]: �迭��){
											for(int k : ������i){k���}
											}
			3���� �迭�϶� for each������ ���� : for(int i[][] : �迭��){
											for(int j[] : i){
												for(int k : j){
												k���;
												}
											}
										}
		*/
		//for each
		int col = 0 , row = 0;
		for(int[] i: intArray)  // �࿡ �ִ°��� int[] i �� ����
		{
			for(int j : i)
			{
				sum += j;
				System.out.printf("[%d][%d] = %d ",row,col,j);
				col++;
			}
			col = 0;
			row++;
			System.out.println();
		}
		
		System.out.print("���� 3�Ⱓ�� ���� �Ѿ��� "+ sum + "�̸� �� ��� ������ "+ sum/intArray.length + "�Դϴ�.");
	}
}
