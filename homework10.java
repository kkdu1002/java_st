package jang12;

public class homework10 
{
	public static void main(String[] args) 
	{
		String array [] = {"JAVA","DATABASE","JSP","XML"};
		String in_array[] = new String [6];
		in_array[0] = "OS";
		in_array[1] = "Network";
		String des[] = new String[6];
		
		   //	������ �� , ������� , ���ϰ� , ���ϰ� ���� ,���̷��ϴ� �迭����
		System.arraycopy(array, 0, in_array, 2, array.length);
		System.arraycopy(in_array, 0, des, 0, in_array.length);

		for(int i = 0 ; i < des.length; i++)
		{
			System.out.printf("des value = %s\n",des[i]);
		}
	}
}