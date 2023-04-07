package jang12;

public class overloading 
{
	// 메소드 오버로딩
	//(메소드 이름을 기준으로 왼쪽은 무관 , 오른쪽은 반드시(타입,갯수가 달라야함)
	// 하나의 메소드 명으로 다양한 작업을 할 수 있다. 상속 x
	public int getSum(int i, int j) 
	{
		return i + j;
	}
	public int getSum(int i, int j , int k) 
	{
		return i + j + k;
	}
	public double getSum(double i, double j) 
	{
		return i + j;
	}
	public static void main(String[] args) 
	{
		overloading o = new overloading();
		int i = o.getSum(1, 2);
		int j = o.getSum(1, 2, 3);
		double k = o.getSum(1.1, 2.2);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("k = " + k);
	}
}