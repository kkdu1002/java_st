package jang12;

public class Earth247 
{
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
	}
	public static void main(String[] args) 
	{
		System.out.println("������ ������ : " + EARTH_RADIUS + "km");
		System.out.println("������ ǥ���� : " + EARTH_SURFACE_AREA + "km^2");
	}
}