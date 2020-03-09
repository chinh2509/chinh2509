/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authorandbook;

/**
 *
 * @author Dell
 */
public class testBook2 {
    private static Object author1;
   public static void main(String[] args) {  
    Author author = null;
        author1 = new Author("triệu cao chinh","kutysomapc@gmail.com");
        System.out.println(author1.toString());
        
        Book2 book2;
        book2 = new Book2("Tôi tài giỏi bạn cũng thế",author,12.3,4);
        System.out.println(book2.toString());
        book2.setPrice(29.3);
        book2.setQty(29);
        System.out.println("name is:" + book2.getName());
        System.out.println("email is:" +book2.getPrice());
        System.out.println("qty is:" + book2.getQty(23));
        System.out.println("Author is:" + book2.getAuthor());
        
        Book2 anotherBook = new Book2("more java", new Author("triệu cao chinh","kutysomapc@gmail.com"),29,95);
        System.out.println(anotherBook);
}
}
