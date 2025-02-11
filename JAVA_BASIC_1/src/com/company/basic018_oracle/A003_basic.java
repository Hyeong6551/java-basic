package com.company.basic018_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A003_basic {
	public static void main(String[] args) {
		// 1. Oracle 드라이버 연동
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott"; String pw = "tiger";
		
		Connection conn = null;	
		
		// Statement
		String sql1 = "select * from emp where ename='"+"WARD"+"'";	// Statement
		Statement stmt = null;	ResultSet rset = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("success");
			}
			
			stmt = conn.createStatement();
			rset = stmt.executeQuery(sql1);
			while(rset.next()) {
				System.out.println(rset.getInt("empno")+"\t"+rset.getString("ename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rset != null) {try { rset.close(); System.out.println("rset 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(stmt != null) {try { stmt.close(); System.out.println("stmt 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) {try { conn.close(); System.out.println("conn 종료"); } catch (SQLException e) { e.printStackTrace(); } }
		}
		
		// Statement
		String sql2 = "select * from emp where ename=? and empno=?";		// PreparedStatement
		PreparedStatement pstmt = null;	ResultSet rset2 = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
			
			if(conn != null) {
				System.out.println("success");
			}
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, "WARD");    //? 1번
			pstmt.setInt(2, 7521);
			rset2 = pstmt.executeQuery();
			while(rset2.next()) {
				System.out.println(rset2.getInt("empno")+"\t"+rset2.getString("ename"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rset2 != null) {try { rset2.close(); System.out.println("rset2 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt != null) {try { pstmt.close(); System.out.println("stmt 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) {try { conn.close(); System.out.println("conn 종료"); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}
/*
 * 
 * 
 */
