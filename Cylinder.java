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
public class Cylinder extends Circle1{
    private double height;
    public Cylinder(){
        super();
        this.height=1.0;
        System.out.println("construced a Circle with Circle()");
    
    }
    public Cylinder(double height){
        super();
        this.height = height;
        System.out.println("construced a Circle with Circle(height)");
    
    }
    public Cylinder(double radius , double height){
        super(radius);
        this.height=height; 
        System.out.println("construced a Circle with Circle(radius,height)");
    
    }
    public Cylinder(double radius , String color){
        super(radius,color);
        this.height=height;
        System.out.println("construced a Circle with Circle(height,radius,color)");
    
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(){
        this.height = height;
    }
    public String toString(){
        return "this is a Cylinder";
    }
}
