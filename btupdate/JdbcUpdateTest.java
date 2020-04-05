package btupdate;

import java.sql.*;

public class JdbcUpdateTest {
    public static void main(String[] args) {
        try (
                //Bước 1: Phân bổ đối tượng 'kết nối' cơ sở dữ liệu
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookshop?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root",
                        "");
                //chỉ dành cho myQuery
                //Bước 2: Phân bổ một đối tượng 'tuyên bố' trong kết nối
                Statement stmt = conn.createStatement();
        ) {
            //Bước 3 & 4: Thực hiện CẬP NHẬT SQL thông qua excuteUpdate
            //trong đó trả về một int cho biết số lượng hàng bị ảnh hưởng
            //Tăng giá 7% và qty thêm 1 cho id = 1001
            String strUpdate = "update books set price  = price *0.7 , qty = qty + 1 where id = 1001";
            System.out.println("the SQL statement is:" + strUpdate + "\n");//echo for debugging
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println(countUpdated + "records affecter.\n");

            //step 3 & 4 :Phát hành SELECT để kiểm tra UPDATE.
            String strSelect = "select * from  books where id = 1001";
            System.out.println("the SQL statement is:" + strSelect + "\n");//echo for debugging
            ResultSet rset = stmt.executeQuery(strSelect);
            while (rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("author")+","
                        +rset.getString("title")+"," +
                        +rset.getDouble("price")+","
                        +rset.getInt("qty")


                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
