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
public class Staff extends Personnew{
    private String school;
    private double pay;
    public Staff(String school,double pay,String name, int age) {
        super(name, age);
        this.school=school;
        this.pay=pay;
    }
    public String getSchool(){
        return school;
    }    
    public void setSchool(String school){
        this.school=school;
    } 
    
    public double getPay(){
        return pay;
    }    
    public void setProgram(double pay){
        this.pay=pay;
    }
    @Override
    public String toString() {
        return "Staff{" + "school=" + school + ", pay=" + pay +'}';
    }
}
