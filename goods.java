package jang12;

public class goods 
{
	String name = "�Ｚ ������"; // ����� �ʱ�ȭ
	int price; // ������ �ʱ�ȭ
	int numberOfStock;
	int sold;
	public goods() 
	{
		System.out.println("�⺻ ������");
	}
	public goods(String name) 
	{
		System.out.println("�Ű� ���� �ִ� ������");
		this.name = name;
	}
	// setter() , getter()
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getPrice() 
	{
		return price;
	}
	public void setPrice(int price) 
	{
		this.price = price;
	}
	
	public int getNumberOfStock() 
	{
		return numberOfStock;
	}
	public void setNumberOfStock(int numberOfStock ) 
	{
		this.numberOfStock = numberOfStock;
	}
	
	public int getSold() 
	{
		return sold;
	}
	public void setSold(int sold) 
	{
		this.sold = sold;
	}
	
	public static void main(String[] args) 
	{
		goods camera = new goods();
		goods camera2 = new goods("LG");
		
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		disp(camera);
		disp(camera2);
		
		camera.setName("�����ڵ���");
		camera.setPrice(20000000);
		camera.setNumberOfStock(1);
		camera.setSold(20);
		
		// ī�޶�2�� ���� �ʱ�ȭ
		camera2.name = "�Ｚ";
		camera2.price = 450000;
		camera2.numberOfStock = 50;
		camera2.sold = 70;
		
		camera2.setName("soni");
		camera2.setPrice(700000);
		camera2.setNumberOfStock(100);
		camera2.setSold(80);
		
		disp(camera);
		disp(camera2);
	}
	public static void disp(goods camera) 
	{
		System.out.println("��ǰ �̸� : " + camera.name);
		System.out.println("��ǰ ���� : " + camera.price);
		System.out.println("��� ���� : " + camera.numberOfStock);
		System.out.println("�Ǹ� ���� : " + camera.sold);
	}
	// �������
	public static void disp2(goods camera) 
	{
		System.out.println("��ǰ �̸� : " + camera.getName());
		System.out.println("��ǰ ���� : " + camera.getPrice());
		System.out.println("��� ���� : " + camera.getNumberOfStock());
		System.out.println("�Ǹ� ���� : " + camera.getSold());
	}
}
