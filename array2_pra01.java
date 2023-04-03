package jang11;

// int intArray[row : 행][col : 렬]

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
			1차원 배열일때 for each문으로 변경 : for(int i : 배열명)
			2차원 배열일때 for each문으로 변경 : for(int i[]: 배열명){
											for(int k : 변수명i){k출력}
											}
			3차원 배열일때 for each문으로 변경 : for(int i[][] : 배열명){
											for(int j[] : i){
												for(int k : j){
												k출력;
												}
											}
										}
		*/
		//for each
		int col = 0 , row = 0;
		for(int[] i: intArray)  // 행에 있는것을 int[] i 에 넣음
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
		
		System.out.print("지난 3년간의 매출 총액은 "+ sum + "이며 연 평균 매출은 "+ sum/intArray.length + "입니다.");
	}
}
