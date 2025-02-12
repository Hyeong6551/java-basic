package com.company.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";
		String pw = "tiger";
		String sql_tb = "CREATE TABLE BookInfo "
				+ "(no NUMBER PRIMARY KEY NOT NULL, title VARCHAR2(100) NOT NULL, "
				+ "author VARCHAR2(30), publisher VARCHAR(30), bookState boolean NOT NULL default 1);";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("success");
			}
			pstmt = conn.prepareStatement(sql_tb);
			rset = pstmt.executeQuery();
			System.out.println(rset);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }
			try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }
		}
	}
}
