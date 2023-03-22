package jang2;

public class Ternary_Operator {

	public static void main(String[] args) {
		int a = 3 , b = 5 , result = 0;
		
		System.out.println("------ 3항 연산자(조건연산자)로 출력 ------");
		System.out.println("두 수의 차는 " + ((a > b) ? ( a - b) : (b - a)));
		
		System.out.println("------ 3항 연산자(조건연산자)로 출력 result ------");
		System.out.println("두 수의 차는 " + ((a > b) ? (result = a - b) : (a < b) ? (result = b - a) : 0));
		//                                   if                         else if                     else
		
		System.out.println("------ if문으로 출력 ------");
		if(a > b) 
			System.out.println("두 수의 차는 " + (a - b));
		else
			System.out.println("두 수의 차는 " + (b - a));
		
		System.out.println("------ else if문으로 출력 ------");
		if (a > b) 
		{
			result = a - b;
			System.out.println("두 수의 차는 " + result);
		}
		else if (a < b) 
		{
			result = b - a;
			System.out.println("두 수의 차는 " + result);
		}
		else 
		{
			System.out.println(0);
		}
	}

}
