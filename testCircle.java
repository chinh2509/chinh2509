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
public class testcircle {
    public static void main(String[] args) {
            Circle c1 = new Circle();
            String color1 = c1.getColor();
            System.out.println(c1.toString());
           
            
            Circle c2 = new Circle("green");
            System.out.println(c2.toString());
            
            Circle c3 = new Circle(1.2);
            System.out.println(c3.toString());
            
            Circle c4 = new Circle(19.4);
            System.out.println(c4.toString());
    }
}
