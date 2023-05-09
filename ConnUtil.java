package jang9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
	JDBC 이용한 데이터베이스 연결 방법
1단계 : Driver 로딩 Class.forName("oracle.jdbc.OracleDriver");
2단계 : DataBase연결 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
																	ip주소 : 포트번호 : 전역변수 , 계졍명 = user , 비밀번호
3단계 : Query문 작성
Statement stmt = con.createStatement(); // 정적
PreparedStatement pstmt = con.PreparedStatement(sql); // 동적

4단계 : 결과담기
ResultSet rs = stmt.excuteQurey("쿼리문"); // select
stmt.excuteUpdate("쿼리문"); //insert , delete , update

5단계 : resource사용후 닫기
con.close();
stmt.close();
re.close();

PreparedStatement객체의 생성 및 바인딩 변수의 사용
String sql = "insert into department values()";
PreparedStatement pstmt = con.PreparedStatement(sql);
바인딩 변수의 개수만큼 순서대로 해당 변수와 대체될 값을 지정해준다
pstmt.setInt(1,203);
pstmt.setString(2,"컴퓨터공학");
pstmt.setInt(3,200);
pstmt.setString(4,"4호관");
바인딩 변수는 칼럼명 사용 불가

Primary key
테이블의 각 행을 다른 행과 구분해 주는 역할을 하는 필드
유일성, 반드시 값이 있어야하고 중복안됨
not null , unique 제약조건을 포함

Foreign key
한 테이블의 기본키에 관계를 갖는 두 개의 테이블이 있는 경우를 위한 것
외부키는 테이블 내의 한 열의 필드인 동시에 다른 테이블(부모:참조키)의 기본키인 열의 필드를 말한다.
 */
public class ConnUtil 
{
	static
	{
		try
		{
			Class.forName("oracle.jdbc.OracleDriver");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage() + "not class");
		}
	}
	public static Connection getConeConnection() throws SQLException
	{
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	}
}
