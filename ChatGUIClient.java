package chatting;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import javax.swing.*;

public class ChatGUIClient extends JFrame implements ActionListener,Runnable
{
	JTextArea ta;
	JTextField tf;
	JScrollPane js;
	Socket s;
	
	PrintWriter pw;
	BufferedReader br;
	String str, str1;
	String nick;
	String ip;
	public void view()
	{
		ta = new JTextArea();
		tf = new JTextField();
		js = new JScrollPane(ta);
		ta.setBackground(Color.CYAN);
		ta.setForeground(Color.RED);
		
		add(js,"Center");
		add(tf,"South");
		tf.addActionListener(this);
		setSize(400,300);
		setVisible(true);
		tf.requestFocus();
		addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) 
			{
				System.exit(0);
			}
		});
		go();
	}
	public void go()
	{
		try
		{
			s = new Socket("localhost" , 5555);
			pw = new PrintWriter(s.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		Thread ct = new Thread(this);
		ct.start();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		str = tf.getText();
		tf.setText("");
		pw.println(str);
	}
	@Override
	public void run() 
	{
		pw.println(ip + " : " + nick);
		try
		{
			while((str1 = br.readLine()) != null)
			{
				ta.append(str1 + '\n'); 
			}
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
	public void connect()
	{
		class Connecting extends JFrame implements ActionListener
		{
			JTextField nickTF;
			JTextField ipTF;
			JLabel nickL;
			JLabel ipL;
			JButton connect;
			JPanel p;
			public Connecting()
			{
				nickTF = new JTextField(20);
				ipTF = new JTextField(20);
				nickL = new JLabel("대화명");
				ipL = new JLabel("서버주소");
				connect = new JButton("연결");
						
				connect.addActionListener(this);
				p = new JPanel();
				
				p.setLayout(new GridLayout(2,2));
				p.add(ipL);
				p.add(ipTF);
				p.add(nickL);
				p.add(nickTF);
				add(p,"Center");
				add(connect,"South");
				
				pack();
				setResizable(false);
				setVisible(true);
			}
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				nick = nickTF.getText();
				ip = ipTF.getText();
				setVisible(false);
				view();
			}
		}
	}
	public static void main(String[] args) 
	{
		ChatGUIClient cg = new ChatGUIClient();
		cg.connect();
	}
}