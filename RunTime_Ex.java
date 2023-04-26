package jang12;

import java.io.IOException;

public class RunTime_Ex
{
	public static void main(String[] args) 
	{
		Runtime rt = Runtime.getRuntime();
		long fr = rt.freeMemory();
		System.out.println("freeMemory = " + fr/1024 + "kb");
		long fr2 = rt.totalMemory();
		System.out.println("totalMemory = " + fr2/1024 + "kb");
		try
		{
			rt.exec("C:\\windows\\system32\\notepad.exe");
			rt.exec("C:\\windows\\system32\\mspaint.exe");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
	}
}
/*
	RunTime : 실행시간에 실행환경에 대한 정보를 얻가나, 명령을 수행
	사용 : Runtime rt = Runtime.getRuntime();
	메소드 : 
	freeMemory() : 현재 자바가상머신(JVM)에서 사용가능 메모리량 byte단위
	totalMemory() : 전체 메모리량 byte단위
	exec(실행파일) : 인수로 받는 문자열을 명령으로 인식, 외부 프로그램을 실행

*/