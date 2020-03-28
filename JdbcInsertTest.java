import java.sql.*;;
import java.util.Scanner;
public class JdbcInsertTest {
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
            Scanner sc = new Scanner(System.in);
            //delete//
            String sqlDelete = "delete from books where id>8000";
            System.out.println("the sql statement is:"  + sqlDelete + "\n");
            int countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete +" records delete.\n");

            //insert//
            String sqlInsert = "insert into books values"
            +"(8001,'Java core','triệu cao chinh',15.55,15),"
            +"(8002,'Java Advanced','triệu cao chinh',77.77,77)";
            System.out.println("The SQL statement is: "+ sqlInsert +"\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "records inserted.\n");

            //insert a partial recond
            sqlInsert = "Insert into books(id,title,author) value (2001,'java JDBC mySQL','chin')";
            System.out.println("The SQL statement is: "+ sqlInsert +"\n");
            countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + "records inserted.\n");

            //delete id=2001
            sqlDelete = "delete from books where id=2001";
            System.out.println("the sql statement is:"  + sqlDelete + "\n");
            countDelete = stmt.executeUpdate(sqlDelete);
            System.out.println(countDelete +" records delete.\n");

            ////////////////thêm một quyển sách vào
            String namebook;
            int qty;
            double price;
            String datetime;
            int lan_xb;
            String tinh_trang;
            String ma_sach;
            String the_loai;
            System.out.println("nhap_ID:");
            int idbook = sc.nextInt();
            System.out.println("nhạp name:");
            namebook = sc.nextLine();
            System.out.println("nhap Qty:");
            qty = sc.nextInt();
            System.out.println("nhap price:");
            price = sc.nextDouble();
            System.out.println("nhap ngày xuất bản:");
            datetime = sc.nextLine();
            System.out.println("nhap lần xuất bản:");
            lan_xb = sc.nextInt();
            System.out.println("nhap ma sach:");
            ma_sach = sc.nextLine();
            System.out.println("nhap TINH TRANG:");
            tinh_trang = sc.nextLine();
            System.out.println("nhập id thể loại");
            the_loai = sc.nextLine();
            String InsertBook3 = "INSERT INTO sach VALUE (" + idbook +","+"'"+namebook+ "'" + "," + ","+"'"+qty+ "'" + ","+
                    ","+"'"+price+ "'" + "," + ","+"'"+datetime+ "'" + "," +","+"'"+lan_xb+ "'" + "," + ","+"'"+ma_sach+ "'" + ","+
                    ","+"'"+tinh_trang+ "'" + ","+ ","+"'"+the_loai+ "'" + "," +
                    ")";


            System.out.println(InsertBook3);
            int countInsert4 = stmt.executeUpdate(InsertBook3);



            String selectbook = "select * from sach";
            System.out.println("the SQL statement is:" + selectbook);
            ResultSet rset1 = stmt.executeQuery(selectbook);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}






























