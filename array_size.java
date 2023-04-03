package jang11;

public class array_size 
{
	public static void main(String[] args) 
	{
		int aa[] = {10,20,30,40,50};
		int count , size;
		
		count = aa.length;
		size = count * Integer.BYTES;
		
		System.out.printf("배열aa[]요소의 개수는 %d 개 입니다.\n",count);
		System.out.printf("배열aa[]요소의 전체 크기는 %d 바이트 입니다.\n",size);
	}
}