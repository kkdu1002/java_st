package jang12;

import java.io.*;

import java.util.Scanner;

public class Use_File 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("src/jang12/test1.txt");
		long t = f1.lastModified();
		System.out.println("�������� ���� : " + f1.isFile());
		System.out.println("���丮 ���� ���� : " + f1.isDirectory());
		System.out.println("����� : " + f1.getPath());
		System.out.println("������ : " + f1.getAbsolutePath());
		System.out.println("���丮 Ȥ�� ������ �̸� : " + f1.getName());
		System.out.println("������ ���� : " + f1.length());
		System.out.printf("������ ���� ���� ��¥ : %tb %td %ta %tT\n",t,t,t,t);
		
		System.out.print("\n�ڹ� �ҽ� �����̸��� �Է��ϼ��� >> ");
		Scanner input = new Scanner(System.in);
		String filename = input.nextLine();
		FileReader fi = null;
		try
		{
			fi = new FileReader(filename);
			while(true)
			{
				int x = fi.read();
				if(x == -1)
				{
					fi.close();
					break;
				}
				System.out.print((char)x);
			}
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}

		File file3 = new File("src/jang12/test1.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(file3));

		bw.write(input.nextLine());
		bw.newLine();
		bw.write(input.nextLine() + System.getProperty("line.separator") + input.nextLine());
		bw.newLine();
		bw.write(input.nextLine());
		bw.flush();
		bw.close();
		
		FileReader fr = null;
		try
		{
			fr = new FileReader(file3);
			while(true)
			{
				int x = fr.read();
				if(x == -1)
					break;
				System.out.print((char)x);
			}
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
	}	
}
