/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangle;

/**
 *
 * @author User
 */
public class test_Rectangle {
    public static void main(String[] args){
        
        
        Rectangle r1;        
        r1 = new Rectangle(4,5);
        System.out.println("Area" + r1.getArea());
        System.out.println("Peremeter" + r1.getPeremeter());
        r1.display();
        
      
    }
}
