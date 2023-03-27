package jang6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Ex_06_06 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		// BufferedReader 
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));
		
		int start_num , end_num , plus_num , hap;
		int wh_start , wh_end , wh_plus;
		int do_wh_start , do_wh_end , do_wh_plus;
		
		System.out.println("----- for 문 -----");
		System.out.print("시작값 입력 : ");
		start_num = Integer.parseInt(x.readLine());
		wh_start = do_wh_start = start_num;
		
		System.out.print("끝값 입력 : ");
		end_num = Integer.parseInt(x.readLine());
		wh_end = do_wh_end = end_num;
		
		System.out.print("증가값 입력 : ");
		plus_num = Integer.parseInt(x.readLine());
		wh_plus = do_wh_plus = plus_num;
		
		for (hap = 0;start_num < end_num;start_num += plus_num) 
		{
			hap += start_num;
		}
		start_num = wh_start ;
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",start_num , end_num , plus_num , hap);
		
		System.out.println("----- while 문 -----");
		hap = 0;
		
		while(wh_start < wh_end) 
		{
			hap += wh_start;
			wh_start += wh_plus;
		}
		wh_start = start_num;
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",wh_start , wh_end , wh_plus , hap);
		
		System.out.println("----- do while 문 -----");
		hap = 0;
		do 
		{
			hap += do_wh_start;
			do_wh_start += do_wh_plus;
		}
		while(do_wh_start < do_wh_end);
		do_wh_start = start_num;
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",do_wh_start , do_wh_end , do_wh_plus , hap);
	}
}
		
		//Scanner		
/*		Scanner num = new Scanner(System.in);
		
		int start_num , end_num , plus_num , hap;
		int wh_start , wh_end , wh_plus;
		int do_wh_start , do_wh_end , do_wh_plus;
		
		System.out.println("----- for 문 -----");
		System.out.print("시작값 입력 : ");
		start_num = num.nextInt();
		wh_start = do_wh_start = start_num;
		
		System.out.print("끝값 입력 : ");
		end_num = num.nextInt();
		wh_end = do_wh_end = end_num;
		
		System.out.print("증가값 입력 : ");
		plus_num = num.nextInt();
		wh_plus = do_wh_plus = plus_num;
		
		for (hap = 0;start_num < end_num;start_num += plus_num) 
		{
			hap += start_num;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",start_num , end_num , plus_num , hap);
		
		System.out.println("----- while 문 -----");
		hap = 0;
		
		while(wh_start < wh_end) 
		{
			hap += wh_start;
			wh_start += wh_plus;
		}
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",wh_start , wh_end , wh_plus , hap);
		
		System.out.println("----- do while 문 -----");
		hap = 0;
		do 
		{
			hap += do_wh_start;
			do_wh_start += do_wh_plus;
		}
		while(do_wh_start < do_wh_end);
		System.out.printf("%d에서 %d까지 %d씩 증가한 값의 합 : %d\n",do_wh_start , do_wh_end , do_wh_plus , hap);
	}
}
*/