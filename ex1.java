package java2_04;

import java.sql.*;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            //1:hiển thị danh sách sản phẩm
            String strSelect = "select * from products";
            System.out.println("the SQL statement is:" + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("ProductID")+","
                        +rset.getString("ProductName")+","
                        +rset.getInt("SupplierID")+"," +
                        +rset.getDouble("UnitPrice")+","
                        +rset.getInt("UnitsInStock")
                );}

            //2.hiển thị danh sách khách hàng theo tên
            System.out.println("=========================================================================================");
            String name;
            System.out.println("nhap tên tác giả cần tim kiem:");
            name = scanner.nextLine();
            strSelect = "select * from products where ProductName="+name;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("ProductID")+","
                        +rset.getString("ProductName")+","
                        +rset.getInt("SupplierID")+"," +
                        +rset.getDouble("UnitPrice")+","
                        +rset.getInt("UnitsInStock"));
            }

            //3.hiển thị danh sách khach hàng
            System.out.println("=========================================================================================");
            strSelect = "select * from products where ProductName";
            System.out.println("the SQL statement is:" + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("ProductID")+","
                        +rset.getString("ProductName")+","
                        +rset.getInt("SupplierID")+"," +
                        +rset.getDouble("UnitPrice")+","
                        +rset.getInt("UnitsInStock")
                );}

            //4.tìm sản phầm theo giá bán mà người dùng nhập vào
            System.out.println("=========================================================================================");

            String strSelect3 = "select * from products WHERE UnitPrice BETWEEN 10 AND 20 ";
            System.out.println("4.The SQL statement is: " + strSelect3 + "\n");

            ResultSet rset3 = stmt.executeQuery(strSelect3);

            System.out.println("The records selected are: ");
            int rowCount3 = 0;
            while (rset3.next()){
                String ProductName = rset3.getString("ProductName");
                double UnitPrice = rset3.getDouble("UnitPrice");
                System.out.println(ProductName + ", " + UnitPrice);
                rowCount3++;
            }
            System.out.println("Total number of record = " + rowCount3);

            //5.Hiển thị thông tin chi tiết của một đơn hàng
            System.out.println("=========================================================================================");

            strSelect = "select * from products where id=1";
            System.out.println("the SQL statement is:" + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("ProductID")+","
                        +rset.getString("ProductName")+","
                        +rset.getInt("SupplierID")+"," +
                        +rset.getDouble("UnitPrice")+","
                        +rset.getInt("UnitsInStock")
                );}
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
