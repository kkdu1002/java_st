package jang12;

import java.io.Serializable;

/*
	ObjectOutputStream 직렬화 : 일련된 바이트로 전송
	ObjectInputStream 역직렬화 : 원래 자료형으로 변환
	객체의 직렬화
	가상머신 안에 존재하는 특정 객치(객체의 메모리와 객체에 대한 정보)를
	순차적인 바이트 형태로 변환 하는것
	객체의 지렬화를 통해 프로그램이 실행되는 동안 생성된 객체를 스트림을
	이용해서지속적으로 보관하거나 전송 할 수 있다.
	직렬화 가능한 클래스를 만드는 방법
1)	Serializable 인터페이스를 이용
2)	Externalizable 인터페이스를 이용
 */
public class Data implements Serializable
{
	private int no;
	private String name;
	private String mail;
	
	@Override
	public String toString()
	{
		return "번호 : " + no + "\n이름 : " + name + "\n메일 : " + mail;
	}
//	getter() / setter() 생성
	public void setNo(int no)
	{
		this.no = no;
	}
	public int getNo()
	{
		return no;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setMail(String mail)
	{
		this.mail = mail;
	}
	public String getMail()
	{
		return mail;
	}
}
