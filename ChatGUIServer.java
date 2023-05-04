package chatting;

import java.io.*;
import java.net.*;
import java.util.Vector;

public class ChatGUIServer 
{
	ServerSocket ss;
	Socket s;
	Vector v;
	public void addThread(ServerThread st)
	{
		v = new Vector();
	}
	public void broadcast(String str) 
	{
		for(int i = 0; i < v.size(); i++)
		{
			ServerThread st = (ServerThread) v.elementAt(i);
			st.send(str);
		}
	}
	public void go() 
	{
		try
		{
			ss = new ServerSocket(5555);
			System.out.println("서버가동");
			while(true)
			{
				s = ss.accept();
				ServerThread st = new ServerThread(this, s);
				addThread(st);
				st.start();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void removeThread(ServerThread st) 
	{
		v.removeElement(st);
	}
	public static void main(String[] args) 
	{
		ChatGUIServer cs = new ChatGUIServer();
		cs.go();
	}
}
class ServerThread extends Thread
{
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	ChatGUIServer cg;
	String str;
	String name;
	InetAddress ip;
	public ServerThread(ChatGUIServer cg , Socket s) 
	{
		this.s = s;
		this.cg = cg;
		ip = s.getInetAddress();
		System.out.println(ip + "가 접속하였습니다.");
		
		try
		{
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(s.getOutputStream(),true);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	public void send(String str)
	{
		pw.println(str);
	}
	@Override
	public void run()
	{
		try
		{
			name = br.readLine();
			cg.broadcast("[" + name + "] 님이 입장하셨습니다.");
			while((str = br.readLine()) != null)
			{
				cg.broadcast("[" + name + "]" + str);
			}
		}
		catch(Exception e)
		{
			cg.removeThread(this);
			cg.broadcast("["+name+"] 님 갔어..");
			System.out.println(ip + "의 연결이 종료되었습니다.");
		}
	}
}