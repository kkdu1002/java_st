package jang12;

import java.io.*;

public class SawonReader
{
	public static void main(String[] args) throws IOException 
	{
		File f1 = new File("src/jang12/sawon.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try
		{
			fr = new FileReader(f1);
			br = new BufferedReader(fr);
			int i = 0;
			String line = "";
			while(true)
			{
				line = br.readLine();
				if(line == null)
					break;
				System.out.println((++i) + line);
			}
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			fr.close();
			br.close();
		}
	}
}