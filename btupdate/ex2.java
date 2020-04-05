package btupdate;

import java.sql.*;

public class ex2 {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
         //1
            String strUpdate = "update categoryes set CategoriName = 'SeafoodVN' WHERE CategoriID = 8";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");

            String strSelect = "select * from  categoryes where  CategoriID=8";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("CategoriName")+","

                );}
            //2
            strUpdate = "update customers set Address = '1A YET KIEU_HANOI',  where CustomerID = 'FRANK';";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");
            strSelect = "select * from  customers where CustomerID = 'FRANK' ";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getString("Address")+","

                );}


            //3
            strUpdate = "update products set CategoriID = CategoriID *0.1,  where ProductID = 11,12,16,17,18,19,20,21";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");
            strSelect = "select * from  products where ProductID = 11,12,16,17,18,19,20,21";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("CategoriID")+","
                );}

            //4
            strUpdate = "update orders set ShipVia = 3,  where OrderID = 10313";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");
            strSelect = "select * from  orders where OrderID = 10313";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("OrderID")+","
                );}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
