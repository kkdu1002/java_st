package mini_project;

import javax.swing.*;

public class TotalPane extends JPanel
{
	EmployeeDAO edvo = null;
	public TotalPane() 
	{
		JTable table = new JTable(new EmployModel());
		add(new JScrollPane(table));
	}
}