package jang11;

public class array_pra6 
{
	public static void main(String[] args) 
	{
		int aa [] = new int [100];
		int bb [] = new int [100];
		int i;
		
		for(i = 0; i < aa.length;i++) 
		{
			aa[i] = i * 2;
		}
		for(i = 0; i < aa.length; i++) 
		{
			bb[i] = aa[(aa.length - 1) - i];
		}
		System.out.printf("bb[0]에는 %d , bb[99]에는 %d가 입력됨",bb[0],bb[99]);
	}
}