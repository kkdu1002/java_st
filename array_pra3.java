package jang11;

public class array_pra3 
{
	// ���� Ÿ�� ��� : �ڹ� �����Ϸδ� �ڵ����� ��� enum�� ���� static values()�� ����
	enum week {��,ȭ,��,��,��,��,��}
	public static void main(String[] args)
	{
		int num[] = {1,2,3,4,5};
		String name[] = {"���","��","�ٳ���","ü��","����","����"};
		int sum = 0;
		
	/*	for(int k : num) 
		{
			sum += k;
		}
	*/
		
		for(int k = 0; k < num.length ; k++)
		{
			sum += num[k];
		}
		System.out.printf("�� : %d\n",sum);
		
		int count = 0;
		for(String f : name) 
		{
			System.out.print(count + ":" + f + " ");
			count++;
		}

		/*
		for(int k = 0; k < name.length;k++) 
		{
			System.out.print(name[k] + " ");
		}
		*/
		System.out.println();
		
		for(week day : week.values()) 
		{
			System.out.print(day + "���� ");
		}
	}
}