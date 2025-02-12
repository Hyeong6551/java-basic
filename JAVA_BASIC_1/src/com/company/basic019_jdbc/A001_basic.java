package com.company.basic019_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A001_basic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "scott";	String pw = "tiger";

		Connection conn = null;			ResultSet rset = null;
		PreparedStatement pstmt=null, pstmt2 = null;
		
		try {
//			System.out.println("번호를 선택해 주세요 1~7");
//			int no = sc.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
			
			if(conn != null) {
				System.out.println("db 연동 성공");
			}
			// 3. pstmt 사용 ( executeQuery(select) / executeUpdate(insert, update, delete) )
			
// SELECT
//			String sql ="select * from fruit where fno=?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, no);
//			rset = pstmt.executeQuery();	// 4. 표
//			while(rset.next()) {	// 5. 줄
//				System.out.println("당신이 선택한 번호 : "+rset.getInt("fno")+"\t과일 : "+rset.getString("fname")+"\t\t제조일자 : "+rset.getString("fdate")); // 6.칸
//			}

// INSERT
//			System.out.println("넣을 과일 입력 : ");
//			String fr = sc.next();
//			pstmt = conn.prepareStatement("insert into fruit(fno, fname, fdate) values(seq_fruit.nextval,?,sysdate)");
//			pstmt.setString(1, fr);
//			int result = pstmt.executeUpdate();
//			if(result > 0) { System.out.println(fr+" 추가 완료");}
		
// UPDATE
//			String sql = "update fruit set fname=? where fno=?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, "Onion");
//			pstmt.setInt(2, 5);
//			int result = pstmt.executeUpdate();
//			if(result>0) {System.out.println("수정 완료"); }
			
// DELETE		
//			System.out.println("삭제할 번호");
//			int no = sc.nextInt();
//			String sql = "delete from fruit where fno=?";
//			pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1,no);
//			int result = pstmt.executeUpdate();
//			rset = pstmt2.executeQuery();
//			if(result > 0) {System.out.println("수정 완료"+result);}
			
			String sql2 = "select * from fruit";
			pstmt2 = conn.prepareStatement(sql2);
			while(rset.next()) {
				System.out.println(rset.getInt("fno")+"\t\t"+rset.getString("fname")+"\t"+rset.getString("fdate"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rset != null) {try { rset.close(); System.out.println("rset 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt != null) {try { pstmt.close(); System.out.println("stmt2 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(pstmt2 != null) {try { pstmt2.close(); System.out.println("stmt2 종료"); } catch (SQLException e) { e.printStackTrace(); } }
			if(conn != null) {try { conn.close(); System.out.println("conn 종료"); } catch (SQLException e) { e.printStackTrace(); } }
		}
	}
}
//1. scott/tiger 계정확인
//
//2. dml : insert (create)   fruit 테이블에 sequence 이용해서 데이터 삽입 
// insert into fruit(fno, fname, fdate) values (seq_fruit.nextval, 1,sysdate);
//3. dml : select (read)     fruit 테이블에 전체데이터 출력    / fno가 5번인데이터 출력
// select * from fruit;
// select * from fruit where fno=5;
//3. dml : update (update)   fno가 5번인데이터 fname을 melon 으로 수정
// update fruit set fname='melon' where=5;
//
//4. dml : delete (delete)   fno가 5번인데이터 삭제
// delete from fruit where fno=5;