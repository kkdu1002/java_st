package mini_project;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/*
	DAO(Data Access Object) 클래스
	- 데이터 처리의 궁극적인 단계
	  비지니스로직에서 처리된 자료를 받아 DB에 입력과 조회를 한다.
	  
	- EmployeeVO getEmployeeregiste(EmployeeVO evo) : 신규 사원 등록
    - EmployeeVO getEmployeeCheck(int no, String name) :  사원의 NO,NAME을 입력받아 사원 정보 조회
    - EmployeeVO getEmployeeNo(int no) : 사원의 no를 입력받아 정보를 조회
    - EmployeeVO getEmployeeName(String name) : 사원의 NAME을 입력받아 정보를 조회
    - ArrayList<EmployeeVO> getEmployeetotal()
    - ArrayList<String> getColumnName()
    
    위6개는 공통으로 커넥션 객체의 prepareStatement()를 호출하고,
    SQL쿼리를 실행시켜 디비를 조작할 PrepareStatement객체를 얻는다.
    값이 들어가 자리에 텍스트 필드의 getText()를 사용하여 얻은 문자열을
    대입하여 쿼리문을 작성한다.
 */
public class EmployeeDAO 
{	// 1. 신규 사용자 등록
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception
	{	// 2.데이터 처리를 위한 SQL문
		String dml = "insert into employee " +
					" (no , name , jobgrade , department , email)" +
					" values " + " (seq_no.nextval , ? , ? , ? , ?)";
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		
		try
		{	// 3. DBUtil이라는 클래스의 getConnection()메소드로 DB와 연결
			con = DBUtil.getConnection();
			
			// 4. 입력받은 사용자 정보를 처리하기 위하여 SQL문장을 생성
			pstmt = con.prepareStatement(dml);
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobgrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			// 5. SQL문을 수행 후 처리결과를 얻어옴
			int i = pstmt.executeUpdate();
			retval = new EmployeeVO();
			System.out.println("i = " + i);
			
			retval.setStatus(i + ""); // SQL문 수행결과를 EmployeeVO에 저장
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
				// 6. DB와의 연결에 사용되었던 오브젝트를 해제
				if(pstmt != null)
					pstmt.close();
				if(con != null)
					con.close();
			}
			catch(SQLException e)
			{}
		}
		System.out.println("입력 완료 : " + retval.toString() + ", " + retval.getStatus());
		return retval;
	}
	// 7. 사원 no , name을 입력받아 사원 정보 조회
	public EmployeeVO getEmployeeCheck(int no,String name) throws Exception
	{ // 번호 , 이름이 일치하는 데이터 검색
		String dml = "select * from employee where no = ? and name = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		try
		{
			con = DBUtil.getConnection(); // DB와 연결
			pstmt = con.prepareStatement(dml); // 번화와 이름 조회처리를 위한 SQL문 생성
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			if(rs.next())
			{ // 번호와 이름이 일치하는 사원이 존재할 경우 수행 
			  // EmployeeVO 객체를 생성해 DB에서 얻어온 값으로 저장해줌
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
	// 8. 사원의 no를 받아 정보를 조회하는 메소드
	public EmployeeVO getEmployeeNo(int no) throws Exception
	{	// 번호가 일치하는 데이터 검색
		String dml = "select * from employee where no = ?";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		try
		{
			con = DBUtil.getConnection(); // DB에 연결
			pstmt = con.prepareStatement(dml); // 번호 조회하기 위한 SQL문 생성
			pstmt.setInt(1,no);
			
			// SQL문을 실행해서 처리결과 얻어옴
			rs = pstmt.executeQuery();
			if(rs.next())
			{ // 번호와 이름이 일치하는 사원이 존재할 경우 수행 
			  // EmployeeVO 객체를 생성해 DB에서 얻어온 값으로 저장해줌
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
	// 8. 사원의 no를 받아 정보를 조회하는 메소드
		public EmployeeVO getEmployeeName(String name) throws Exception
		{	// 번호가 일치하는 데이터 검색
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
				
				// SQL문을 실행해서 처리결과 얻어옴
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
		// 전체사원 조회
		public ArrayList<EmployeeVO> getEmployeetotal()
		{
			ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
			// 사원 전체를 출력하기 위한검색
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
		// 메타정보 조히해서 필드명 출력하기
		// EmployModel에서 EmplyeeDAO emDao = new EmployeeDAO();
		// title = emDao.getColumnName();
		public ArrayList<String> getColumnName()
		{
			ArrayList<String> columnName = new ArrayList<String>();
			String sql = "select * from employee";
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			// ResultSetMetaData객체 변수 선언
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
				System.out.println("여기" +se);
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