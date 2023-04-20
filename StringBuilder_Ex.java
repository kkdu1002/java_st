package jang12;

public class StringBuilder_Ex 
{
	/*
	���ڿ��� �����ϴ� �۾��� ������ StringBuffer , StringBuilder�� ���
	�߰�,����,������ �� �� �ֵ��� ���� ��
	StringBuffer : ��Ƽ������ ȯ�濡�� ������ / ����ȭ ����o
	StringBuilder : ���Ͻ����� ȯ�濡 ���ǵ��� ���� / ����ȭ ����x
	 */
	public static void main(String[] args)
	{
		StringBuilder sb  = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());
//		Java Program Study
		
		sb.insert(4,"2");
		System.out.println(sb.toString());
//		Java2 Program Study
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
//		Java6 Program Study
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
//		Java6 Book Study 
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
//		Java Book Study
		
		int length = sb.length();
		System.out.println("�� ���ڼ� : " + length);

		String result = sb.toString();
		System.out.println(result);
	}

}
