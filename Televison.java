package jang12;

public class Televison 
{
	static String company = "Samsung";
	static String model = "LCD";
	static String info;
	
	static {
		info = company + "-" + model;
	}
	public static void main(String[] args) 
	{
		System.out.println(Televison.info);
	}

}
