package jang2;

public class circle_area {
	public static void main(String[] args) {
		final double PI = 3.14;
		double radius = 10;
		double Circle_area = 0;
		
		Circle_area = radius * radius * PI;
		
		System.out.printf("원의 면적 : ");
		System.out.println(Circle_area);
	}
}