package jang12;

import java.util.Scanner;

public class goods2 
{
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	public goods2(String name,int price , int numberOfStock , int sold) 
	{	// �ʵ� �ʱ�ȭ
		this.name = name;
		this.price = price;
		this.numberOfStock = numberOfStock;
		this.sold = sold;
	}
	
	String getName() 
	{
		return name;
	}
	
	int getPrice() 
	{
		return price;
	}
	
	int getNumberOfStock() 
	{
		return numberOfStock;
	}
	
	int getSold() 
	{
		return sold;
	}
	
	public static void main(String[] args) 
	{
		goods2 [] goodsArray;
		//��ü �迭 ����
		goodsArray = new goods2[3]; // goods2 classŸ������ ��ü�迭 ����
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < goodsArray.length;i++)
		{
			String name = s.next();
			int price = s.nextInt();
			int numberOfStock = s.nextInt();
			int sold = s.nextInt();
			goodsArray[i] = new goods2(name , price , numberOfStock , sold);
		}
		
		for(int i = 0; i < goodsArray.length; i++) 
		{
			System.out.print(goodsArray[i].getName() + " ");
			System.out.print(goodsArray[i].getPrice() + " ");
			System.out.print(goodsArray[i].getNumberOfStock() + " ");
			System.out.println(goodsArray[i].getSold() + " ");
		}
	}
}