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
public class Point2D {
    private float x;
    private float y;
    public Point2D(float x, float y){
        this.x=0.0f;
        this.y=0.0f;
    }
    public float getX(){
        return x;
    } 
    public void setX(float x){
        this.x=x;
    }
    public float getY(){
        return y;
    } 
    public void setY(float y){
        this.y=y;
    }
    public float[2] getXY(){
        return x;
        return y;
    } 
    public void setXY(float y,float x){
        this.y=y;
        this.x=x;
    }
   @Override
    public String toString() {
        return "Point2D{" + x+ y+'}';
    }
}
