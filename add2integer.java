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
public class Add2Integer {
    public static void main(String[] args) {
        int number1 , number2 , sum;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first integer");
        number1 = in.nextInt();
        number2 = in.nextInt();
        
        sum = number1 + number2;
        
        System.out.println("the sum is:" + sum);
        in.close();
    }
}
