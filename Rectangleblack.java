/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP8;

/**
 *
 * @author Dell
 */
public class Rectangleblack extends Shape{
    private double width;
    private double length;
    public Rectangleblack(String color, boolean filled,double width,double length) {
        super(color, filled);
        this.length=1.0;
        this.width=1.0;
    }
    public double getHeight(){
       return length;
    }
   
 
    
    public double getWidth(){
       return width;
    }
    public double getArea(){
        return width * length;
    }
    
    public double getPeremeter(){
        return  (width + length) * 2;
    }
     @Override
    public String toString() {
        return "rectangle" + "width=" + width +"heigh"+length+'}';
    }
}
