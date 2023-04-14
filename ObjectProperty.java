package jang12;


public class ObjectProperty 
{
	public static void main(String[] args) 
	{
		Point p = new Point(2,3);
//		클래스의 이름 가져오기
		System.out.println(p.getClass().getName());
//		객체를 유일하게 구분할 수 있는 정수 id값을 리턴한다.
//		id 값은 객체가 생성될 때 주어지는 값이다.
		System.out.println(p.hashCode());
		System.out.println(p.toString());
		System.out.println(p);
		
		Point a = new Point(2,3);
		System.out.println(a.toString());
	}
}