package jang12;
// �߻�Ŭ���� : ����� ������ �и��� �� �ִ�. �߻� Ŭ����(����)�� Ʋ�� ��Ƴ��� �ڽ��� ��ü������ �����ϱ� ������
// ������ ��� ���踦 ������ Ŭ�������� ������ ���� �� �����ϴ�.
abstract class DObject2
{	// �Ϲ� �ʵ� , �Ϲݸ޼ҵ�(){} ��� �� �� �ִ�.
	// �߻� �޼ҵ�();
	// �߻� Ŭ������ ��ü �����Ҽ�����
	public DObject2 next;
	public DObject2()
	{
		next = null;
	}
	abstract public void draw(); // ������
}

public class AbstractError 
{
	public static void main(String[] args) 
	{
		DObject2 obj;
//		obj = new DObject2(); �߻�Ŭ������ ��ü���� �Ҽ� ����.
//		��ü�����Ϸ��� ����� �ؼ� �ڽĿ��� �߻�޼ҵ带 ������ �ؾ߸� �ڽ��� ���� ��ü�� ������ �� �ִ�.
//		obj.draw();
	}
}