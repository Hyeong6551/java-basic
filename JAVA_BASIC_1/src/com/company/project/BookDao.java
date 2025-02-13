package com.company.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

public class BookDao {
	public static Connection conn;
	
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";	String pw = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url,id,pw);
		} catch (Exception e) { e.printStackTrace(); }
		return conn;
	}
	// 책 추가
	public int createBook(BookInfo book) {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO BookInfo (no, title, author, publisher, bookState)"
				+ " VALUES (seq_BookInfo.nextval, ?,?,?,'T')";
		int result = -1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if(conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	// 책 변경
	public int updateBook(BookInfo book) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE bookinfo SET title=?, author=?, publisher=? WHERE no=?";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getTitle());
			pstmt.setString(2, book.getAuthor());
			pstmt.setString(3, book.getPublisher());
			pstmt.setInt(4, book.getNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	
	// 책 삭제
	public int deleteBook(int no) {
		PreparedStatement pstmt = null;
		String sql = "Delete from bookinfo where no=?";
		int result=-1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}
	// 모든 책 불러오기
	public ArrayList<BookInfo> readAllBook(){
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from bookinfo";
		ArrayList<BookInfo> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new BookInfo(
					rset.getInt("no"), rset.getString("title"), 
					rset.getString("author"), rset.getString("publisher"), rset.getBoolean("bookState")
					)
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( rset != null) {try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return list;
	}
	
	// 대출받은 모든 책 불러오기
	public ArrayList<MyBookInfo> readAllmyBook(){
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		String sql = "select * from mybookinfo";
		ArrayList<MyBookInfo> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			while(rset.next()) {
				list.add(new MyBookInfo(
					rset.getInt("mno"),rset.getString("bname"),
					rset.getInt("bookNo"), rset.getString("bdate")
					)
				);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( rset != null) {try { rset.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return list;
	}
	
	// 책 대출
	public int borrowBook(MyBookInfo myBooks) {
		PreparedStatement pstmt = null, pstmt2 = null;
		String sql = "INSERT INTO mybookinfo (mno,bname, bookNo, bdate) "
				+ "values(seq_mybookinfo.nextval,?,?,current_timestamp)";
		int result = -1;
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, myBooks.getName());
			pstmt.setInt(2, myBooks.getBookNo());
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		
		String sql2 = "Update bookinfo set bookState='F' where no=?";
		boolean bState;
		String bStateString;
		int result2 = -1;
		
		ArrayList<BookInfo> book = new ArrayList<>();
		Iterator<BookInfo> iter = book.iterator();
		while(iter.hasNext()) {
			BookInfo temp = iter.next();
			if(temp.getNo() == myBooks.getBookNo()) { bState = temp.isBookState(); break; }
		}
		
		try {
			pstmt2 = conn.prepareStatement(sql2);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result+result2;
		
	}
	
	// 책 반납
	public int returnBook(int no) {
		PreparedStatement pstmt = null;
		String sql = "delete from mybookinfo where bookNo=?";
		int result = -1;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, no);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if( pstmt != null) {try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
			if( conn != null) {try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
		}
		return result;
	}

	public static void main(String[] args) {
		BookDao dao = new BookDao();
		// 책 추가
//		dao.getConnection();
//		BookInfo book = new BookInfo();
//		book.setTitle("ddzz");
//		book.setAuthor("dddzz");
//		book.setPublisher("ddddzz");
//		if( dao.createBook(book) > 0 ) { System.out.println("성공");};
		
		// 책 변경
//		dao.getConnection();
//		BookInfo book = new BookInfo();
//		book.setNo(5); book.setTitle("asdf"); book.setAuthor("asdfqwe"); book.setPublisher("zxvsd");
//		if( dao.updateBook(book) > 0 ) { System.out.println("성공");} else {System.out.println("실패");};
	
		// 책 삭제
//		dao.getConnection();
//		if(dao.deleteBook(3)>0) {System.out.println("성공");}
		
		// 모든 책 조회
		dao.getConnection();
		System.out.println(dao.readAllBook());
		
		// 대출받은 책 조회
//		dao.getConnection();
//		System.out.println(dao.readAllmyBook());
		
		// 책 대출
//		dao.getConnection();
//		MyBookInfo myBooks = new MyBookInfo();
//		myBooks.setBookNo(3); myBooks.setName("hello");
//		dao.borrowBook(myBooks);
		
		// 책 반납
//		dao.getConnection();
//		if(dao.returnBook(3) > 0) {System.out.println("삭제 성공");};
	}
}
