package com.company.basic018_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 1. Statement / preparedStatement (비교)
//	SELECT * FROM EMP;
//  표 - 줄 - 칸

public class A002_basic {
	public static void main(String[] args) {
		// 1. 드라이버 연동 Class.forName();
		// 2. DriverManager.getConnection(url, id, pass);
		Connection conn = null;	Statement stmt = null;	ResultSet rset = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","scott","tiger");
			if(conn != null) {
				System.out.println("success");
			}
			stmt = conn.createStatement();	// 3. db 연동시 conn Statement 구문 사용
			rset = stmt.executeQuery("select * from emp");	// sql문 사용
			while(rset.next()) {
				int empno = rset.getInt("empno");
				String ename = rset.getString("ename");
				String job = rset.getString("job");
				System.out.println(empno+"\t"+ename+"\t"+job);				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rset != null) {try { rset.close();} catch (SQLException e) { e.printStackTrace(); }}
			if(stmt != null) {try { stmt.close();} catch (SQLException e) { e.printStackTrace(); }}
			if(conn != null) {try { conn.close();} catch (SQLException e) { e.printStackTrace(); }}
		}
	}
}

