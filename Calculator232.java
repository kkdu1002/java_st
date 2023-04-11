package jang12;

public class Calculator232 
{
	double areaRectangle(double width)
	{
		return width * width;
	}
	
	double areaRectangle(double width , double height)
	{
		return width * height;
	}
	public static void main(String[] args) 
	{
		Calculator232 myCalcu = new Calculator232();
		
		double result1 = myCalcu.areaRectangle(10);
		
		double result2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형의 넓이 : " + result1);
		System.out.println("직사각형의 넓이 : " + result2);
	}
}