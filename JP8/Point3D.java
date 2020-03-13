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
public class Point3D extends Point2D{
    private float z;
    public Point3D(float x, float y) {
        super(x, y);
        this.z=z;
    }

    public float getZ(){
        return z;
    } 
    public void setZ(float z){
        this.z=z;
    }
     @Override
    public String toString() {
        return "Point3D{" + z +'}';
    }
}
