package jang12;
//1. call by value : ��ȯ�� x , �Ű����� o �ִ� �⺻�� ����
//���� �����ؼ� �����ϰ� ���ƿͼ� ���������� ��ȭ x
public class array_usemain2 
{
	public static int add(int[] Score) 
	{
		int sum = 0;
		for(int i = 0; i < Score.length; i++) 
		{
			sum += Score[i];
		}
		return sum;
	}
	// ������Ÿ�� == �޼ҵ� ����
	public static void display(int sum2) 
	{
		System.out.printf("���� : %d\n",sum2);
	}
	
	public static void main(String[] args) 
	{
		int[] score;
		score = new int[] {83 , 90, 87};
		int sum = 0 , sum_2 = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		display(sum); // ȣ�� , �� ����
		
		sum_2 = add(score);
		display(sum_2);
		System.out.println();
	}
}