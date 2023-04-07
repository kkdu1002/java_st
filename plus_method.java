package jang12;

public class plus_method 
{
	public int plus(int v1 , int v2)
	{
		int result;
		result = v1 + v2;
		return result;
	}
	public static void main(String[] args) 
	{
		int hap;
		//객체 생성후 접근 , 객체명.메소드(값,값);
		plus_method p = new plus_method();
		hap = p.plus(100,200);
		System.out.printf("100과 200의 plus()메소드 결과는 : %d\n",hap);
	}
}
