package jang12;

class My_Int
{
	int val;
	My_Int(int i)
	{
		val = i;
	}
}
class person4
{
	public String name;
	public int age;
	
	public person4(String s) 
	{
		name = s;
	}
	
	public void setAge(My_Int i) 
	{
		age = i.val;
		i.val++;
		System.out.println("setAge = " + i.val);
	}
}
public class CallByAddress
{
	public static void main(String[] args) 
	{
		person4 aperson = new person4("ȫ�浿");
		My_Int a = new My_Int(33);
		// �ּ� ���� ��� call by address �� ��ȯ
		aperson.setAge(a);
		
		System.out.println("main = " + a.val);
	}
}