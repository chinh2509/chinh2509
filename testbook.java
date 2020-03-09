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
public class testBook {
    public static void main(String[] args) {
        Author author;
        author = new Author("triệu cao chinh","kutysomapc@gmail.com");
        System.out.println(author.toString());
        
        Book book;
        book = new Book("Tôi tài giỏi bạn cũng thế",author,12.3,4);
        System.out.println(book.toString());
        book.setPrice(29.3);
        book.setQty(29);
        System.out.println("name is:" + book.getName());
        System.out.println("email is:" +book.getPrice());
        System.out.println("qty is:" + book.getQty(23));
        System.out.println("Author is:" + book.getAuthor());
        System.out.println("Author name is:" + book.getAuthor().getName());
        System.out.println("Author email is:" + book.getAuthor().getEmail());
        
        Book anotherBook = new Book("more java", new Author("triệu cao chinh","kutysomapc@gmail.com"),29,95);
        System.out.println(anotherBook);
    } 
}
