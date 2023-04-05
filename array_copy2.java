package jang12;

public class array_copy2 {

	public static void main(String[] args) {
		String[] oldStrArray = {"java","array","copy"};
		String[] newStrArray = new String[5];
		//얕은 복수 : 현재배열 == 다음배열 : 주소같다 a배열 = b배열
		//깊은 복사 : 현재배열 != 다음배열 : 주소가 다르다 , System.arraycopy
		System.arraycopy(oldStrArray, 0, newStrArray, 0,oldStrArray.length);

		/*
		System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)

		// 파라미터 설명
		Object src: 복사하고자 하는 원본 소스
		int srcPos: 복사하고자 하는 소스의 위치 (처음부터 원할 경우 0 세팅)
		Object dest: 복사한 값을 담을 소스
		int destPos: 복사본을 받을 때 저장할 위치(어디서부터 받을 건지, 처음부터 받을 경우 0 세팅)
		int length: 원본에서 복사본까지 읽어올 길이

		*/
		for(int i = 0; i < newStrArray.length;i++) 
		{
			if(i == newStrArray.length - 1)
				System.out.print(newStrArray[i]);
			else
				System.out.print(newStrArray[i] + ", ");
			// 얕은 복사 , 깊은 복사
		}
		// 깊은복사의 경우
		System.out.println(); 
		System.out.println("깊은복사의 경우"); 
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray.hashCode());
		if(oldStrArray == newStrArray)
			System.out.println("실제 주소 같음");
		else
			System.out.println("실제 주소 다름");
		
		System.out.println("---------------");
		
		//얕은 복사의 경우 : 현재 배열 == 다음배열
		System.out.println("얕은복사의 경우"); 
		String newStrArray_2[] = oldStrArray ;
		if(newStrArray_2 == oldStrArray)
			System.out.println("실제 주소 같음");
		else
			System.out.println("실제 주소 다름");
		System.out.println(oldStrArray.hashCode());
		System.out.println(newStrArray_2.hashCode());
	}
}