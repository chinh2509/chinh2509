/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Dell
 */
public class Circle {
    //privint ate instance variable
    private double radius;
    private String color = "red";
    //khởi tạo đối tượng
    public Circle(){
            radius = 5;
            color = "white";
    }
   
    public Circle(double radius){
          this.radius = radius;
          
    } 
    
    public Circle(String color){
          this.color = color;
          
    }
    
    public Circle(double radius, String color){
          this.color = color;
          this.radius = radius;
          
    }
    
    /**
     * LẤY RA BÁN KÍNH
     * @return 
     */
    public double getRadius(){
       return radius;
    }
    /**
     * LẤY RA MÀU SẮC
     * @return 
     */
     public String getColor(){
       return color;
    }
     /**
      *lay ra dien tich
      * @return 
      */
    public double getArea(){ 
       return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", color=" + color + '}';
    }
    
    
}

