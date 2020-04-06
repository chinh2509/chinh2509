package MoreJDBC;

import java.sql.*;

public class JdbcPreparedStatementTest {
    public static void main(String[] args) {
        try (
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");

                PreparedStatement pstmt = conn.prepareStatement(
                        "insert into books(bookname,price,qty) values (?, ?, ? )");
                PreparedStatement pstmt1 = conn.prepareStatement(
                        "update books set price = ? where id = ?");
                PreparedStatement pstmt2 = conn.prepareStatement(
                        "delete from books where id = ? ");
        ){
            conn.setAutoCommit(false);
            pstmt.setString(1, " Code ABC");
            pstmt.setDouble(2, 20);
            pstmt.setInt(3,1);
            pstmt.addBatch();

            pstmt1.setDouble(1,100);
            pstmt1.setInt(2,11);
            pstmt1.executeUpdate();

            pstmt2.setInt(1,19);
            pstmt2.executeUpdate();

            int [] returnCodes = pstmt2.executeBatch();
            System.out.println("Return codes are: ");
            for (int code : returnCodes) System.out.println(code + ", ");
            System.out.println();
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
