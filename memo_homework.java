package jang8;

import java.io.*;

public class memo_homework 
{
	public static void main(String[] args) throws IOException 
	{
		String memo = "src/jang8/memo.txt";
		
		InputStream input_memo = System.in;
		FileWriter fw = new FileWriter(memo); 	//파일쓰기
		BufferedWriter bw = new BufferedWriter(fw); //버퍼파일쓰기
		Reader reader = new InputStreamReader(input_memo); //읽기
		BufferedReader br = new BufferedReader(reader); //버퍼읽기
		
		while(true)
		{
			System.out.print("입력 내용 : ");
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
		System.out.print("출력 내용 : ");
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