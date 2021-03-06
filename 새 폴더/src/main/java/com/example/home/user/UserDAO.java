package com.example.home.user;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public UserDAO() {
        try {
            String dbURL = "jdbc:mysql://localhost:3306/aa";
            String dbID = "root";
            String dbPassword = "1234";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int login(String id, String password) {
        String SQL = "SELECT PASSWORD FROM USER WHERE ID = ?";
        try {
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString(1).equals(password)) {
                    return 1;//로그인 성공
                } else
                    return 0;//비밀번호 불일치
            }
            return -1;//아이디가 없음
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -2;//데이터베이스오류
    }
}
