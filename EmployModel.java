package mini_project;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class EmployModel extends AbstractTableModel 
{
	Object data [][];
	Object columnName [];
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo = new EmployeeVO();
	
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	public EmployModel()
	{
		// 열의 개수와 행의 개수를 알아야 2차원 배열 선언
		// 테이블에서 컬럼이름을 얻어와서 1차원 배열 선언
		title = emDao.getColumnName();
		columnName = title.toArray();
		int columnCount = title.size();
		
		list = emDao.getEmployeetotal();
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index = 0; index < rowCount; index++)
		{
			emVo = list.get(index);
			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobgrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();
		}
	}
	@Override
	public int getColumnCount() 
	{
		if(columnName == null)
			return 0;
		else
			return columnName.length;
	}
	
	@Override
	public int getRowCount() 
	{
		if(data == null)
			return 0;
		else
			return data.length;
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) 
	{
		return data[rowIndex][columnIndex];
	}
	
	@Override
	public String getColumnName(int columnIndex) 
	{
		return (String)columnName[columnIndex];
	}
}