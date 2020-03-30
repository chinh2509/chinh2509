
package giftcontroller;
import giftmodel.Gift;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GiftController {
    ArrayList<Gift> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    public void selectBook(){
        try (Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
        Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from books";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
         while(rset.next()){
             System.out.println(rset.getInt("id")+","
             +rset.getString("title")+","
             +rset.getString("author")+","
             +rset.getDouble("price")+","
             +rset.getInt("qty")+",");
         }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void InsertGift(Gift gift){
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into books values (" + gift.getId() + ", '" + gift.getName() + "', "  + gift.getPrice() + ", "  + gift.getQty()+")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    public void DeleteGift(int id){
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            //delete//

            String sqlDelete = "delete from books where id="+id;
            System.out.println("the sql statement is:"  + sqlDelete + "\n");
            int countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete +" records delete.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
















