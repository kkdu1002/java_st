package jang12;

public class array_pra14 {

	public static void main(String[] args) 
	{
		if(args.length != 2)
		{
			System.out.println("���α׷��� ����");
			System.out.println("java MainStringArrayArgument num1 num");
			System.exit(0);
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.printf("%d + %d = %d",num1,num2,result);
	}

}
