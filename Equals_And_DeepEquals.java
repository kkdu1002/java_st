package jang12;

import java.util.Arrays;
import java.util.Objects;

public class Equals_And_DeepEquals 
{
	public static void main(String[] args) 
	{
		Integer o1 = 1000;
		Integer o2 = 1000;
		
		System.out.println(Objects.equals(o1, o2)); // nn , nn -> equals(b)의 값
		System.out.println(Objects.equals(o1, null));	// nn , n -> false
		System.out.println(Objects.equals(null, 02));	// n , nn -> false
		System.out.println(Objects.equals(null,null));	// n , n -> 둘다 null일때 true
		System.out.println(Objects.deepEquals(o1, o2) + "\n"); // n , n -> 둘다 null일때 true
		
		Integer [] arr1 = {1 , 2};
		Integer [] arr2 = {1 , 2};
		// 1. 둘다 not null이면(not array) --> 결과값 리턴
		// 2. 둘다 not null(array) --> 결과의 리턴값
		// Object.deepEquals == Array.deepEqulas 서로다른 배열일 경우 항목값이 모두 같아야 true
		System.out.println(Objects.equals(arr1, arr2));	// true 값 비교(array
		System.out.println(Objects.deepEquals(arr1, arr2));	// true nn , nn -> equals(b)의 값
		System.out.println(Arrays.deepEquals(arr1, arr2)); // true nn , nn -> equals(b)의 값
		System.out.println(Objects.deepEquals(null, arr2)); // n , nn -> false
		System.out.println(Objects.deepEquals(arr1, null));	// nn , n -> false
		System.out.println(Objects.deepEquals(null, null));  // n , n -> 둘다 null일때 true
	}
}