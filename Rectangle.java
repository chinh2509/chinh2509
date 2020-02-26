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
public class Rectangle {
    private int width;
    private final int height;
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
         System.out.println("width " + width + " height " + height);
    }

    Rectangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
    public int getHeight(){
       return this.height;
    }
   
 
    
    public double getWidth(){
       return this.width;
    }
   
    public void setWidth(int rectangular){
       this.width = rectangular;
    }
    
    public double getArea(){
        return width * height;
    }
    
    public double getPeremeter(){
        return  (width + height) * 2;
    }
    public void display(){
        for(int i=1;i<= width;i++){
            for(int j=1;j<=height;j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    
}
