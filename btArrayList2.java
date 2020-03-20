import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class btArrayList2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntegers = initArray(5);
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("element"+i+"type value was"+ myIntegers[i]);

        }
        System.out.println("the aveger is "+ getAverage(myIntegers));
        for(int i=myIntegers.length-1;i>=0;i--){
            System.out.println("element"+i+"type value was"+ myIntegers[i]);
        }
    }
    public static int[] initArray(int size){
        System.out.println("enter"+ size);
        int[] values = new int[size];
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;

    }
    public static double getAverage(int[] array){
        int sum =0;
        for(int i =0;i<array.length;i++){
            sum =+array[i];
            return (double)sum / (double)array.length;
        }
        return (double)sum / (double)array.length;
}}
