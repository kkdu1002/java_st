package jang12;
/*
	StringBuffer�� String ��ü�� �ѹ� ������� ���ڿ��� ������ �� ���� �Ͱ�
	�޸� STringBuffer��ü�� ���ο� ���ڿ��� �����ϴ� ���� ũ���� ���۸� ���� �ִ� ���� �ٸ���
	���ο� ���ڿ��� �����ϴ� ũ���� ���۸� �����ֱ� ������ ������ ���ڿ� ���� �ٲ� �� �ִ�
	���� ���� ũ��� ���� �����ȴ�. (�⺻ 16����Ʈ)
	������ ���ڿ��� 
 */
public class use_String_Buffer 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb.hashCode());
		sb.append(" is pencil"); //���ڿ� �����̱�
		System.out.println(sb);
		
		sb.insert(7," my"); // ���ڿ� ����
		System.out.println(sb);
		
		sb.replace(8,10,"your"); // ���ڿ� ��ġ
		System.out.println(sb);
		
		sb.setLength(5); // ��Ʈ�� ���� �� ���ڿ� ���� ����
		
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
}