/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author Dell
 */
public class testproduct {
    public static void main(String[] args) {
        Product sp1 = new Product();
        String name1 = sp1.getname();
        System.out.println(sp1.toString());
        
        
        Product sp2 = new Product(123 ,212, "piano", "casio");
        System.out.println(sp2.toString());
        
        Product sp3 = new Product(123213, 1 + 12,"ukulele","gỗ ép nhật");
        System.out.println(sp3.toString());
        
        Product sp4 = new Product(14.6);
        System.out.println(sp4.toString());
    }
}
