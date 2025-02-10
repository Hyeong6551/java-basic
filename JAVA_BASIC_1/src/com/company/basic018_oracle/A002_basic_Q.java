package com.company.basic018_oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/* 
	Q1.  dept 테이블 구조확인 (SQL)	DESC DEPT
	Q2.  dept 전체데이터 확인 (SQL)  SELECT * FROM DEPT
	Q3.  dept 테이블에서 deptno, dname만검색 (SQL) 	SELECT DEPTNO, DNAME FROM DEPT
	Q4.  JDBC003_EX.java dept전체데이터 불러오기(eclipse) 
	Q5.  JDBC004_EX.java dept 테이블에서 deptno, dname만검색 불러오기 (eclipse) 
 */

/*
 * 	1. 드라이버 연동 	Class.forName();
 *  2. 연결객체	 	conn = DriverManager.getConnection();
 *  3. sql 사용 	 	stmt = conn.createStatement();
 *  4. 표			rset = stmt.executeQuery();
 *  5. 줄			while(rset.next()) {}
 *  6. 칸			rset.getString("필드")ㅣ	
 * 
 */

public class A002_basic_Q {
	public static void main(String[] args) {
		Connection conn = null;	Statement stmt=null; ResultSet rset = null;	
		String path = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";	String pw = "tiger";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(path,id,pw);
			stmt = conn.createStatement();
			rset = stmt.executeQuery("select deptno, dname from dept where deptno="+num);
			while(rset.next()) {
				int deptno = rset.getInt("deptno");
				String dname = rset.getString("dname");
				System.out.println(dname);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	// close 순서 중요
			if (rset != null) { try { rset.close(); System.out.println("rset 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if (stmt != null) { try { stmt.close(); System.out.println("stmt 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if (conn != null) { try { conn.close(); System.out.println("conn 종료"); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}
