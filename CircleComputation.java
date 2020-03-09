/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MinmaxvaVonglap;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class CircleComputation {
    public static void main(String[] args) {
        double radius , diameter , circumference , area;
        Scanner it = new Scanner(System.in);
        
        radius = it.nextDouble();
        diameter = 2.0 * radius;
        circumference = 2.0 * radius * Math.PI;
        area = radius * radius * Math.PI;
        
        System.out.println("radius:" + radius);
        System.out.println("diameter:" + diameter);
        System.out.println("circumference:" + circumference);
        System.out.println("area:" + area);
        it.close();
    }
}
