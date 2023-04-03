package jang11;

public class array_pra5
{
	public static void main(String[] args) 
	{
		int aa[] = {100,200,300,400};
		int bb[] = new int[] {100,200,300};
		
		int cc[];
		cc = new int[2] ;
		cc[0] = 100;
		cc[1] = 200;
		
		int dd[] = new int [1];
		dd[0] = 100;
		int i;
		
		for(i = 0; i < aa.length; i++) 
		{
			System.out.printf("aa[%d] ==> %d\t",i,aa[i]);
		}
		System.out.println();
		
		for(i = 0; i < bb.length; i++) 
		{
			System.out.printf("bb[%d] ==> %d\t",i,bb[i]);
		}
		System.out.println();
		
		for(i = 0; i < cc.length; i++) 
		{
			System.out.printf("cc[%d] ==> %d\t",i,cc[i]);
		}
		System.out.println();
		
		for(i = 0; i < dd.length; i++) 
		{
			System.out.printf("dd[%d] ==> %d\t",i,dd[i]);
		}
		System.out.println();
	}
}