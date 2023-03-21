package jang2;

import java.io.*;

public class input_ex {

	public static void main(String[] args) {
//		입력 스트림 객체 생성 2byte <- 1byte
		InputStreamReader rd = new InputStreamReader(System.in);
//		표준 입력 장치 : System.in , 키보드
//		표준 출력 장치 : System.out , 모니터
		try { // 에러 검사를 해서 에러가 없으면 아래문장을 처리함
			//catch문을 처리하지 않고 끝남.
			//에러가 있으면 아래문장 처리하지 않고 catch문장을 처리함
			while (true) {
				int a = rd.read();
				if(a == -1) // cnt z -- > 파일의 끝 EOF == -1
					break; //반복문(while) 탈출
				System.out.println((char)a);
			}
		}
		catch(IOException e) {
			System.out.println("입력 에러 발생" + e.getStackTrace());
		}
	}
}
