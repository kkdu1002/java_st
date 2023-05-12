package mini_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/*
	DAO(Data Access Object) Ŭ����
	- ������ ó���� �ñ����� �ܰ�
	  �����Ͻ��������� ó���� �ڷḦ �޾� DB�� �Է°� ��ȸ�� �Ѵ�.
	  
	- EmployeeVO getEmployeeregiste(EmployeeVO evo) : �ű� ��� ���
    - EmployeeVO getEmployeeCheck(int no, String name) :  ����� NO,NAME�� �Է¹޾� ��� ���� ��ȸ
    - EmployeeVO getEmployeeNo(int no) : ����� no�� �Է¹޾� ������ ��ȸ
    - EmployeeVO getEmployeeName(String name) : ����� NAME�� �Է¹޾� ������ ��ȸ
    - ArrayList<EmployeeVO> getEmployeetotal()
    - ArrayList<String> getColumnName()
    
    ��6���� �������� Ŀ�ؼ� ��ü�� prepareStatement()�� ȣ���ϰ�,
    SQL������ ������� ��� ������ PrepareStatement��ü�� ��´�.
    ���� �� �ڸ��� �ؽ�Ʈ �ʵ��� getText()�� ����Ͽ� ���� ���ڿ���
    �����Ͽ� �������� �ۼ��Ѵ�.
 */
public class EmployeeDAO 
{	// 1. �ű� ����� ���
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception
	{	// 2.������ ó���� ���� SQL��
		String dml = "insert into employee " +
					" (no , name , jobgrade , department , email)" +
					" values " + " (seq_no.nextval , ? , ? , ? , ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		
		try
		{	// 3. DBUtil�̶�� Ŭ������ getConnection()�޼ҵ�� DB�� ����
			con = DBUtil.getConnection();
			
			// 4. �Է¹��� ����� ������ ó���ϱ� ���Ͽ� SQL������ ����
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobgrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			// 5. SQL���� ���� �� ó������� ����
			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			System.out.println("i = " + i);
			
			retval.setStatus(i + ""); // SQL�� �������� EmployeeVO�� ����
		}
		catch(SQLException e)
		{
			System.out.println("getEmloyeeregiste e = [" + e + "]");
		}
		catch(Exception e)
		{
			System.out.println("e = [" + e + "]");
		}
		finally
		{
			try
			{
				// 6. DB���� ���ῡ ���Ǿ��� ������Ʈ�� ����
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException e)
			{}
		}
		System.out.println("�Է� �Ϸ� : " + retval.toString() + ", " + retval.getStatus());
		return retval;
	}
	// 7. ��� no , name�� �Է¹޾� ��� ���� ��ȸ
	public EmployeeVO getEmployeeCheck(int no,String name) throws Exception
	{ // ��ȣ , �̸��� ��ġ�ϴ� ������ �˻�
		String dml = "select * from employee where no = ? and name = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		try
		{
			con = DBUtil.getConnection(); // DB�� ����
			pstmt = con.prepareStatement(dml); // ��ȭ�� �̸� ��ȸó���� ���� SQL�� ����
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			if(rs.next())
			{ // ��ȣ�� �̸��� ��ġ�ϴ� ����� ������ ��� ���� 
			  // EmployeeVO ��ü�� ������ DB���� ���� ������ ��������
				retval = new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
										rs.getInt(4),rs.getString(5));
			}
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException se)
			{}
		}
		return retval;
	}
	// 8. ����� no�� �޾� ������ ��ȸ�ϴ� �޼ҵ�
	public EmployeeVO getEmployeeNo(int no) throws Exception
	{	// ��ȣ�� ��ġ�ϴ� ������ �˻�
		String dml = "select * from employee where no = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		try
		{
			con = DBUtil.getConnection(); // DB�� ����
			pstmt = con.prepareStatement(dml); // ��ȣ ��ȸ�ϱ� ���� SQL�� ����
			pstmt.setInt(1,no);
			
			// SQL���� �����ؼ� ó����� ����
			rs = pstmt.executeQuery();
			if(rs.next())
			{ // ��ȣ�� �̸��� ��ġ�ϴ� ����� ������ ��� ���� 
			  // EmployeeVO ��ü�� ������ DB���� ���� ������ ��������
				retval = new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
										rs.getInt(4),rs.getString(5));
			}
		}
		catch(SQLException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try
			{
				if(rs != null)
					rs.close();
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException se)
			{}
		}
		return retval;
	}
	// 8. ����� no�� �޾� ������ ��ȸ�ϴ� �޼ҵ�
		public EmployeeVO getEmployeeName(String name) throws Exception
		{	// ��ȣ�� ��ġ�ϴ� ������ �˻�
			String dml = "select * from employee where name = ?";
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			EmployeeVO retval = null;
			try
			{
				con = DBUtil.getConnection(); 
				pstmt = con.prepareStatement(dml); 
				pstmt.setString(1,name);
				
				// SQL���� �����ؼ� ó����� ����
				rs = pstmt.executeQuery();
				if(rs.next())
				{
					retval = new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
											rs.getInt(4),rs.getString(5));
				}
			}
			catch(SQLException se)
			{
				System.out.println(se);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					if(rs != null)
						rs.close();
					if(pstmt != null)
						pstmt.close();
					if(con != null)
						con.close();
				}
				catch(SQLException se)
				{}
			}
			return retval;
		}
		// ��ü��� ��ȸ
		public ArrayList<EmployeeVO> getEmployeetotal()
		{
			ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
			// ��� ��ü�� ����ϱ� ���Ѱ˻�
			String tml = "select * from employee";
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			EmployeeVO emVo = null;
			try
			{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(tml);
				
				rs = pstmt.executeQuery();
				while(rs.next())
				{
					emVo = new EmployeeVO(rs.getInt(1),rs.getString(2),rs.getString(3),
							rs.getInt(4),rs.getString(5));
					list.add(emVo);
				}
			}
			catch(SQLException se)
			{
				System.out.println(se);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					if(rs != null)
						rs.close();
					if(pstmt != null)
						pstmt.close();
					if(con != null)
						con.close();
				}
				catch(SQLException se)
				{}
			}
			System.out.println(list.toString());
			return list;
		}
		// ��Ÿ���� �����ؼ� �ʵ�� ����ϱ�
		// EmployModel���� EmplyeeDAO emDao = new EmployeeDAO();
		// title = emDao.getColumnName();
		public ArrayList<String> getColumnName()
		{
			ArrayList<String> columnName = new ArrayList<String>();
			String sql = "select * from employee";
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			// ResultSetMetaData��ü ���� ����
			ResultSetMetaData rsmd = null;
			try
			{
				con = DBUtil.getConnection();
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				rsmd = rs.getMetaData();
				int cols = rsmd.getColumnCount();
				for(int i = 1; i <= cols; i++)
				{
					columnName.add(rsmd.getColumnName(i));
				}
			}
			catch(SQLException se) //
			{
				System.out.println("����" +se);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			finally
			{
				try
				{
					if(rs != null)
						rs.close();
					if(pstmt != null)
						pstmt.close();
					if(con != null)
						con.close();
				}
				catch(SQLException se)
				{}
			}
			return columnName;
		}
}