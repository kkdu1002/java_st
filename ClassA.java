package jang8;

import java.io.Serializable;

public class ClassA implements Serializable
{
	private static final long serialVersionUID = 1L;
	//	����ȭ O
	int field1;
	ClassB field2 = new ClassB();
	
//	����ȭ X
	static int field3;
	transient int field4;
}
