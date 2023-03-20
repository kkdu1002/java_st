package Ex02;
//패키지 : package 패키지명;
//패키지, 폴더 , 디렉토리 --> 구분
//java.lang.* default package라서 import할 필요없음
//미리 class loader가 메모리에 올려놓음

//		행 옮기기 alt 방향키
import java.util.Scanner;

public class Ex02_02 {
	public static void main(String[] args) {
		int i , j ;
		int result ;
		Scanner s = new Scanner(System.in);
//		import단축키 --> 적당히 입력후 cnt space , 마우스 근처에 놓기
//		System.out.print("첫번째 값 입력");
		i = s.nextInt();
//		System.out.print("두번째 값 입력");
		j = s.nextInt();
		
		result = i + j;
		System.out.println(i + "+" + j + "=" + result);
		
		result = i - j;
		System.out.println(i + "-" + j + "=" + result);
		
		result = i * j;
		System.out.println(i + "*" + j + "=" + result);
		
		result = i / j;
		System.out.println(i + "/" + j + "=" + result);
		
		s.close();
	}
}
