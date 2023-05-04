package chatting;

import java.io.*;
import java.net.*;
/*
	1. unicast 통신 : 1 대 1 통신
	2. broadcast통신 : 1 대 다수 통신 (방송국)
	3. multicasting 통신 : 다 대 다 (화상회의)
 */
public class Client_Ex 
{
	public static void main(String[] args) 
	{
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		Socket socket = null;
		try 
		{
//			클라이언트 소켓 생성
			socket = new Socket("localhost",5432);
//			서버로부터의 입력 스트림 얻어오기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			키보드로부터의 입력 스트림 생성
			stin = new BufferedReader(new InputStreamReader(System.in));
//			서버로의 출력 스트림 얻어오기
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String outputMessage;
			while(true)
			{
//				키보드에서 한 행의 문자열 읽음
				outputMessage = stin.readLine();
//				bye가 입력되면 메세지 전송 후 연결 종료
				if(outputMessage.equalsIgnoreCase("bye"))
				{
					out.write(outputMessage);
					out.flush();
					break;
				}
//			키보드에서 읽은 문자열 전송
				out.write("클라이언트 > " + outputMessage + "\n");
				out.flush();
//				서버에서 한 행의 문자열 읽음
				String inputMessage = in.readLine();
				System.out.println(inputMessage);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				socket.close();
			}
			catch(IOException e2)
			{
				System.out.println("서버와의 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}