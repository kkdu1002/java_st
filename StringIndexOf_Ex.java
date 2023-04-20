package jang12;

public class StringIndexOf_Ex 
{
	public static void main(String[] args) 
	{
		String subject = "자바 프로그래밍";
		String ssn = "7306241230123";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		if(subject.indexOf("자바") != -1)
		{
			System.out.println("자바와 관련된 책이군요");
		}
		else
		{
			System.out.println("자바와 관련없는 책이군요");
		}
		
		int length = ssn.length();
		char sex = ssn.charAt(6);
		String year = ssn.substring(0, 2);
		String month = ssn.substring(2, 4);
		String day = ssn.substring(4, 6);
		
		
		if(length == 13)
		{
			System.out.println("주민번호 자리수가 맞습니다.");
			switch(sex)
			{
				case '1':
				case '3':
					System.out.printf("19%s년 %s월 %s일에 태어난 남자입니다.\n",year,month,day);
					break;
				case '2':
				case '4':
					System.out.printf("19%s년 %s월 %s일에 태어난 여자입니다.\n",year,month,day);
					break;
			}
		}
		else
		{
			System.out.println("주민번호 자리수가 틀립니다");
		}
		String newssn = ssn.replace("7306241230123", "753315556244");
		System.out.println(newssn);
	}
}