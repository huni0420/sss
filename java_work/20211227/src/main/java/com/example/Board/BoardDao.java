package com.example.Board;

import com.example.db.DBIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
    public List<BoardDto> selectlist(){
        List<BoardDto> list = new ArrayList<>();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =
                    DriverManager.getConnection(
                            "jdbc:mysql://127.0.0.1:3306/aa",
                            "root",
                            "1234");
            PreparedStatement pstmt =
                    conn.prepareStatement(
                            "SELECT * FROM board ORDER BY idx DESC LIMIT 0,5");
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                list.add(
                        new BoardDto(rs.getInt("idx"),
                                rs.getString("name"),
                                rs.getString("title"),
                                rs.getString("content"),
                                rs.getString("wdate")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public String insert(BoardDto dto) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn =
                    DriverManager.getConnection(
                            "jdbc:mysql://127.0.0.1:3306/aa",
                            "root",
                            "1234");
            PreparedStatement pstmt =
                    conn.prepareStatement(
                            "INSERT INTO board " +
                                    "(name, title,content,wdate) " +
                                    "VALUES " +
                                    "(?, ?, ?, NOW())");

            pstmt.setString(1,dto.getName());
            pstmt.setString(2,dto.getTitle());
            pstmt.setString(3,dto.getContent());

            pstmt.executeUpdate();
            return "true";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "false";
    }

    public BoardDto selectrow(int idx) {
        try {
            Class.forName("DBIN.jar");
            Connection conn =DriverManager.getConnection(
                            DBIn.url,
                            DBIn.user,
                            DBIn.pw);
            PreparedStatement pstmt =
                    conn.prepareStatement(
                            "SELECT * FROM BOARD WHERE IDX = ?");
            pstmt.setInt(1,idx);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                return  new BoardDto(rs.getInt("idx"),
                                    rs.getString("name"),
                        rs.getString("title"),
                        rs.getString("content"),
                        rs.getString("Wdate"));
            }
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new BoardDto();
    }
}

