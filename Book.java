package jang12;

public class Book extends Product
{
	private int ISBN; 		// ISBN번호
	private String title;	//책제목
	private String author;	//저자
	
	public Book(int productID, String descrption, String maker, int price ,int ISBN , String title , String author) 
	{
		super(productID, descrption, maker, price); // 부모꺼 받아서 초기화
		this.ISBN = ISBN;
		this.title = title;
		this.author = author;
	}

	public int getISBN() 
	{
		return ISBN;
	}
	public void setISBN(int ISBN) 
	{
		this.ISBN = ISBN;
	}

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
	
	public void showInfo()
	{
		super.showInfo();
		System.out.println("---------------------------");
		System.out.println("ISBN 번호 : " + ISBN);
		System.out.println("책제목 : " + title);
		System.out.println("저자 : " + author + "\n");
	}
}