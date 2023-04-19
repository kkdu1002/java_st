package jang12;

import java.util.Arrays;
import java.util.Objects;

public class Equals_And_DeepEquals 
{
	public static void main(String[] args) 
	{
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		System.out.println(Objects.equals(o1, o2)); // nn , nn -> equals(b)�� ��
		System.out.println(Objects.equals(o1, null));	// nn , n -> false
		System.out.println(Objects.equals(null, 02));	// n , nn -> false
		System.out.println(Objects.equals(null,null));	// n , n -> �Ѵ� null�϶� true
		System.out.println(Objects.deepEquals(o1, o2) + "\n"); // n , n -> �Ѵ� null�϶� true
		
		Integer [] arr1 = {1 , 2};
		Integer [] arr2 = {1 , 2};
		// 1. �Ѵ� not null�̸�(not array) --> ����� ����
		// 2. �Ѵ� not null(array) --> ����� ���ϰ�
		// Object.deepEquals == Array.deepEqulas ���δٸ� �迭�� ��� �׸��� ��� ���ƾ� true
		System.out.println(Objects.equals(arr1, arr2));	// true �� ��(array
		System.out.println(Objects.deepEquals(arr1, arr2));	// true nn , nn -> equals(b)�� ��
		System.out.println(Arrays.deepEquals(arr1, arr2)); // true nn , nn -> equals(b)�� ��
		System.out.println(Objects.deepEquals(null, arr2)); // n , nn -> false
		System.out.println(Objects.deepEquals(arr1, null));	// nn , n -> false
		System.out.println(Objects.deepEquals(null, null));  // n , n -> �Ѵ� null�϶� true
	}
}