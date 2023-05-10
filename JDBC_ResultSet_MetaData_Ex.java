package jang9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Types;

/*
	ResultSetMetaData : java.sql.ResultSetMetaData/java.sql.Types
	MetaData는 데이터의 구성요소를 나타낸다. ResultSetMetaData는 ResultSet을 구성하는 모든 요소를
	알아낼 수 있는 메소드를 제공한다.
 */
public class JDBC_ResultSet_MetaData_Ex 
{	// 실행 select * from professor;
	public static void main(String[] args) throws IOException, SQLException 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//키보드로 실행할 sql문장을 입력받는 입력장치 생성
		System.out.print("sql입력");
		String sql = br.readLine();
		Connection con = ConnUtil.getConnection();
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
		//쿼리 수행결과집합의 부가정보를 가지고있는 ResultsetMetaData 얻기
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnType(6));
		System.out.println("칼럼의 개수 : " + rsmd.getColumnCount());
		
		//칼럼명 출력
		for(int i = 1; i <= rsmd.getColumnCount(); i++)
		{
			System.out.print(rsmd.getColumnName(i) + "\t");
		}
		System.out.println("\n-------------------------------------------------------");
		//칼럼 타입
		for(int i = 1; i <= rsmd.getColumnCount(); i++)
		{
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println();
		int 칼럼개수 =  rsmd.getColumnCount();
		while(rs.next())
		{
			for(int 칼럼번호 = 1; 칼럼번호 <= 칼럼개수; 칼럼번호++)
			{
				int 칼럼타입 = rsmd.getColumnType(칼럼번호);
				switch(칼럼타입)
				{
					case 2: // Types.NUMERIC
						System.out.print(rs.getInt(칼럼번호) + "\t");
						break;
					case Types.VARCHAR:
						System.out.print(rs.getString(칼럼번호) + "\t");
						break;
					case 93: //Types.TIMESTAMP
						System.out.print(rs.getDate(칼럼번호) + "\t");
						break;
					default:
						break;
				}
			}
			System.out.println();
		}
	}
}