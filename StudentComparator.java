package jang12;

import java.util.Comparator;
import jang12.Compare_Ex.Student777;

public class StudentComparator implements Comparator<Student777>
{
	public int compare(Student777 a, Student777 b)
	{
		if(a.sno < b.sno)
		{
			return -1;
		}
		else if(a.sno == b.sno)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
}
