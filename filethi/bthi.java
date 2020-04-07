package filethi;
import java.sql.*;
import java.util.Scanner;
import java.util.ArrayList;
import filethi.hocsinh;
import filethi.controllor;
public class bthi {
    ArrayList<hocsinh>  list = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int SENTINEL = 0;
        int n;
        System.out.println("HELLO....Welcome dircect school");
        bthi bthi = new bthi();
        bthi.menu();
        n=scanner.nextInt();
        while (n!= SENTINEL){
            if(n==1){
                System.out.println("nhập tên hoc sinh: ");
                String name = scanner.next();
                System.out.println("nhập địa chỉ: ");
                String address = scanner.next();
                System.out.println("nhập số đt:");
                String phone = scanner.next();
                hocsinh hocsinh = new hocsinh(name,address,phone);
                bthi.addhocsinh(hocsinh);

            }
            else if(n==2){
                System.out.println("hồ sơ học sinh");
                bthi.printhocsinh();

            }else if(n==3){
                System.out.println("insert into new book:");
                bthi.inserthocsinh();

            }else if(n==4){

            }else if(n==5){bthi.menu();}
            n = scanner.nextInt();

        }
        System.out.println("Shutting down....");
    }




    public void menu() {
        System.out.println("1 - add student records ");
        System.out.println("2 - Display student records");
        System.out.println("3 - save");
        System.out.println("4 - Exit");
        System.out.println("5.menu");
        controllor.Selecthocsinh();
    }
    public void addhocsinh(hocsinh hocsinh){
        list.add(hocsinh);
    }
    public void printhocsinh(){
        for ( int i = 0; i < list.size();i++){
            hocsinh hs = list.get(i);
            System.out.println(hs.getName());
            System.out.println(hs.getAddress());
            System.out.println(hs.getPhone());
            System.out.println("--.--.--.--.--.--");
        }
    }
    public void inserthocsinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert into  name: ");
        String name;
        name = scanner.nextLine();
        System.out.println("Insert into address ");
        String address;
        address = scanner.nextLine();
        System.out.println("Insert into  phone: ");
        String phone;
        phone= scanner.nextLine();
        hocsinh hocsinh = new hocsinh(name,address,phone);
        controllor.Inserthocsinh(hocsinh);

    }
}
