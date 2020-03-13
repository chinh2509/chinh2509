/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_7;

/**
 *
 * @author Dell
 */
public class Circle1 {
    //privint ate instance variable
    private double radius;
    private String color;
    //khởi tạo đối tượng
    public Circle1(){
            radius = 0.1;
            color = "white";
            System.out.println("construced a Circle with Circle(radius , color)");
    }
   
    public Circle1(double radius){
          this.radius = radius;
          
    } 
    
    public Circle1(String color){
          this.color = color;
          
    }
    
    public Circle1(double radius, String color){
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

