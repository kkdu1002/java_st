package jang11;

public class array_return_pra { 
		static int[] makeArray(int a) 
		{
			int temp[] = new int[4];
			int sum = 0;
			for (int i = 0; i < temp.length; i++) {
				temp[i] = i;
				sum += i;
			}
			System.out.println("ÇÕ°è : " + (sum + a));
			return temp;
		}
		public static void main (String[] args) 
		{	
			int intArray [];
			intArray = makeArray(10);
			for (int i = 0; i < intArray.length; i++)
				System.out.println(intArray[i]);
		}
	}
