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
	RunTime : ����ð��� ����ȯ�濡 ���� ������ �򰡳�, ����� ����
	��� : Runtime rt = Runtime.getRuntime();
	�޼ҵ� : 
	freeMemory() : ���� �ڹٰ���ӽ�(JVM)���� ��밡�� �޸𸮷� byte����
	totalMemory() : ��ü �޸𸮷� byte����
	exec(��������) : �μ��� �޴� ���ڿ��� ������� �ν�, �ܺ� ���α׷��� ����

*/