package jang12;
/*
 - Wrapper Class : 기본형을 객체로 , 객체를 기본형으로 변환하는 클래스들
 1. 기본을 객체로 변환할때		:	기본형클래스 객체명 = new 가본형클래스(기본값);
 2. 기본형으로 변환할때	:	기본형	변수 = 객체명.기본형Value();
 3. 스트링을 기본형으로 변환할때		:	기본형	변수 = 기본형클래스.parse기본형("스트링");
 4.	기본형을 스트링으로 변환할때		:	String	변수 = 기본형클래스.toString();
 5.	객체로 변환		:	기본형클래스 = 기본형클래스.valueOf(숫자 또는 스트링)
 */
public class WrapperClass 
{
	public static void main(String[] args)
	{
		Integer i = new Integer(10);	// 기본형을 객체로 변환
		char c = '4';
		Double d = new Double(3.1234566);	// 기본형을 객체로 변환
		System.out.println(Character.toLowerCase('A')); 
		if(Character.isDigit(c)) 
		{ // c에 들어있는 값이 숫자형 문자이면 숫자로 변환해서 가져오기
			System.out.println(Character.getNumericValue(c));
		}
		System.out.println(Integer.parseInt("-123"));
		System.out.println(Integer.toBinaryString(28));
		System.out.println(Integer.toHexString(28));
		System.out.println(i.doubleValue());
		System.out.println(d.toString());
		System.out.println(Double.parseDouble("44.13e-6"));
	}
}