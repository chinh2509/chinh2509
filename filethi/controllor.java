package filethi;
import filethi.hocsinh;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class controllor {
    ArrayList<hocsinh> list = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public static void Inserthocsinh(hocsinh hocsinh){
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sinh_vien?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            String sqlInsert = "insert into books values (" + hocsinh.getName() + ", '" + hocsinh.getAddress() + "', "  + hocsinh.getPhone() +")";
            System.out.println("The SQL statement is: " + sqlInsert + "\n");
            int countInserted = stmt.executeUpdate(sqlInsert);
            System.out.println(countInserted + " records inserted.\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void Selecthocsinh(){
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sinh_vien?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root",
                "");
             Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("select * from hoc_sinh");

            ResultSetMetaData rsetMD = rset.getMetaData();

            int numColumns = rsetMD.getColumnCount();

            for(int i=1; i<= numColumns;++i){
                System.out.printf("%-30s",rsetMD.getColumnName(i));
            }
            System.out.println();
            //
            for(int i=1; i<= numColumns;++i){
                System.out.printf("%-30s",
                        "(" + rsetMD.getColumnClassName(i)+ ")");
            }
            System.out.println();
            //
            while (rset.next()){
                for(int i=1; i<= numColumns;++i){
                    //
                    System.out.printf("%-30s",rset.getString(i));
                }
                System.out.println();
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
