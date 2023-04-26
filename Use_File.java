package jang12;

import java.io.*;

import java.util.Scanner;

public class Use_File 
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("src/jang12/test1.txt");
		long t = f1.lastModified();
		System.out.println("파일인지 여부 : " + f1.isFile());
		System.out.println("디렉토리 인지 여부 : " + f1.isDirectory());
		System.out.println("상대경로 : " + f1.getPath());
		System.out.println("절대경로 : " + f1.getAbsolutePath());
		System.out.println("디렉토리 혹은 파일의 이름 : " + f1.getName());
		System.out.println("파일의 길이 : " + f1.length());
		System.out.printf("파일의 최종 수정 날짜 : %tb %td %ta %tT\n",t,t,t,t);
		
		System.out.print("\n자바 소스 파일이름을 입력하세요 >> ");
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
