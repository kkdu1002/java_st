package jang12;

public class StringBuilder_Ex 
{
	/*
	문자열을 변경하는 작업이 많으면 StringBuffer , StringBuilder를 사용
	추가,수정,삭제를 할 수 있도록 설계 됨
	StringBuffer : 멀티스레드 환경에서 안정적 / 동기화 지원o
	StringBuilder : 단일스레드 환경에 사용되도록 설계 / 동기화 지원x
	 */
	public static void main(String[] args)
	{
		StringBuilder sb  = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		
		System.out.println(sb.toString());
//		Java Program Study
		
		sb.insert(4,"2");
		System.out.println(sb.toString());
//		Java2 Program Study
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
//		Java6 Program Study
		
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
//		Java6 Book Study 
		
		sb.delete(4, 5);
		System.out.println(sb.toString());
//		Java Book Study
		
		int length = sb.length();
		System.out.println("총 문자수 : " + length);

		String result = sb.toString();
		System.out.println(result);
	}

}
