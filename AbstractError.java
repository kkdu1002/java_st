package jang12;
// 추상클래스 : 설계와 구현을 분리할 수 있다. 추상 클래스(목차)는 틀을 잡아놓고 자식이 구체적으로 구현하기 쉬워짐
// 계층적 상속 관계를 가지는 클래스들의 구조를 만들 때 적합하다.
abstract class DObject2
{	// 일반 필드 , 일반메소드(){} 모두 올 수 있다.
	// 추상 메소드();
	// 추상 클래스는 객체 생성할수없다
	public DObject2 next;
	public DObject2()
	{
		next = null;
	}
	abstract public void draw(); // 강제성
}

public class AbstractError 
{
	public static void main(String[] args) 
	{
		DObject2 obj;
//		obj = new DObject2(); 추상클래스는 객체생성 할수 없다.
//		객체생성하려면 상속을 해서 자식에게 추상메소드를 재정의 해야만 자식을 통해 객체를 생성할 수 있다.
//		obj.draw();
	}
}