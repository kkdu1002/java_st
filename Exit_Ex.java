package jang12;

public class Exit_Ex 
{
	public static void main(String[] args)
	{	// 특정 값이면 종료할 때
		// 보안 관리자를 직접 설정해서 종료 상태값 확인
		System.setSecurityManager(new SecurityManager()
		{
			@Override
			public void checkExit(int status)
			{
				if(status != 5)
				{	// 종료 상태 확인
					// 강제 스레드 발생
					throw new SecurityException("5가 아니군요 예외처리로 갑니다.");
				}
			}
		});
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i);
			try
			{
				//JVM 종료 요청
				System.exit(i); // 호출되면 보안 관리자가 자동 호출
			}
			catch(SecurityException e)
			{
				
			}
		}
	}
}