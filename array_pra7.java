package jang11;

public class array_pra7 
{
	public static void main(String[] args) 
	{
		int Input_array[] = new int[] {4,7,9,1,3,2,5,6,8};
		
		System.out.printf("�迭 ��� ��ü ���\n");
		for(int i = 0; i <Input_array.length; i++) 
		{
			System.out.printf("%d ",Input_array[i]);
		}
		
		System.out.printf("\n¦�� ������ ���\n");
		for(int i = 0; i <Input_array.length; i++) 
		{
			if(Input_array[i] % 2 == 0)
				System.out.printf("%d ",Input_array[i]);
		}
		
		System.out.printf("\n3�� ��� ������ ���\n");
		for(int i = 0; i <Input_array.length; i++) 
		{
			if(Input_array[i] % 3 == 0)
				System.out.printf("%d ",Input_array[i]);
		}
	}
}