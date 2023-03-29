package jang8;

public class Ex_08_11 
{
	public static void main(String[] args) 
	{
		int v2 = 1;
		double v3 = 1.0;
		System.out.println(v2 == v3); //true
		
		double v4 = 0.1;
		float v5 = 0.1f;
		
		//float형에 값을 더블로 맞추면 모자란 것은 0으로 대치되어 적합 X
		//더블형을 모드 float형에 맞추어 계산해야함.
		System.out.println(v4 == v5); //false
		System.out.println((float)v4 == v5); //true
		System.out.println((int)(v4*10) == (int)(v5*10));//true
	}
}