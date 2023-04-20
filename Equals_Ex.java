package jang12;

import java.util.Arrays;

public class Equals_Ex 
{
	public static void main(String[] args) 
	{
		int[][] original = {{1,2},{3,4}};
/*
	Array클래스 에서는 equals() / deepEquals() 둘다 배열 비교한다
	equals() : 1차 항목값의 값만 비교 가능 , 주소비교 불가
	deepEquals() : 값,주소비교 가능 / 1차 항목이 서로 다른 배열을 참조할 경우 중첩된 배열의 항목까지 비교함
  */
		System.out.println("[얕은 복제 후 비교]");
		int[][] cloned1 = Arrays.copyOf(original,original.length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned1));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned1));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original,cloned1));
		
		System.out.println();
		
		System.out.println("[깊은 복제 후 비교]");
		int[][] cloned2 = Arrays.copyOf(original,original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[1], original[1].length);
		System.out.println("배열 번지 비교 : " + original.equals(cloned2));
		System.out.println("1차 배열 항목값 비교 : " + Arrays.equals(original, cloned2));
		System.out.println("중첩 배열 항목값 비교 : " + Arrays.deepEquals(original,cloned2));
	
		System.out.println("\n해시코드 비교");
		System.out.println(original.hashCode() + "," + cloned2.hashCode() + "," + 
						cloned2[0].hashCode() + "," + cloned2[1].hashCode());
	}
}
