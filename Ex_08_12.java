package jang8;

public class Ex_08_12 
{
	public static void main(String[] args) 
	{
		// Object 타입은 '==' , equals() : 모두 주소 비교
		// String 타입의 문자열을 비교 할 때 : 비교 연산자 사용 X
		// String 타입은 '==' 주소 비교, equals() : 값 비교
		// Object로부터 equals()를 상속받아서 값 비교를 할 수 있도록
		// 재정의 overriding을 했기때문에 값 비교가 가능
		// 기본타입 연산 : == 왼쪽과 오른쪽 값이 같나(값비교)
		String strVar1 = "신민철";
		String strVar2 = "신민철";
		String strVar3 = new String("신민철");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		//hashCode() 재정의 Overriding
		System.out.println(" strVar1 " + strVar1.hashCode());
		System.out.println(" strVar2 " + strVar2.hashCode());
		System.out.println(" strVar3 " + strVar3.hashCode());
		
		// 객체 : 클래스 , 배열 , 인터페이스 ,String : 실행시 heap 메모리 사용
		System.out.println("-------------------------");
		
		//String이 equals() 를 재정의 해서 내용 비교가 된다.
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}