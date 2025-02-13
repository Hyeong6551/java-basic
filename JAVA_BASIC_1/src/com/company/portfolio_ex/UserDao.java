package com.company.portfolio_ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDao {
	public static Connection conn;
	public ResultSet rset;
	
	// 1. DB 연동
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";	String pw = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,user,pw);
		} catch (Exception e) { e.printStackTrace(); }
		return conn;
	}
	
	// 2. insert 
	public int insert(UserInfo user) {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO userinfo(no, name, email) VALUES (seq_userinfo.nextval, ?,?)";
		int result = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	// 3. readAll
	public ArrayList<UserInfo>readAll() {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from userinfo";
		
		ArrayList<UserInfo> list = new ArrayList<>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new UserInfo(
					rset.getInt("no"),rset.getString("name"),
					rset.getString("email"),rset.getString("udate") 
					)
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rset != null) {try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return list;
	}
	
	// 4. read
	public UserInfo read(int no) {
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		UserInfo result = null;
		String sql = "select * from userinfo where no=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				result = new UserInfo(
					rset.getInt("no"),rset.getString("name"),
					rset.getString("email"),rset.getString("udate") 
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			if (rset != null) {try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	// 5. update
	public int update(UserInfo user) {
		PreparedStatement pstmt = null;
		String sql = "update userinfo set email=? where no=?";
		int result = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getEmail());
			pstmt.setInt(2, user.getNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	// 6. delete
	public int delete(int no) {
		PreparedStatement pstmt = null;
		String sql = "delete from userinfo where no=?";
		int result = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( pstmt != null ) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null ) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// test 순서
		UserDao dao = new UserDao();
		
		// insert 
		dao.getConnection();	
		UserInfo user = new UserInfo();
		user.setName("aaa");	user.setEmail("aaa@gmail.com");
		dao.insert(user);
		System.out.println("유저 추가");
	
		// readAll
//		dao.getConnection();
//		System.out.println(dao.readAll()); 
//	
//		// read
//		dao.getConnection();
//		System.out.println(dao.read(6));
//	
//		// update
//		dao.getConnection();
//		UserInfo user2 = new UserInfo();
//		user2.setNo(4);	user2.setEmail("abc@gmail.com");
//		dao.update(user2);
//	
//		// delete
//		dao.getConnection();
//		dao.delete(7);
//		System.out.println("삭제 완료");
	}
}
/*
	CREATE TABLE userinfo(
	    no 		NUMBER NOT NULL PRIMARY KEY,
	    name 	VARCHAR2(20) NOT NULL,
	    email	VARCHAR2(20) NOT NULL,
	    udate 	TIMESTAMP    DEFAULT CURRENT_TIMESTAMP
	);
	CREATE SEQUENCE seq_userinfo;
	
	INSERT INTO userinfo(no, name, email) VALUES (seq_userinfo.nextval, 'dd','dd@gmail.com');
	INSERT INTO userinfo(no, name, email) VALUES (seq_userinfo.nextval, 'ss','ss@gmail.com');
		
	UPDATE userinfo SET email='abc@gmail.com' WHERE no=2;
	DELETE FROM userinfo WHERE no=2;
*/