package jang10;

public class UsingThis 
{
	public int outterField = 10;
	class Inner
	{
		int innerField = 20;
		void method()
		{
			MyFunctionalInterface fi = () -> 
			{
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
			
				System.out.println("InnerField : " + innerField);
				System.out.println("innerField : " + this.innerField + "\n");
			};
			fi.method();
		}
	}
	public static void main(String[] args) 
	{
		UsingThis usingThis = new UsingThis();
		UsingThis.Inner inner = usingThis.new Inner();
		inner.method();
	}
}