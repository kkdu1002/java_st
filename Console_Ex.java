package jang12;
/*
	패키지 주석 처리하고 컴파일한 후에 실행시는 도스에서
	c:\> javac ConsoleExample.java 컴파일한후
	c:\> java ConsoleExample 실행해야함
	classpath = java_home\lib;. 해야 로딩할 수 있다.
	
	통신방식
1.	단방향 : 수신 , 송신 , 라디오 , tv
2.	양방향(전이중) : 수신/송신 동시가능 , 전화기
3.	반이중 : 송신/수신 모두 가능함, 동시x, 무전기
 */
import java.io.Console;

public class Console_Ex 
{
	public static void main(String[] args) 
	{
		Console console = System.console();
		
		System.out.print("아이디 : ");
		String id = console.readLine();
		
		System.out.print("패스워드 : ");
		char[] charPass = console.readPassword();
		String strPassword = new String(charPass);
		
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(strPassword);
	}
}