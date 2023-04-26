package jang12;

import java.io.Serializable;

/*
	ObjectOutputStream ����ȭ : �Ϸõ� ����Ʈ�� ����
	ObjectInputStream ������ȭ : ���� �ڷ������� ��ȯ
	��ü�� ����ȭ
	����ӽ� �ȿ� �����ϴ� Ư�� ��ġ(��ü�� �޸𸮿� ��ü�� ���� ����)��
	�������� ����Ʈ ���·� ��ȯ �ϴ°�
	��ü�� ����ȭ�� ���� ���α׷��� ����Ǵ� ���� ������ ��ü�� ��Ʈ����
	�̿��ؼ����������� �����ϰų� ���� �� �� �ִ�.
	����ȭ ������ Ŭ������ ����� ���
1)	Serializable �������̽��� �̿�
2)	Externalizable �������̽��� �̿�
 */
public class Data implements Serializable
{
	private int no;
	private String name;
	private String mail;
	
	@Override
	public String toString()
	{
		return "��ȣ : " + no + "\n�̸� : " + name + "\n���� : " + mail;
	}
//	getter() / setter() ����
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
