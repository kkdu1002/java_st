package jang12;

public class book 
{
	// �ν��Ͻ� ��� ���� , ��ü ������ , ��ü��.�ʵ�� , ��ü���� ������
	String title;
	String author;
	int ISBN;
	// Ŭ���� �������, Ŭ������.�ʵ�� , Ŭ���� �޸𸮿��� ���� , ��簴ü���� �Ȱ��� ���� ���� == ����
	static int value;
	// ���ڰ��� �ִ� ������
	public book(String title,String author , int ISBN)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("���� 3���� ����������");
	}
	// �⺻ ������
	public book() 
	{
		System.out.println("�⺻ ������");	
	}
	//setter(),getter()
	public String getTitle() 
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getAuthor() 
	{
		return author;
	}
	
	public void setAuthor(String author) 
	{
		this.author = author;
	}
	
	public int getIsbn() 
	{
		return ISBN;
	}
	
	public void setIsbn(int ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public void disp(book javaBook)
	{
		System.out.println("å ���� :" + javaBook.title);
		System.out.println("å ���� :" + javaBook.author);
		System.out.println("���ڵ��ȣ :" + javaBook.ISBN);
		System.out.println("������ �� ���� :" + value);
	}
	
	public static void staticDisp(book javaBook)
	{
		System.out.println("å ���� :" + javaBook.getTitle());
		System.out.println("å ���� :" + javaBook.getAuthor());
		System.out.println("���ڵ��ȣ :" + javaBook.getIsbn());
		System.out.println("������ �� ���� :" + value);
	}
	
	public static void main(String[] args) 
	{
		book javaBook = new book("Java JDK","Ȳ����",3333);
		System.out.println("������ å ���� :" + value);
		value = 20000; // ���� Ŭ���� �������� Ŭ������ ���� ���� 
//		javaBook.value = 20000;
//		book.value = 20000;
		
/*		// Ÿ Ŭ�������� �� �̷��� ����
		System.out.println("å ���� :" + javaBook.title);
		System.out.println("å ���� :" + javaBook.author);
		System.out.println("���ڵ��ȣ :" + javaBook.ISBN);
		System.out.println("������ �� ���� :" + value);*/
		
		// Ŭ������ ��ü�� �����ϱ� ���� ���赵, Ʋ�̴�.
		// ��ü�� ���赵 �Ǵ� Ʋ�� �� ��ü�̴�
		book javaBook2 = new book();
		
		//����������� ���� �ʱ�ȭ
		javaBook2.title = "�ڹ� ���α׷���";
		javaBook2.author = "���糲";
		javaBook2.ISBN = 8888;
		value = 30000;
		
		javaBook.disp(javaBook); // �޼ҵ� ȣ��
		javaBook.disp(javaBook2);
		
		book javaBook3 = new book();
		//setter�� �ʱ�ȭ
		javaBook3.setTitle("Html5");
		javaBook3.setAuthor("Html5����");
		javaBook3.setIsbn(6666);
		javaBook3.value = 50000;
		
		//static �޼ҵ�� �������
		staticDisp(javaBook3);
		
		System.out.println("1. å ����  :"+javaBook.value);
		System.out.println("2. å ����  :"+javaBook2.value);
		System.out.println("3. å ����  :"+javaBook3.value);
		System.out.println("value  :"+value);
/*		// ���
		System.out.println("2. -----------------");
		System.out.println("å ���� :" + javaBook2.title);
		System.out.println("å ���� :" + javaBook2.author);
		System.out.println("���ڵ��ȣ :" + javaBook2.ISBN);
		System.out.println("������ �� ���� :" + value);*/
	}
	
}