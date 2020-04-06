package Java2_08;
import java.sql.*;
import java.util.Scanner;
public class UserView {
    final int SENTINEL = 0;
    int n;
    Scanner sc = new Scanner(System.in);
    UserController uc = new UserController();

    public static void main(String[] args) {
        UserView views = new UserView();
        views.UsersView();
    }

    private void UsersView() {
        System.out.println("đăng nhập or đăng kí");
        UserView views = new UserView();
        views.menu();
        n = sc.nextInt();
        while (n != SENTINEL) {
            switch (n) {
                case 1:
                    views.menuSignUp();
                    break;
                case 2:
                    views.menuSignIn();
                    return;
            }
            views.menu();
            n = sc.nextInt();
        }
        System.out.println("Bye....See you again!");
    }











//menu all
    public void menu(){
        System.out.println("===================================================");
        System.out.println("0.Out....");
        System.out.println("1.Sign Up");
        System.out.println("2.Sign In");
    }
    //LogAccount
    public void menuLogIn(){
        System.out.println("1.Quản lí sản phẩm");
        System.out.println("2.Quản lí khách hàng");
    }

    //Books
    public void menuBook(){
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Sửa sản phẩm");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Hiển thị sản phẩm");
    }
    //menuSignUP
    public void menuSignUp(){
        System.out.println("nhập tên tài khoản");
        String username = sc.next();
        System.out.println("nhập password");
        String password = sc.next();
        System.out.println("nhập vai trò role");
        String role = sc.next();
        users users = new users(username, password,role);
        uc.InsertUser(users);
        uc.SelectUser();
    }
    //menuSignIn
    public void menuSignIn(){
        UserView view = new UserView();
        try (
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/ebookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "root", "");
                Statement stmt = conn.createStatement();
        ) {
            System.out.println("nhập tên tài khoản");
            String user = sc.next();
            System.out.println("nhập password");
            String pass = sc.next();
            String sqlSelect = "select * from users where username = " + "'" + user + "'" + "and password = " + "'" + pass + "'";
            ResultSet rset = stmt.executeQuery(sqlSelect);
            if(rset.next()){
                System.out.println("đăng nhập thành công");
                view.menuLogIn();
                n = sc.nextInt();
                while(n!= SENTINEL){
                    switch (n){
                        case 1:
                            view.dsBook();
                        case 2:view.dsCustomer();
                    }
                    view.menuLogIn();
                    n = sc.nextInt();
                }
            }else {
                System.out.println("đăng nhập thất bại bạn kiểm tra lại tài khoản mật khẩu");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void dsBook(){
        UserView views = new UserView();
        views.dsCustomer();
        int y;
        y = sc.nextInt();
    while (y != SENTINEL){
        switch (y){
            case 1:
                views.addBook();
                break;
            case 2:
                views.updateBook();
                break;
            case 3: views.deleteBook();
                break;
            case 4: uc.SelectBook();
                break;
        }
    }
    }

    public void dsCustomer(){
        UserView views = new UserView();
        views.dsCustomer();
        int y;
        y = sc.nextInt();
        while (y != SENTINEL){
            switch (y){
                case 1:
                    views.addCustomer();
                    break;
                case 2:
                    views.updateCustomer();
                    break;
                case 3:
                    views.deleteCustomer();
                    break;
                case 4 :
                    uc.SelectCustomer();
                    break;
            }
        }
    }
    public void menuCustomer(){
        System.out.println("0.Quay lại");
        System.out.println("1.Thêm khách hàng");
        System.out.println("2.Sửa khách hàng");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Hiển thị khách hàng");
    }
    public void addCustomer(){
        System.out.println("Enter name: ");
        String ten_kh = sc.nextLine();
       ten_kh = sc.nextLine();
        System.out.println("Enter address: ");
        String dia_chi = sc.nextLine();
        dia_chi = sc.nextLine();
        System.out.println("Enter phone: ");
        String so_dt = sc.next();
        Customers ct = new Customers(ten_kh,dia_chi,so_dt);
        uc.InsertCustomer(ct);
    }
    public void updateCustomer(){
        System.out.println("nhập id");
        int id = sc.nextInt();
        System.out.println("nhâp address");
        String dia_chi = sc.nextLine();
        dia_chi = sc.nextLine();
        System.out.println("Enter phone: ");
        String so_dt = sc.next();
        uc.UpdateCustomer(id,dia_chi,so_dt);
    }
    public void deleteCustomer(){
        System.out.println("nhập id_kh cần xóa");
        int id= sc.nextInt();
        uc.DeleteCustomer(id);
    }
    public void addBook(){
        System.out.println("Enter name: ");
        String bookname = sc.nextLine();
        bookname = sc.nextLine();
        System.out.println("Enter price: ");
        double price = sc.nextDouble();
        System.out.println("Enter qty: ");
        int qty = sc.nextInt();
        book book = new book(bookname, price, qty);
        uc.InsertBook(book);
    }
    public void updateBook(){
        System.out.println("nhập id");
        int id = sc.nextInt();
        System.out.println("nhâp price");
        double price = sc.nextDouble();
        System.out.println("Enter qty: ");
        int qty = sc.nextInt();
        uc.UpdateBook(id,price,qty);
    }
    public void deleteBook(){
        System.out.println("nhập id sách cần xóa");
        int id = sc.nextInt();
        uc.DeleteBook(id);
    }
}
