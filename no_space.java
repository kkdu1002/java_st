package jang12;

public class no_space 
{
	public static void main(String[] args) 
	{
		String str = "   �ѱ�   ABCD   efgh    ";
		
		String result ="";
		
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				result += str.substring(i , i + 1);
			}
		}
		System.out.println("�� ���ڿ� ==> [" + str + "]");
		System.out.println("�������� ==> [" + result + "]");
	}
}