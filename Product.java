package jang12;

public class Product 
{	// �ʵ� ����
	private int productID; // ���� �ĺ���
	private String descrption; // ��ǰ ����
	private String maker; // ������
	private int price; // ��������

	// �����ڸ� ���� �ʱ�ȭ ����
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
		System.out.println("��ǰ ID : " + productID);
		System.out.println("��ǰ ���� : " + descrption);
		System.out.println("������ : " + maker);
		System.out.println("��ǰ ���� : " + price + "\n");
	}
	
}