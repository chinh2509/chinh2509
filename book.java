/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authorandbook;

import static javax.management.Query.or;

/**
 *
 * @author Dell
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int qty;
    
    public Book(String name,Author author,double price,int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = 0;
    }

    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return author;
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
        
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + ",qty="+ qty +'}';
    }
            
}
