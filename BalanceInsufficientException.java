package jang12;
// 사용자 정의 Exception

public class BalanceInsufficientException extends Exception
{
	public BalanceInsufficientException()
	{
		
	}
	public BalanceInsufficientException(String message)
	{
		super(message);
	}
}
