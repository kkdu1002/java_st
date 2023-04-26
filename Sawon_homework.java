package jang12;

import java.io.*;
import java.util.Calendar;

public class Sawon_homework 
{
	public static void main(String[] args) throws IOException 
	{
		String f1 = "src/jang12/sawon.txt";
		String f2 = "src/jang12/sawonResult.txt";
		try
		{
			FileReader fr = new FileReader(f1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(f2);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(fw);
			
			Calendar cal = Calendar.getInstance();
			int year  = cal.get(Calendar.YEAR);
			int month  = cal.get(Calendar.MONTH) + 1;
			int day  = cal.get(Calendar.DAY_OF_MONTH);
			String line = "";
			
			pw.printf("\t%s년 신입사원 평가 점수",year);
			pw.println("\t------------------------");
			pw.printf("\t\t\t평가일 : %d년 %d월 %d일\n",year,month,day);
			pw.println("이름\tjava\tjquery\thtml5\tcss3\ttotal\tavg");
			
			System.out.printf("\t%s년 신입사원 평가 점수",year);
			System.out.println("\t------------------------");
			System.out.printf("\t\t\t평가일 : %d년 %d월 %d일\n",year,month,day);
			System.out.println("이름\tjava\tjquery\thtml5\tcss3\ttotal\tavg");
			
			while(true)
			{
				line = br.readLine();
				if(line == null)
					break;
				line = line.replace(',', '\t');
				String [] str = line.split("\t");
				int sum = 0;
	
				for(int i = 1; i < str.length; i++)
				{
					sum += Integer.parseInt(str[i]);
				}
				double avg = sum / 4.0;
				System.out.println("----------------------------------------------------");
				System.out.println(line + "\t" + sum + "\t" + avg);
				pw.println("------------------------------------------------------------");
				pw.println(line + "\t" + sum + "\t" + avg);
				
				/*
				if(line == null);
					break;
				String [] str = line.split(",");
				String name = str[0];
				String c = ""; // 각 과목변수 출력변수에 저장
				int tot = 0;
				for(int i = 1; i < str.length; i++)
				{
					tot += Integer.parseInt(str[i]);
					c += str[i] + "\t";
				}
				double avg = tot/4.;
				System.out.print("\n" + name + "\t" + c + tot + "\t" + avg + "\n");
				*/
			}
			pw.flush();
			fr.close();
			br.close();
			fw.close();
			bw.close();
		}
		catch(Exception e)
		{
			e.getStackTrace();
		}
		finally
		{
			
		}
	}
}	