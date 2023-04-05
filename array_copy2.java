package jang12;

public class array_copy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		//���� ���� : ����迭 == �����迭 : �ּҰ��� a�迭 = b�迭
		//���� ���� : ����迭 != �����迭 : �ּҰ� �ٸ��� , System.arraycopy
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);

		/*
		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

		// �Ķ���� ����
		Object src: �����ϰ��� �ϴ� ���� �ҽ�
		int srcPos: �����ϰ��� �ϴ� �ҽ��� ��ġ (ó������ ���� ��� 0 ����)
		Object dest: ������ ���� ���� �ҽ�
		int destPos: ���纻�� ���� �� ������ ��ġ(��𼭺��� ���� ����, ó������ ���� ��� 0 ����)
		int length: �������� ���纻���� �о�� ����

		*/
		for(int i = 0; i < newStrArray.length;i++) 
		{
			if(i == newStrArray.length - 1)
				System.out.print(newStrArray[i]);
			else
				System.out.print(newStrArray[i] + ", ");
			// ���� ���� , ���� ����
		}
		// ���������� ���
		System.out.println(); 
		System.out.println("���������� ���"); 
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray.hashCode());
		if(oldStrArray == newStrArray)
			System.out.println("���� �ּ� ����");
		else
			System.out.println("���� �ּ� �ٸ�");
		
		System.out.println("---------------");
		
		//���� ������ ��� : ���� �迭 == �����迭
		System.out.println("���������� ���"); 
		String newStrArray_2[] = oldStrArray ;
		if(newStrArray_2 == oldStrArray)
			System.out.println("���� �ּ� ����");
		else
			System.out.println("���� �ּ� �ٸ�");
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray_2.hashCode());
	}
}