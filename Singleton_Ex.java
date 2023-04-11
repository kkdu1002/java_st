package jang12;

public class Singleton_Ex 
{
	public static void main(String[] args) 
	{
//		SingleTon244 obj1 = new SingleTon244();
//		SingleTon244 obj2 = new SingleTon244();
		
		SingleTon244 obj1 = SingleTon244.getInstance();
		SingleTon244 obj2 = SingleTon244.getInstance();
		
		if(obj1 == obj2)
		{
			System.out.println("같은 SingleTon 객체입니다.");
		}
		else
		{
			System.out.println("다른 SingleTon 객체입니다.");
		}
	}
}