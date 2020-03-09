/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authorandbook;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Book2 {
     private String name;
    private Author[] authors;
    private double price;
    private int qty;
    
    public Book2(String name,Author[] authors,double price,int qty){
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;
    }

    Book2(String tôi_tài_giỏi_bạn_cũng_thế, Author author, double d, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String getName(){
        return name;
    }
    public Author[] getAuthor(){
        return authors;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    
    public int getQty(int qty){
        return qty;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    @Override
    public String toString(){
        return "Book2{" + "name=" + name + ", author=" + Arrays.toString(authors) + ", price=" + price + ",qty="+ qty +'}';
    }
}
