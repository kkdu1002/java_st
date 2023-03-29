package jang8;

public class Ex_08_12 
{
	public static void main(String[] args) 
	{
		// Object Ÿ���� '==' , equals() : ��� �ּ� ��
		// String Ÿ���� ���ڿ��� �� �� �� : �� ������ ��� X
		// String Ÿ���� '==' �ּ� ��, equals() : �� ��
		// Object�κ��� equals()�� ��ӹ޾Ƽ� �� �񱳸� �� �� �ֵ���
		// ������ overriding�� �߱⶧���� �� �񱳰� ����
		// �⺻Ÿ�� ���� : == ���ʰ� ������ ���� ����(����)
		String strVar1 = "�Ź�ö";
		String strVar2 = "�Ź�ö";
		String strVar3 = new String("�Ź�ö");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//hashCode() ������ Overriding
		System.out.println(" strVar1 " + strVar1.hashCode());
		System.out.println(" strVar2 " + strVar2.hashCode());
		System.out.println(" strVar3 " + strVar3.hashCode());
		
		// ��ü : Ŭ���� , �迭 , �������̽� ,String : ����� heap �޸� ���
		System.out.println("-------------------------");
		
		//String�� equals() �� ������ �ؼ� ���� �񱳰� �ȴ�.
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}