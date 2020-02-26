/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;


/**
 *
 * @author Dell
 */
public class testTemperature {
    public static void main(String[] args) {
        Temperature r1;        
            r1 = new Temperature (35);
        System.out.println("Area" + r1.getArea());
        System.out.println("Peremeter" + r1.getPeremeter()); 
    }
}