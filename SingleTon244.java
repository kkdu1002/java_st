package jang12;

public class SingleTon244 
{
	// �ڽ��� Ŭ������ static �����
	private static SingleTon244 SingleTon = new SingleTon244();
	// ������ �տ� ���� �����ڸ� private�� �־� �ܺο��� ��ü�� ������ ���ϰ���.
	private SingleTon244() {}
	// static ������� ��ȯ���� �ڽ��� Ŭ���� Ÿ������ �ؼ� �ڽ��� ��ü�� �����ش�
	static SingleTon244 getInstance()
	{
		return SingleTon;
	}
	public static void main(String[] args) 
	{

	}

}
