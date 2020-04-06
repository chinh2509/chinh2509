package MoreJDBC;

import java.sql.*;

public class a {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        )  {
            conn.setAutoCommit(false);
            //befoce changes
            ResultSet rset =  stmt.executeQuery("select id,qty from books where id in (1001,1002)");
            System.out.println("before UPDATE --");
            while (rset.next()){
                System.out.println(rset.getInt("id")+","+rset.getInt("qty"));
            }
            conn.commit();//commit select

            //issue two update statements thru executeUpdate()
            stmt.executeUpdate("update books set qty + 1 where id =1001");
            stmt.executeUpdate("update books set qty + 1 where id =1002");
            conn.commit();//commit update


            rset = stmt.executeQuery("select  id,qty from books where id in (1001,1002)");
            System.out.println("==after UPDATE and  Commit--");
            while (rset.next()){
                System.out.println(rset.getInt("id")+","+rset.getInt("qty"));
            }
            conn.commit(); //commit select


            //issue two update statements thru executeUpdate()
            stmt.executeUpdate("update  books set qty = qty - 99 where id = 1001");
            stmt.executeUpdate("update  books set qty = qty - 99 where id = 1002");
            conn.rollback();//discard all changes since the last commit

            rset = stmt.executeQuery("select  id,qty from books where id in (1001,1002)");
            System.out.println("--After UPDATE  and ROLLBACK--");
            while (rset.next()){
                System.out.println(rset.getInt("id")+ ","+ rset.getInt("qty"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
