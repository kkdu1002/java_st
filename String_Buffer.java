package jang12;
/*
	���� �뷮���� (buffer�� ����) �׻� 16���ڰ� �� �� ������ �޸𸮷� ���� �Ҵ� �޴´�.
	���� ? ���ڿ��� �Ϻθ� ���� / ���� �߰��� �ʿ��� ����
	
	���۶� ?
	�����͸� �� ������ �ٸ� �� ������ �����ϴ� ���� �Ͻ������� �� �����͸� �����ϴ� �޸��� �����̴�.
	���۸�(buffering)�̶� ? ���۸� Ȱ���ϴ� ��� �Ǵ� ���۸� ä��� ������ ���Ѵ�.
	
	StringBuffer : ���������� ���� ������ ������ Ŭ����
					���ڿ��� ������ ���� ���Ǵ� ��ü�ϼ��� StringBufferŬ������ ���
					 ����ȭ�� ������(��Ȯ���� ���� , �ӵ��� �ʾ��� �� �ִ�)
	StringBilder : ����ȭ�� �������� ����(�ŷڼ��� ��������(��Ȯ��), �ӵ��� ����)
	String : �������� ����	������ String��ü�� ���ο� String���� ���ϸ� ������ ��ü�� �����Ǵ� ���� �ƴϰ�, ���ο� ��ü�� �����ϰ� ��
 */
public class String_Buffer 
{
	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("1234567890");
		
//		���� buffer �뷮�� 16����Ʈ(����)�� �Է��� ���ڿ���ŭ ���� 16 + 10 = 26 �� ��
		System.out.println("sb�� buffer�뷮�� : " + sb.capacity());
		System.out.println("sb�� ���ڿ��� ���̴� : " + sb.length());
		sb.append("ABCDEFGHIJKLMNOPQ"); // 17��
		
//		������ �⺻ �뷮�� ��� ������ ��ü�뷮�� �ڵ����� �缳���ȴ�.
//		������ buffer�뷮�� 26�� 2�� ���ϰ� �ٽ� ���� : 26 + (26 + 2) = 54
		System.out.println("sb�� buffer�뷮�� : " + sb.capacity());
		System.out.println("sb�� ���ڿ��� ���̴� : " + sb.length());
		sb.delete(1, 20);
		
//		buffer�� �뷮�� �پ� ���� ����
		System.out.println("sb�� buffer�뷮�� : " + sb.capacity());
		System.out.println("sb�� ���ڿ��� ���̴� : " + sb.length());
	}
}