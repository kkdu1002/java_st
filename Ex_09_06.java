package jang9;

public class Ex_09_06 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int max = -1; // 초기값은 가장 작은값 , 임의의 시작값
		int min = 10; // 초기값은 가장 큰값 , 임의의 시작값
		for(int i = 1; i <= 10; i++) 
		{
			System.out.printf("%d\t",i);
			sum += i;
			if(i%5 == 0)
				System.out.printf("\n");
			if(max < i) //  최대값
				max = i;
			if(min > i) // 최소값
				min = i;
		}
		System.out.printf("합계 : %d\n",sum);
		System.out.printf("max : %d\n",max);
		System.out.printf("min : %d\n",min);
	}
}