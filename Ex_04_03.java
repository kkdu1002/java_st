package jang3;

public class Ex_04_03 
{
	public static void main(String[] args) 
	{
		int a = 10;
		
		a++;
		System.out.println("a ++ == >" + " " + a);
//		System.out.printf("a ++ == > %d\n",a);
		
		a--;
		System.out.println("a -- == >" + " " + a);
//		System.out.printf("a -- == > %d\n",a);
		
		a += 5;
		System.out.println("a += 5 == >" + " " + a);
//		System.out.printf("a += 5 == > %d\n",a);
		
		a -= 5;
		System.out.println("a -= 5 == >" + " " + a);
//		System.out.printf("a -= 5 == > %d\n",a);
		
		a *= 5;
		System.out.println("a *= 5 == >" + " " + a);
//		System.out.printf("a *= 5 == > %d\n",a);
		
		a /= 5;
		System.out.println("a /= 5 == >" + " " + a);
//		System.out.printf("a /= 5 == > %d\n",a);
		
		a %= 5;
		System.out.println("a %= 5 == >" + " " + a);
//		System.out.printf("a %%= 5 == > %d\n",a);
	}
}
