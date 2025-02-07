package com.company.basic018_oracle;

import java.sql.Connection;
import java.sql.DriverManager;

// JDBC Oracle
// ojdbc17.jar -> Add to  Build Path

// sid	:	SELECT name FROM v$database;				XE
// port	:	SELECT 	dbms_xdb.gethttpport() FROM dual	8080

// 1. RDB
// 2. 테이블 간 관계
// 3. Entity, 테이블 - Relationship, 관계 - Attribute, 속성

public class A001_basic {
	public static void main(String[] args) {
		Connection conn = null;
			
		try {
			// 1. jdbc 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver"); // →
			// 2. 데이터베이스 접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
												"SCOTT","TIGER");	// ←
			if(conn != null) {
				System.out.println("연결 성공");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
