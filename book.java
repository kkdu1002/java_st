package jang12;

public class book 
{
	// 인스턴스 멤버 변수 , 객체 생성후 , 객체명.필드명 , 객체마다 개별값
	String title;
	String author;
	int ISBN;
	// 클래스 멤버변수, 클래스명.필드명 , 클래스 메모리영역 잡힘 , 모든객체들이 똑같은 값을 갖음 == 공유
	static int value;
	// 인자값이 있는 생성자
	public book(String title,String author , int ISBN)
	{
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		System.out.println("인자 3개를 가지고있음");
	}
	// 기본 생성자
	public book() 
	{
		System.out.println("기본 생성자");	
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
		System.out.println("책 제목 :" + javaBook.title);
		System.out.println("책 저자 :" + javaBook.author);
		System.out.println("바코드번호 :" + javaBook.ISBN);
		System.out.println("변경전 된 가격 :" + value);
	}
	
	public static void staticDisp(book javaBook)
	{
		System.out.println("책 제목 :" + javaBook.getTitle());
		System.out.println("책 저자 :" + javaBook.getAuthor());
		System.out.println("바코드번호 :" + javaBook.getIsbn());
		System.out.println("변경전 된 가격 :" + value);
	}
	
	public static void main(String[] args) 
	{
		book javaBook = new book("Java JDK","황기태",3333);
		System.out.println("변경전 책 가격 :" + value);
		value = 20000; // 같은 클래스 내에서는 클래스명 생략 가능 
//		javaBook.value = 20000;
//		book.value = 20000;
		
/*		// 타 클래스에서 꼭 이렇게 접근
		System.out.println("책 제목 :" + javaBook.title);
		System.out.println("책 저자 :" + javaBook.author);
		System.out.println("바코드번호 :" + javaBook.ISBN);
		System.out.println("변경전 된 가격 :" + value);*/
		
		// 클래스는 객체를 생성하기 위한 설계도, 틀이다.
		// 객체는 설계도 또는 틀로 찍어낸 실체이다
		book javaBook2 = new book();
		
		//멤버변수들을 직접 초기화
		javaBook2.title = "자바 프로그래밍";
		javaBook2.author = "우재남";
		javaBook2.ISBN = 8888;
		value = 30000;
		
		javaBook.disp(javaBook); // 메소드 호출
		javaBook.disp(javaBook2);
		
		book javaBook3 = new book();
		//setter로 초기화
		javaBook3.setTitle("Html5");
		javaBook3.setAuthor("Html5저자");
		javaBook3.setIsbn(6666);
		javaBook3.value = 50000;
		
		//static 메소드로 간접출력
		staticDisp(javaBook3);
		
		System.out.println("1. 책 가격  :"+javaBook.value);
		System.out.println("2. 책 가격  :"+javaBook2.value);
		System.out.println("3. 책 가격  :"+javaBook3.value);
		System.out.println("value  :"+value);
/*		// 출력
		System.out.println("2. -----------------");
		System.out.println("책 제목 :" + javaBook2.title);
		System.out.println("책 저자 :" + javaBook2.author);
		System.out.println("바코드번호 :" + javaBook2.ISBN);
		System.out.println("변경전 된 가격 :" + value);*/
	}
	
}