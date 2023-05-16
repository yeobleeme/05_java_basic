package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteMain {
	
	final static String DRV = "oracle.jdbc.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	final static String USR = "scott";
	final static String PWD = "TIGER";
	
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL, USR, PWD);
			
			sql = "delete from emp where empno=?";
			
			// 레코드 삭제
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, 9001);
			int row = pstmt.executeUpdate();
			System.out.println("emp테이블에 " + row + "건 삭제 성공");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) pstmt.close();
				if(conn != null) conn.close();				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
