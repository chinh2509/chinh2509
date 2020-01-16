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
public class Product {
    private int id = 4;
    private String name="đòng hồ";
    private double price=21.1;
    private int pty = 120;
    private String description;
    
    public Product(){
            id = 1;
            name = "đàn guitar";
            description = "đẹp zai";
            pty =17; 
            
    }
    
    public Product(double price){
          this.price = price;
         
    }
    
    public Product(int id ,double price , String name , String description){
          this.name = name;
          this.id = id;
          this.description = description;
    }
  
    
    public String getname(){
       return name;
    }
    
    public double getprice(){
       return price;     
    }
    
    public double getpty(){
       return pty; 
    }
    
    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", pty=" + pty + ", description=" + description + '}';
    }
   
}
