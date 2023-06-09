package jang12;
/*
	인터페이스(Interface)란
	완전히 미완성된 채로 남겨져
	인터페이스 안에 존재하는 그 어떤 메소드도
	몸체(정의부)가 없기 때문에 실행 부분이 존재하지 않는다.
	클래를 위한 템플릿으로서의 기능을 수행하는
	추상 클래스의 한 종류로 보자

 	인터페이스는 클래스와는 달리 다중 상속이 가능하며
 	인터페이스 자체도 상속된다.
 	기존의 c++언어 등에서 지원되는 다중 상속이
 	많은 문제점을 포함하고 있기 때문에
 	자바에서는 다중 상속의 개념을 인터페이스라는 개념으로 변형하여
 	인터페이스를통해 다중 상속을 구현하는 방법을 지원하는것이다.
 	
 	인터페이슨 ㄴ상수와 추상 메소드만 가질 수 있으며
 	인터페이스 안의 메소드들은 접근제어지시자를 명시하지 않아도
 	public으로 성정되어 클래스에서 구현(implements)함으로써
 	바로 접근이 될 수 있다

	특징
	- 추상 클래스의 일종으로 선언만 있고 정의가 없다
	- final 변수는 가질수 있다.(상수의 개념)
	- 인터페이스 public static final 상수만 만들수 있다
	- 하나 이상의 인터페이스를 implements 할 수 있다
	- 인터페이스를 implements 한 클래스는 인터페이싀 모든 메소드를 overridng해야한다
	- 인터페이스가 다른 인터페이스를 상속 받을 수 있으며 이때 extends키워드를 사용한다
		또한 클래스와 달리 인터페이스는 다중 상속이 가능하다.
 */
public interface MobilePhone
{
	public boolean sendCall();
	public boolean receiveCall();
	public boolean sendSMS();
	public boolean receiveSMS();
}
