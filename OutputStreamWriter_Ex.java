package jang8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		FileOutputStream fos = new FileOutputStream("src/jang8/file.txt");
		Writer writer = new OutputStreamWriter(fos);
//		OutputStreamWriter 중계 스트림 , 아래내용(프로그램)에서 파일로 저장
//		2			<-		2 ----------------- 1
		String data = "바이트 출력 스트림을 문자 출력 스트림으로 변환";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}
