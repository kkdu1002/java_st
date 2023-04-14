package jang12;
/*
 - Wrapper Class : �⺻���� ��ü�� , ��ü�� �⺻������ ��ȯ�ϴ� Ŭ������
 1. �⺻�� ��ü�� ��ȯ�Ҷ�		:	�⺻��Ŭ���� ��ü�� = new ������Ŭ����(�⺻��);
 2. �⺻������ ��ȯ�Ҷ�	:	�⺻��	���� = ��ü��.�⺻��Value();
 3. ��Ʈ���� �⺻������ ��ȯ�Ҷ�		:	�⺻��	���� = �⺻��Ŭ����.parse�⺻��("��Ʈ��");
 4.	�⺻���� ��Ʈ������ ��ȯ�Ҷ�		:	String	���� = �⺻��Ŭ����.toString();
 5.	��ü�� ��ȯ		:	�⺻��Ŭ���� = �⺻��Ŭ����.valueOf(���� �Ǵ� ��Ʈ��)
 */
public class WrapperClass 
{
	public static void main(String[] args)
	{
		Integer i = new Integer(10);	// �⺻���� ��ü�� ��ȯ
		char c = '4';
		Double d = new Double(3.1234566);	// �⺻���� ��ü�� ��ȯ
		System.out.println(Character.toLowerCase('A')); 
		if(Character.isDigit(c)) 
		{ // c�� ����ִ� ���� ������ �����̸� ���ڷ� ��ȯ�ؼ� ��������
			System.out.println(Character.getNumericValue(c));
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
	}
}