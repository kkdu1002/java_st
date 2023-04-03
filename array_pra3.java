package jang11;

public class array_pra3 
{
	// 나열 타입 상수 : 자바 컴파일로는 자동으로 모든 enum을 위한 static values()를 제공
	enum week {월,화,수,목,금,토,일}
	public static void main(String[] args)
	{
		int num[] = {1,2,3,4,5};
		String name[] = {"사과","배","바나나","체리","딸기","포도"};
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
		System.out.printf("합 : %d\n",sum);
		
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
			System.out.print(day + "요일 ");
		}
	}
}