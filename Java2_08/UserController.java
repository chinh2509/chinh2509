package Java2_08;
import java.sql.*;
import java.util.Scanner;
import java.util.SplittableRandom;

public class UserController {
    Scanner sc = new Scanner(System.in);
    //User đăng kí tài khoản
    public void SelectUser(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ){
            String strSelect = "select * from users";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getString("username")+","
                        +rset.getString("password")+","
                        +rset.getString("role")+",");

            }
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void InsertUser(users user){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into users (username,password,role) value ("+"'"+ user.getUsername()+ "', '"  + user.getPassword() + "', "  + user.getRole()  + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
///customer quản lí khách hàng
    public void SelectCustomer(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strSelect = "select * from Customers";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getString("ten_kh")+","
                        +rset.getString("dia_chi")+","
                        +rset.getString("so_dt")+",");

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void InsertCustomer(Customers customers){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into users (ten_kh,dia_chi,so_dt) value ("+"'"+ customers.getTen_kh()+ "', '"  + customers.getDia_chi() + "', "  + customers.getSo_dt()  + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void DeleteCustomer(int kh_id){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlSelect = "select * from don_hang where kh_id = " + "'" + kh_id + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if (rset.next()) {
                System.out.println("Tồn tại trong đơn hàng");
            }else{
                String sqlDelete = "DELETE FROM khach_hang WHERE id = " + kh_id;
                System.out.println("The SQL statement is: " + sqlDelete + "\n");
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void UpdateCustomer(int id, String dia_chi ,String so_dt){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstoreallowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update khach_hang set dia_chi="+"'"+dia_chi +"'"+",sdt_kh =" + "'" + so_dt + "'" +  " where id="+id;
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    ////book thêm xóa sửa theo yêu cầu khách
    public void SelectBook(){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
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

    public void InsertBook(book book){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into books (username,price,qty) value ("+"'"+ book.getName()+ "', '"  + book.getPrice() + "', "  + book.getQty()  + ")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void UpdateBook(int id,double price,int qty ){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String strUpdate = "update books set price="+"'"+price +"'"+",qty="+"'"+qty +"'"+"where id="+id;
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void DeleteBook(int id){
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            String sqlDelete = "DELETE FROM books WHERE id = " + id;
            System.out.println("The SQL statement is: " + sqlDelete + "\n");
            int countDeleted = stmt.executeUpdate(sqlDelete);
            System.out.println(countDeleted + " records deleted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
























