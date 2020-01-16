/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classT1908A;

import person.person;

/**
 *
 * @author Dell
 */
public class T1908A {
    String name = "T1908A";
    int number = 23;
    String color = "white";
    
    public T1908A (){
    System.out.println("lớp:" + name + "sĩ số:" + number +"màu:" + color);
    }
    
    public void say(){
        System.out.println("lop:" + name);
    }
    public void move(){
        System.out.println("lop:" + name);
    }    
    
    public static void main(String[] args) {
     T1908A teacher = new T1908A();
     
     
     

    }
}
