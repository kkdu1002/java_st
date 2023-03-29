package jang8;

public class Ex_08_01 
{
	public static void main(String[] args) 
	{
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		/*
		 ~변수 , -변수 , 변수 + 변수 == > int로 인식
		 short s = -100 + 100(O)
		 short s = -a(X)
		 short s = -100(O)
		 char x = -100(x) , char x = 100(O)
		  
		  
		 */
		System.out.println("result1 = " + result1);
		System.out.println("result1 = " + result2);
		
		short s = 100;
		//short result3 = -s; 컴파일 에러
		int result3 = -s;
		System.out.println("result3 = " + result3);
		}

}
