package chatting;
// 클라이언트 -- 서버 일대일로 채팅
import java.io.*;
import java.net.*;

public class Server_Ex 
{
	public static void main(String[] args)
	{
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		try
		{
			listener = new ServerSocket(5432); // 서버 소켓 생성
			socket = listener.accept(); // 클라이언트로부터 연결요청 대기
			System.out.println("연결됨");
//			클라이언트에서 입력스트림 얻기
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			키보드에서 입력스트림 객체 생성
			stin = new BufferedReader(new InputStreamReader(System.in));
//			클라이언트에서 출력스트림 받기
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			while(true)
			{
//				클라이언트에서 한 행의 문자열을 읽음
				inputMessage = in.readLine();
//				클라이언트가 bye를 보내면 연결종료
				if(inputMessage.equalsIgnoreCase("bye"))
					break;
//				클라이언트가 보낸 메세지 확인
				System.out.println(inputMessage);
//				키보드에서 한 행의 문자열 읽음
				String outputMessage = stin.readLine();
				
//				키보드에서 읽은 문자열 전송
				out.write("서버 > " + outputMessage + "\n");
				out.flush();
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
				listener.close();
			}
			catch(IOException e)
			{
				System.out.println("클라이언트와 채팅 중 오류가 발생하였습니다.");
			}
		}
	}
}