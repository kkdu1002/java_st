package jang10;
import java.util.Scanner;
public class Ex_10_02 
{
	public static void main(String[] args) 
	{
		
		String name = " ";
		int Kor = 0, Eng = 0, Math = 0, sum= 0;
		System.out.print("�̸� ���� ���� ���� �Է�[,] : ");
	    Scanner s = new Scanner(System.in).useDelimiter("\\s|,");

	    name = s.next();
	    Kor = s.nextInt();
	    Eng = s.nextInt();
	    Math = s.nextInt();
	    
	    sum = Kor + Eng + Math;
	    System.out.printf("�̸� : %s\n",name);
	    System.out.printf("�հ� : %d\n",sum);
	    s.close();
	}
}