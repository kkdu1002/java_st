package jang12;
import java.util.Scanner;
public class change_data_rep_subs_spl 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str , strRep , strSub , strAry[];
		
		System.out.print("���ڿ��� �Է��ϼ��� : ");
		str = s.nextLine();
		
		strRep = str.replace(" ", "&");
		strSub = str.substring(3, 8);
		strAry = str.split(" ");
		
		System.out.println("�Է� ���ڿ� ==> " + str);
		System.out.println("�ٲ� ���ڿ� ==> " + strRep);
		System.out.println("�Ϻ� ���ڿ� ==> " + strSub);
		
		for(int i = 0; i < strAry.length; i++)
		{
			System.out.println("�и��� ���ڿ�" + i + "==>" + strAry[i]);
		}
	}
}