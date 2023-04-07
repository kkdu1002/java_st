package jang12;

public class person2 
{
	public static void main(String[] args) 
	{
		person[] pa;
		pa = new person[10];
		for(int i = 0; i < pa.length;i++)
		{
			pa[i] = new person();
//	public		pa[i].age = 30 + i;
			pa[i].setAge(30 + i); // private
			
		}
		for (int i = 0; i < pa.length; i++) 
		{
//	public		System.out.print(pa[i].age+" ");
			System.out.print(pa[i].getAge()+" "); // private
		}
	}
}