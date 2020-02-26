/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Temperature;

/**
 *
 * @author Dell
 */
public class Temperature {
    private final double temp;
    private double k;
    private double F;
    public Temperature(double temp){
        this.temp= temp;
    }

    Temperature() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    public double getPeremeter(){
        return 1.8 * temp + 32;
    }
  
    public  double getArea(){
        return temp + 275.15;
    }

    
}