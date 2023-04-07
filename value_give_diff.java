package jang12;

class myChar
{
	char x;
	char y;
}

public class value_give_diff 
{
	static void func1(char x , char y) 
	{
		char change;
		change = x;
		x = y;
		y = change;
	}
	static void func2(myChar ch) 
	{
		char change;
		change = ch.x;
		ch.x = ch.y;
		ch.y = change;
	}
	public static void main(String[] args) 
	{
		char x = 'A' , y = 'Z';
		System.out.printf("원래 값	: x = %c , y = %c\n",x,y);
		func1(x,y);
		System.out.printf("값을 전달한 후 : x = %c , y = %c\n\n",x,y);
		
		myChar ch = new myChar();
		ch.x = 'A';
		ch.y = 'Z';
		System.out.printf("원래 값	: x = %c , y = %c\n",ch.x,ch.y);
		func2(ch);
		System.out.printf("값을 전달한 후 : x = %c , y = %c\n\n",ch.x,ch.y);
	}
}