package jang8;

import java.io.*;

public class memo_homework 
{
	public static void main(String[] args) throws IOException 
	{
		String memo = "src/jang8/memo.txt";
		
		InputStream input_memo = System.in;
		FileWriter fw = new FileWriter(memo); 	//���Ͼ���
		BufferedWriter bw = new BufferedWriter(fw); //�������Ͼ���
		Reader reader = new InputStreamReader(input_memo); //�б�
		BufferedReader br = new BufferedReader(reader); //�����б�
		
		while(true)
		{
			System.out.print("�Է� ���� : ");
			String memo1 = br.readLine();
			if(memo1.equals("0"))
			{
				bw.flush();
				bw.close();
				fw.close();
				br.close();
				reader.close();
				break ;
			}
			bw.write(memo1);
		}
		
		FileReader fr = null;
		fr = new FileReader(memo);
		System.out.print("��� ���� : ");
		while(true)
		{
			int x = fr.read();
			if(x == -1)
			{
				fr.close();
				break;
			}
			
				System.out.print((char)x);
		}
	}
}