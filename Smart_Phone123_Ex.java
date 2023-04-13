package jang12;

public class Smart_Phone123_Ex 
{
	public static void main(String[] args) 
	{
//		추상클래스 객체 생성 불가 , 자식을 통해서 객체 생성
//		Phone123 sp = new Phone123();
		Smart_Phone123 sp = new Smart_Phone123("홍길동");
		
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}
}