package jang12;

import java.util.Scanner;

public class make_coffee 
{
	public static int coffee_machine(int coffee) 
	{
		System.out.printf("\n# 1. �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("# 2. �������� �غ��Ѵ�\n");
		switch(coffee) 
		{
		case 1:
			System.out.printf("# 3. ����Ŀ�Ǹ� ź��\n");
			break;
		case 2:
			System.out.printf("# 3. ����Ŀ�Ǹ� ź��\n");
			break;
		case 3:
			System.out.printf("# 3. ��Ŀ�Ǹ� ź��\n");
			break;
		default:
			System.out.printf("# 3. �ƹ��ų� ź��\n");
			break;
		}
		System.out.printf("# 4. ���� �״´�\n");
		System.out.printf("# 5. ��Ǭ���� ��� ���δ�\n\n");
		return coffee;
	}
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int coffee , ret;
		
		System.out.printf("A��, � Ŀ�� �帱��� ? (1 : ����, 2: ���� , 3 : ��)");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("A��~ %d�� Ŀ�� �����ֽ��ϴ�.\n",ret);
		
		System.out.printf("B��, � Ŀ�� �帱��� ? (1 : ����, 2: ���� , 3 : ��)");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("B��~ %d�� Ŀ�� �����ֽ��ϴ�.\n",ret);
		
		System.out.printf("C��, � Ŀ�� �帱��� ? (1 : ����, 2: ���� , 3 : ��)");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.printf("C��~ %d�� Ŀ�� �����ֽ��ϴ�.\n",ret);
	}
}