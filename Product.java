package jang12;

public class Product 
{	// 필드 생성
	private int productID; // 고유 식별자
	private String descrption; // 상품 설명
	private String maker; // 생산자
	private int price; // 가격정보

	// 생성자를 통해 초기화 선언
	public Product(int productID, String descrption, String maker, int price) 
	{
		this.productID = productID;
		this.descrption = descrption;
		this.maker = maker;
		this.price = price;
	}
	public int getProductID() 
	{
		return productID;
	}
	public void setProductID(int productID) 
	{
		this.productID = productID;
	}
	
	public String getDescrption() 
	{
		return descrption;
	}
	public void setDescrption(String descrption) 
	{
		this.descrption = descrption;
	}
	
	public String getMaker() 
	{
		return maker;
	}
	public void setMaker(String maker) 
	{
		this.maker = maker;
	}
	
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public void showInfo()
	{
		System.out.println("---------------------------");
		System.out.println("상품 ID : " + productID);
		System.out.println("상품 설명 : " + descrption);
		System.out.println("생산자 : " + maker);
		System.out.println("상품 가격 : " + price + "\n");
	}
	
}