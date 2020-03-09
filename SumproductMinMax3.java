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
public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3 ,number4, number5;
        int sum , product , min , max;
        
        Scanner number = new Scanner(System.in);
        System.out.println("Enter first integer");
        number1 = number.nextInt();
        number2 = number.nextInt();
        number3 = number.nextInt();
        number4 = number.nextInt();
        number5 = number.nextInt();

        sum = number1 + number2 + number3 + number4 + number5;
        System.out.println("sum:" + sum);
        product = number1 * number2 * number3*number4*number5;
        System.out.println("product:" + product);
        
        
    min= number1;
    if(number2 < min ){min = number2;
    System.out.println("min:" + number2);
    }
    if(number3 < min ){min = number3;System.out.println("min:" + number3);}
    
    if(number4 < min ){min = number4;System.out.println("min:" + number4);}
    
    if(number5 < min ){min = number5;System.out.println("min:" + number5);}
    
    
    max= number1;
    if(number2 > max ){max = number2;
    System.out.println("max:" + number2);
    }
    if(number3 > max ){max = number3;System.out.println("max:" + number3);}
    
    if(number4 > max ){max = number4;System.out.println("max:" + number4);}
    
    if(number5 > max ){max = number5;System.out.println("max:" + number5);}
    }
    
}
