/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Dell
 */
public class Car {
    private int plateNumber =7;
    private final String xlocation = "mec";
    private final String ylocation = "audi"; 
    private String speed = "200km/h";

public Car(){
        System.out.println("con số trung tâm" + plateNumber +"xyz" + ylocation + "tốc độ " + speed);
}
public void move(){  System.out.println("con số trung tâm" + plateNumber);}
public void pack(){  System.out.println("xyz" + ylocation );}
public void accelerate(){  System.out.println("tốc độ " + speed);}

}