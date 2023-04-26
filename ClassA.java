package jang8;

import java.io.Serializable;

public class ClassA implements Serializable
{
	private static final long serialVersionUID = 1L;
	//	직렬화 O
	int field1;
	ClassB field2 = new ClassB();
	
//	직렬화 X
	static int field3;
	transient int field4;
}
