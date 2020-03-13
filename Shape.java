/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP8;

/**
 *
 * @author Dell
 */
public class Shape {
    private String color;
    private boolean filled;
    public Shape(String color,boolean filled){
        this.color="red";
        this.filled=true; 
    }
    public String getColor(){
        return color;
    }    
    public void setColor(String color){
        this.color=color;
    } 
    public boolean isFilled(boolean filled){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    } 
    @Override
    public String toString() {
        return "Shape{"+"color" + color+ "fiiled"+ true+'}';
    }
}
