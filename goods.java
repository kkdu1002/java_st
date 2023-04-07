package jang12;

public class goods 
{
	String name = "삼성 갤럭시"; // 명시적 초기화
	int price; // 묵시적 초기화
	int numberOfStock;
	int sold;
	public goods() 
	{
		System.out.println("기본 생성자");
	}
	public goods(String name) 
	{
		System.out.println("매게 변수 있는 생성자");
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
		
		camera.setName("현대자동차");
		camera.setPrice(20000000);
		camera.setNumberOfStock(1);
		camera.setSold(20);
		
		// 카메라2도 직접 초기화
		camera2.name = "삼성";
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
		System.out.println("상품 이름 : " + camera.name);
		System.out.println("상품 가격 : " + camera.price);
		System.out.println("재고 수량 : " + camera.numberOfStock);
		System.out.println("판매 수량 : " + camera.sold);
	}
	// 갑접출력
	public static void disp2(goods camera) 
	{
		System.out.println("상품 이름 : " + camera.getName());
		System.out.println("상품 가격 : " + camera.getPrice());
		System.out.println("재고 수량 : " + camera.getNumberOfStock());
		System.out.println("판매 수량 : " + camera.getSold());
	}
}
