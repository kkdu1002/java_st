package chatting;
// Ŭ���̾�Ʈ -- ���� �ϴ��Ϸ� ä��
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
			listener = new ServerSocket(5432); // ���� ���� ����
			socket = listener.accept(); // Ŭ���̾�Ʈ�κ��� �����û ���
			System.out.println("�����");
//			Ŭ���̾�Ʈ���� �Է½�Ʈ�� ���
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			Ű���忡�� �Է½�Ʈ�� ��ü ����
			stin = new BufferedReader(new InputStreamReader(System.in));
//			Ŭ���̾�Ʈ���� ��½�Ʈ�� �ޱ�
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			while(true)
			{
//				Ŭ���̾�Ʈ���� �� ���� ���ڿ��� ����
				inputMessage = in.readLine();
//				Ŭ���̾�Ʈ�� bye�� ������ ��������
				if(inputMessage.equalsIgnoreCase("bye"))
					break;
//				Ŭ���̾�Ʈ�� ���� �޼��� Ȯ��
				System.out.println(inputMessage);
//				Ű���忡�� �� ���� ���ڿ� ����
				String outputMessage = stin.readLine();
				
//				Ű���忡�� ���� ���ڿ� ����
				out.write("���� > " + outputMessage + "\n");
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
				System.out.println("Ŭ���̾�Ʈ�� ä�� �� ������ �߻��Ͽ����ϴ�.");
			}
		}
	}
}