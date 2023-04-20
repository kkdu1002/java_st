package jang12;

import java.util.Arrays;

public class Equals_Ex 
{
	public static void main(String[] args) 
	{
		int[][] original = {{1,2},{3,4}};
/*
	ArrayŬ���� ������ equals() / deepEquals() �Ѵ� �迭 ���Ѵ�
	equals() : 1�� �׸��� ���� �� ���� , �ּҺ� �Ұ�
	deepEquals() : ��,�ּҺ� ���� / 1�� �׸��� ���� �ٸ� �迭�� ������ ��� ��ø�� �迭�� �׸���� ����
  */
		System.out.println("[���� ���� �� ��]");
		int[][] cloned1 = Arrays.copyOf(original,original.length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned1));
		System.out.println("1�� �迭 �׸� �� : " + Arrays.equals(original, cloned1));
		System.out.println("��ø �迭 �׸� �� : " + Arrays.deepEquals(original,cloned1));
		
		System.out.println();
		
		System.out.println("[���� ���� �� ��]");
		int[][] cloned2 = Arrays.copyOf(original,original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("�迭 ���� �� : " + original.equals(cloned2));
		System.out.println("1�� �迭 �׸� �� : " + Arrays.equals(original, cloned2));
		System.out.println("��ø �迭 �׸� �� : " + Arrays.deepEquals(original,cloned2));
	
		System.out.println("\n�ؽ��ڵ� ��");
		System.out.println(original.hashCode() + "," + cloned2.hashCode() + "," + 
						cloned2[0].hashCode() + "," + cloned2[1].hashCode());
	}
}
