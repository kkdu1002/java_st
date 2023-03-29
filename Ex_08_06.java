package jang8;

public class Ex_08_06 {

	public static void main(String[] args) {
		try 
		{
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println(Integer.MIN_VALUE);
			System.out.println(Integer.MAX_VALUE);
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}	
	}
	public static int safeAdd(int left , int right) 
	{
		if((right > 0)) 
		{
			// max : 2_147_483_647
			// 2_000_000_000 > 147_483_647 <--- (2_147_483_647 - 2_000_000_000 )
			if(left > Integer.MAX_VALUE - right) 
			{	// 예외 처리생성
				throw new ArithmeticException("오버플로우 발생");
				// ArithmeticException에 ()값 던짐
			}
		}
		else 
		{
			// min : -2_147_483_648
			// 2_000_000_000 < 147_483_647 <----- (- 2_147_483_648 - 2_000_000_000 )
			if(left < Integer.MIN_VALUE - right) 
			{
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		return left + right;
	}

}
