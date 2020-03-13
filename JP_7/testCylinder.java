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
public class testCylinder {
    public static void main(String[] args) {
        Cylinder C1 = new Cylinder();
        System.out.println("radius is:" + C1.getRadius()
        +"Height is"+C1.getHeight()+",color is:"+C1.getColor()+
        ",baes aren is:"+C1.getArea()
        );
        Cylinder C2 = new Cylinder(5.0,2.0);
        System.out.println("radius is:" + C2.getRadius()
        +"Height is"+C2.getHeight()+",color is:"+C2.getColor()+
        ",baes aren is:"+C2.getArea());
    }
}
