package jang12;

public class book2 
{
	String title;
	String author;
	int ISBN;
	
	public book2(String title,String author,int ISBN) 
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("���� 3�� ȣ��");
	}
	// �޼ҵ� �ߺ� Overloading : �ϳ��� �޼ҵ������ �پ��� �۾��� �Ѵ�.
	public book2(String title,int ISBN) 
	{	// ������ ù�ٿ� �;��ϰ� , ������ �������� ����ؾ� ��.
		this(title,"Anonymous",ISBN);
		System.out.println("���� 2�� ȣ��");
	}
	
	public book2() 
	{	// ��Ӱ��迡�� ����Ʈ �����ڴ� ��� x
		// super(); �θ�ü�� �����ڸ� ȣ��
		this(null,null,0);
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}
	
	public static void disp(book2 javaBook)
	{
		System.out.println("------------------------");
		System.out.println("å ���� :" + javaBook.title);
		System.out.println("å ���� :" + javaBook.author);
		System.out.println("���ڵ��ȣ :" + javaBook.ISBN);
	}
	public static void main(String[] args) 
	{
		book2 javaBook = new book2("java","Ȳ����",3333);
		book2 holyBible = new book2("holyBible",1);
		book2 emptyBook = new book2();
		
		disp(javaBook);
		disp(holyBible);
		disp(emptyBook);
	}
}