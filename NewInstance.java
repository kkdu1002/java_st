package jang12;

public class NewInstance 
{
	public static void main(String[] args) 
	{
		try
		{
			Class clazz = Class.forName("jang12.SendAction");
//			Class clazz = Class.forName("jang12.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.execute();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(InstantiationException e)
		{
			e.printStackTrace();
		}
		catch(IllegalAccessException e)
		{
			e.printStackTrace();
		}
	}
}