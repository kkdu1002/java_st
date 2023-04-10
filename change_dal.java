package jang12;

class CurrencyConverter
{
	private static double rate;
	// 일반 메소드 == non-static , static(클래스 = 정적) / non-static(인스턴스 = 동적) 무관
	public static double toDollar(double won)
	{
//		this = error;
		return won / rate;
	}
	public double toDollar2(double won) 
	{
		int value = 0;
		System.out.println("일반 메소드");
		return won / rate;
	}
	// static 메소드 
	public static double toKWR(double dollar)
	{
		// value = 0; // 오류 오로지 static 멤버만 와야함
		return dollar * rate;
	}
	public static void setRate(double r) 
	{
//		this.rate = rate; this 사용 불가
		System.out.println("static 메소드");
		rate = r;
	}
}
public class change_dal 
{
	public static void main(String[] args) 
	{
		CurrencyConverter.setRate(1121);
		CurrencyConverter CurrencyConverter2 = new CurrencyConverter();
		System.out.println("백만원은 " + CurrencyConverter.toDollar(1000000) + "달러 입니다.");
		System.out.println("이백만원은 " + CurrencyConverter2.toDollar2(2000000) + "달러 입니다.");
		System.out.println("백달러는 " + CurrencyConverter.toKWR(100) + "원 입니다.");
	}

}
