package jang8;

public class Ex_08_01 
{
	public static void main(String[] args) 
	{
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		/*
		 ~���� , -���� , ���� + ���� == > int�� �ν�
		 short s = -100 + 100(O)
		 short s = -a(X)
		 short s = -100(O)
		 char x = -100(x) , char x = 100(O)
		  
		  
		 */
		System.out.println("result1 = " + result1);
		System.out.println("result1 = " + result2);
		
		short s = 100;
		//short result3 = -s; ������ ����
		int result3 = -s;
		System.out.println("result3 = " + result3);
		}

}
