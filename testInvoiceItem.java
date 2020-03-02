/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InvoiceItem;

/**
 *
 * @author Dell
 */
public class testInvoiceItem {
     public static void main(String[] args) {
        InvoiceItem InvoiceItem1;
        InvoiceItem1 = new InvoiceItem("1@123","còn",123,2.13);
        System.out.println(InvoiceItem1.toString());
        System.out.println("id is:" + InvoiceItem1.getId());
        System.out.println("Desc is:" + InvoiceItem1.getDesc());
        System.out.println("qty is:" + InvoiceItem1.getQty());
        System.out.println("unitPrice is:" + InvoiceItem1.getUnitPrice());
        System.out.println( InvoiceItem1.getTotal());
    }
}
