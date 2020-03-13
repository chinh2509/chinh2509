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
public class Circleblack extends Shape{
    private double  radius; 
    public Circleblack(double  radius,String color, boolean filled) {
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius(){
        return radius;
    } 
    public void setRadius(double radius){
        this.radius= radius;
    }
    public double getArea(){ 
       return radius * radius * Math.PI;
    }
    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
}
