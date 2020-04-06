package sql;

import java.sql.*;

public class jdbcSelectTest {
    public static void main(String[] args) {
        try (
                //step1
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        ""
                );
                Statement stmt = conn.createStatement();

                //the format is: jdbc:mysql://hostname:post/databaseName", "username", "password"

                //step2

        ) {
            //steep3
            String strSelect = "select title, price, qty from books";
            System.out.println("the SQL statement is: " + strSelect + "\n");

            ResultSet rset = stmt.executeQuery(strSelect);

            //step4
            System.out.println("the records selestted are");
            int rowCount = 0;
            while (rset.next()){
                String title = rset.getString("title");
                double price = rset.getDouble("price");
                int qty      = rset.getInt("qty");
                System.out.println(title + ", " + price +", " +qty);
                ++rowCount;
            }
            System.out.println("Total number of re cords = " + rowCount);
        }catch(SQLException ex){
            ex.printStackTrace();

        }
    }
}
