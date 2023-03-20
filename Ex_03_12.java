// 참조형 - 실행시 힙메모리에 영역 확보: String str1 = new String("10");
// 가장 비번히 사용하기 때문에 편리하게 쓸 수 있도록 아래처럼 객체 만드는 것을 허용함.

package Ex_03;

public class Ex_03_12 {

	public static void main(String[] args) {
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3 = "20";
		
		str1 = "Java 입니다.";
		
		System.out.printf("%s \n",str1);
		System.out.printf("%s \n",str2 + str3);
/*
 * 출력 : 홍길동
 * 전화번호 : 02- 222 - 333
 * 주소 : 서울 종로구 관철동
 * 
 * */
		String name = "홍길동";
		String phone = "02 - 222 - 333";
		String address = "서울 종로구 관철동";
		
		System.out.printf("이름\t: %s\n전화번호\t: %s\n주소\t: %s\n",name,phone,address);
	}

}
