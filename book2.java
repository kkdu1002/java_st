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
		System.out.println("인자 3개 호출");
	}
	// 메소드 중복 Overloading : 하나의 메소드명으로 다양한 작업을 한다.
	public book2(String title,int ISBN) 
	{	// 무조건 첫줄에 와야하고 , 생성자 내에서만 사용해야 함.
		this(title,"Anonymous",ISBN);
		System.out.println("인자 2개 호출");
	}
	
	public book2() 
	{	// 상속관계에서 디폴트 생성자는 상속 x
		// super(); 부모객체의 생성자를 호출
		this(null,null,0);
		System.out.println("생성자가 호출되었음");
	}
	
	public static void disp(book2 javaBook)
	{
		System.out.println("------------------------");
		System.out.println("책 제목 :" + javaBook.title);
		System.out.println("책 저자 :" + javaBook.author);
		System.out.println("바코드번호 :" + javaBook.ISBN);
	}
	public static void main(String[] args) 
	{
		book2 javaBook = new book2("java","황기태",3333);
		book2 holyBible = new book2("holyBible",1);
		book2 emptyBook = new book2();
		
		disp(javaBook);
		disp(holyBible);
		disp(emptyBook);
	}
}