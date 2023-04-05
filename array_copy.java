package jang12;

public class array_copy {

	public static void main(String[] args) 
	{
		int oldIntArray[] = {1,2,3};
		int newIntArray[] = new int[5];

		for(int i = 0; i < oldIntArray.length;i++)
		{
			newIntArray[i] = oldIntArray[i];
		}
		for(int i = 0; i < newIntArray.length;i++) 
		{
			System.out.print(newIntArray[i] + ", ");
		}
		// 1. 값 복사 후 hashCode
		System.out.println("\n"+newIntArray.hashCode()); 
		System.out.println(oldIntArray.hashCode());
		
		// 2. 주소 대입 후 hashCode
		int[] newIntArray2 = oldIntArray; // 얕은 복사(주소 == 주소) 
		System.out.println("\n"+newIntArray2.hashCode());
		System.out.println(oldIntArray.hashCode());
	}

}
