import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;

public class jdbcEbookStrore1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            //BT1////XÂY DỰNG TÍNH NĂNG XEM SÁCH
            //1
            String strSelect = "select * from books LIMIT 10";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            ResultSet rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("title")+","
                        +rset.getString("author")+","
                        +rset.getDouble("price")+","
                        +rset.getInt("qty")+",");
            }

            //2
            strSelect = "select * from books LIMIT 100";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("top sản phảm bán chạy nhất");
            while(rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("title")+","
                        +rset.getString("author")+","
                        +rset.getDouble("price")+","
                        +rset.getInt("qty")+",");
            }
            //3 tìm sach theo thể loại
            String the_loai;
            System.out.println("nhap the_loai tim kiem:");
            the_loai = scanner.nextLine();
            strSelect = "select * from the_loai where the_loai="+the_loai;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("ten_the_loai")+",");

            }
            //4 tìm sach theo tác giả
            String tac_gia;
            System.out.println("nhap tac_gia tim kiem:");
            tac_gia = scanner.nextLine();
            strSelect = "select * from books where author="+tac_gia;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("id")+","
                        +rset.getString("author")+",");
            }
            //5 xem chi tiết sản phẩm
            int id;
            System.out.println("nhap id sach tim kiem:");
            id = scanner.nextInt();
            strSelect = "select * from don_hang_chi_tiet where id="+id;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("phieu_mua_hang")+","
                        +rset.getInt("sach_id")+","
                        +rset.getInt("kh_id")+","
                        +rset.getInt("tong_tien")+",");

            }



            /// BT2 // XÂY DỰNG TÍNH NĂNG XEM ĐƠN HÀNG

            //1.hiển thị 3 đơn hàng mới nhận
            strSelect = "select * from don_hang_chi_tiet ORDER BY id DESC LIMIT 3";
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            System.out.println("The records selected are: ");
            while(rset.next()){
                System.out.println(rset.getInt("phieu_mua_hang")+","
                        +rset.getInt("sach_id")+","
                        +rset.getInt("kh_id")+","
                        +rset.getInt("tong_tien")+",");

            }

            //2.hiển thị đơn hàng theo mã khách hàng
            System.out.println("============================================================================");
            String strSelect1 = "select * from don_hang WHERE  kh_id = 5";
            System.out.println("The SQL statement is: " + strSelect1 + "\n");

            ResultSet rset1 = stmt.executeQuery(strSelect1);

            System.out.println("The records selected are: ");
            int rowCount1 = 0;
            while (rset1.next()){
                int ma_don = rset1.getInt("ma_don");
                String trang_thai = rset1.getString("trang_thai");
                int kh_id = rset1.getInt("kh_id");
                System.out.println(ma_don + ", " + trang_thai + ", " + kh_id);
                rowCount1++;
            }
            System.out.println("Total number of record = " + rowCount1);

            //3.hiển thị trạng thái đơn hàng theo mã khách hàng
            System.out.println("============================================================================");
            String strSelect2 = "select * from chi_tiet_don_hang WHERE  kh_id = 5";
            System.out.println("The SQL statement is: " + strSelect2 + "\n");

            ResultSet rset2 = stmt.executeQuery(strSelect2);

            System.out.println("The records selected are: ");
            int rowCount2 = 0;
            while (rset1.next()){
                int chi_tiet_don_hang = rset2.getInt("chi_tiet_don_hang");
                String trang_thai = rset2.getString("trang_thai");
                int kh_id = rset1.getInt("kh_id");
                System.out.println(chi_tiet_don_hang + ", " + trang_thai + ", " + kh_id);
                rowCount2++;
            }
            System.out.println("Total number of record = " + rowCount2);

            //4.hiển thị đon hàng theo mã đk nhập
            int id2;
            System.out.println("nhap id don hang tim kiem:");
            id2 = scanner.nextInt();
            strSelect = "select * from don_hang_chi_tiet where id="+id2;
            System.out.println("The SQL statement is: " + strSelect + "\n");
            rset = stmt.executeQuery(strSelect);
            while(rset.next()){
                System.out.println(rset.getInt("phieu_mua_hang")+","
                        +rset.getInt("sach_id")+","
                        +rset.getInt("kh_id")+","
                        +rset.getInt("tong_tien")+",");

            }
        //5.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐANG CHỜ XỬ LÝ
            System.out.println("============================================================================");
            String strSelect4 = "select * from don_hang_chi_tiet WHERE  trang_thai = 'Đang xử lý'";
            System.out.println("The SQL statement is: " + strSelect4 + "\n");
            ResultSet rset4 = stmt.executeQuery(strSelect4);
            System.out.println("The records selected are: ");
            int rowCount4 = 0;
            while (rset4.next()){
                int ma_don = rset4.getInt("ma_don");
                String trang_thai = rset4.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount4++;
            }
            System.out.println("Total number of record = " + rowCount4);
//6.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ ĐÓNG GÓI
            System.out.println("============================================================================");
            String strSelect5 = "select * from don_hang_chi_tiet WHERE  trang_thai = 'Đã đóng gói'";
            System.out.println("The SQL statement is: " + strSelect5 + "\n");
            ResultSet rset5 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount5 = 0;
            while (rset5.next()){
                int ma_don = rset5.getInt("ma_don");
                String trang_thai = rset5.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount5++;
            }
            System.out.println("Total number of record = " + rowCount5);
//7.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GỬI VẬN CHUYỂN
            System.out.println("============================================================================");
            String strSelect6 = "select * from don_hang WHERE  trang_thai = 'Đang giao hàng'";
            System.out.println("The SQL statement is: " + strSelect6 + "\n");
            ResultSet rset6 = stmt.executeQuery(strSelect5);
            System.out.println("The records selected are: ");
            int rowCount6 = 0;
            while (rset6.next()){
                int ma_don = rset6.getInt("ma_don");
                String trang_thai = rset6.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount6++;
            }
            System.out.println("Total number of record = " + rowCount6);
//8.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ GIAO HÀNG THÀNH CÔNG
            System.out.println("============================================================================");
            String strSelect7 = "select * from don_hang_chi_tiet WHERE  trang_thai = 'Hoàn thành'";
            System.out.println("The SQL statement is: " + strSelect7 + "\n");
            ResultSet rset7 = stmt.executeQuery(strSelect7);
            System.out.println("The records selected are: ");
            int rowCount7 = 0;
            while (rset7.next()){
                int ma_don = rset7.getInt("ma_don");
                String trang_thai = rset7.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount7++;
            }
            System.out.println("Total number of record = " + rowCount7);
//9.HIỂN THỊ NHỮNG ĐƠN HÀNG ĐÃ BỊ HỦY
            System.out.println("============================================================================");
            String strSelect9 = "select * from don_hang_chi_tiet WHERE  trang_thai = 'Hủy'";
            System.out.println("The SQL statement is: " + strSelect9 + "\n");
            ResultSet rset9 = stmt.executeQuery(strSelect9);
            System.out.println("The records selected are: ");
            int rowCount9 = 0;
            while (rset9.next()){
                int ma_don = rset9.getInt("ma_don");
                String trang_thai = rset9.getString("trang_thai");

                System.out.println(ma_don + ", " + trang_thai);
                rowCount9++;
            }
            System.out.println("Total number of record = " + rowCount9);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
