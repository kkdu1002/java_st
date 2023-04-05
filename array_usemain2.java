package jang12;
//1. call by value : 반환형 x , 매개변수 o 있는 기본값 전달
//값을 복사해서 전달하고 돌아와서 원래변수에 변화 x
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
	// 프로토타입 == 메소드 원형
	public static void display(int sum2) 
	{
		System.out.printf("총합 : %d\n",sum2);
	}
	
	public static void main(String[] args) 
	{
		int[] score;
		score = new int[] {83 , 90, 87};
		int sum = 0 , sum_2 = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		display(sum); // 호출 , 값 전달
		
		sum_2 = add(score);
		display(sum_2);
		System.out.println();
	}
}