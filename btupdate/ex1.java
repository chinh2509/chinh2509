package btupdate;

import java.sql.*;

public class ex1 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price  = price *0.5 where title = 'A cup of Java'";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");

            strUpdate = "update books set qty  = 0  where id=1005";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");




            String strSelect = "select * from  books  ";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("author")+","
                        +rset.getString("title")+"," +
                        +rset.getDouble("price")+","
                        +rset.getInt("qty")
                );}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
