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
public class testAuthor {
    public static void main(String[] args) {
        Author author1;
        author1 = new Author("triệu cao chinh","kutysomapc@gmail.com");
        System.out.println(author1.toString());
        System.out.println("name is:" + author1.getName());
        System.out.println("email is:" + author1.getEmail());
        System.out.println("");
    }
}
