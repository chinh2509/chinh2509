package MoreJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCommitCatchTest {
    public static void main(String[] args) throws SQLException {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:8888/ebookshop","root","");
             Statement stmt = conn.createStatement();
        ){
            try {
                //vô hiệu hóa cam kết tự động
                conn.setAutoCommit(false);

                //Insue two INSERT satements
                stmt.executeUpdate("insert into books value (4001,'Plau chan','Majong 101',4.4,4)");
                //Sao chép khóa chính, kích hoạt nhận thức SQLException
                stmt.executeUpdate("insert into books value (4001,'Plau chan','Majong 101',4.4,4)");
                conn.commit();
            }
            catch (SQLException ex){
                System.out.println("--Rolling back change --");
                conn.rollback();
                ex.printStackTrace();
            }
        }
    }
}
