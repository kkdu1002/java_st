package jang12;

public class StringIndexOf_Ex 
{
	public static void main(String[] args) 
	{
		String subject = "�ڹ� ���α׷���";
		String ssn = "7306241230123";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);

		if(subject.indexOf("�ڹ�") != -1)
		{
			System.out.println("�ڹٿ� ���õ� å�̱���");
		}
		else
		{
			System.out.println("�ڹٿ� ���þ��� å�̱���");
		}
		
		int length = ssn.length();
		char sex = ssn.charAt(6);
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		
		
		if(length == 13)
		{
			System.out.println("�ֹι�ȣ �ڸ����� �½��ϴ�.");
			switch(sex)
			{
				case '1':
				case '3':
					System.out.printf("19%s�� %s�� %s�Ͽ� �¾ �����Դϴ�.\n",year,month,day);
					break;
				case '2':
				case '4':
					System.out.printf("19%s�� %s�� %s�Ͽ� �¾ �����Դϴ�.\n",year,month,day);
					break;
			}
		}
		else
		{
			System.out.println("�ֹι�ȣ �ڸ����� Ʋ���ϴ�");
		}
		String newssn = ssn.replace("7306241230123", "753315556244");
		System.out.println(newssn);
	}
}