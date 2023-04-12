package jang12;

public class ConversationBook extends Book
{
	private String languege;
	
	
	public ConversationBook(int productID, String descrption, String maker, int price, int ISBN, String title,
			String author , String languege) 
	{
		super(productID, descrption, maker, price, ISBN, title, author);
		this.languege = languege;
	}

	public String getLanguege() 
	{
		return languege;
	}
	public void setLanguege(String languege) 
	{
		this.languege = languege;
	}
	
	@Override
	public void showInfo()
	{
		System.out.println("¾ð¾î : " + languege + "\n");
	}
}