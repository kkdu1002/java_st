package jang12;

public class string_pra01 
{
	public static void main(String[] args) 
	{
		String str  = "�Ź�ö";
		String str2  = "�Ź�ö";
		
		if(str == str2) {
			System.out.println("str�� str2�� ������ ����");
		}
		else
		{
			System.out.println("str�� str2�� ������ �ٸ�");
		}
		
		if(str.equals(str2)) {
			System.out.println("str�� str�� ���ڿ��� ����");
		}
		
		String str3  = new String("�Ź�ö");
		String str4  = new String("�Ź�ö");
		
		if(str3 == str4) {
			System.out.println("str3�� str4�� ������ ����");
		}
		else
		{
			System.out.println("str3�� str4�� ������ �ٸ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println("str3�� str4�� ���ڿ��� ����");
		}
		// hashCode()�� String���� �� ����(overriding)����
		System.out.println("str.hashcode() = " + str.hashCode());
		System.out.println("str2.hashcode() = " + str2.hashCode());
		System.out.println("str3.hashcode() = " + str3.hashCode());
		System.out.println("str4.hashcode() = " + str4.hashCode());
	}
}