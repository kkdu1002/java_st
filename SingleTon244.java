package jang12;

public class SingleTon244 
{
	// 자신의 클래스를 static 멤버로
	private static SingleTon244 SingleTon = new SingleTon244();
	// 생성자 앞에 접근 제한자를 private로 주어 외부에서 객체를 만들지 못하게함.
	private SingleTon244() {}
	// static 지정어와 반환형은 자신의 클래스 타입으로 해서 자신의 객체를 돌려준다
	static SingleTon244 getInstance()
	{
		return SingleTon;
	}
	public static void main(String[] args) 
	{

	}

}
