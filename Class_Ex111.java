package jang12;

public class Class_Ex111 
{
	public static void main(String[] args) 
	{
		Member555 mem = new Member555();
		// 1.객체 생성후 , 클래스 정보 얻기
		Class Member1 = mem.getClass();
		System.out.println(Member1.getName());
		System.out.println(Member1.getSimpleName());
		System.out.println(Member1.getPackage().getName());
		System.out.println();
		
		try
		{
			/*
			 Class 생성자가 있는데 감춰져(private)있어 new연산자로 객체 생성할 수 없음
			 Class.format("패키지명.클래스명"); 해서 class객체를 얻어와야함
			 2. 객체 생성 X 클래스 객체 얻어오기
			 db에 드리업 로딩할 때 사용
			*/
			Class Member2 = Class.forName("jang12.Member555");
			System.out.println(Member2.getName());
			System.out.println(Member2.getSimpleName());
			System.out.println(Member2.getPackage().getName());
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}

}
