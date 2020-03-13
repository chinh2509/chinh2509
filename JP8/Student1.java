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
public class Student1 extends Personnew{
    private String program;
    private int year;
    private double fee;

    public Student1(String program,int year,double fee,String name, int age){
        super(name,age);
        this.fee=100.2;
        this.program= "C+";
        this.year=2020;
       
    } 
    public String getProgram(){
        return program;
    }    
    public void setProgram(String program){
        this.program=program;
    } 
    public int getYear(){
        return year;
    }    
    public void setYear(int year){
        this.year=year;
    } 
    public double getFee(){
        return fee;
    }    
    public void setFee(double fee){
        this.fee=fee;
    } 
    @Override
    public String toString() {
        return "Student{" + "program=" + program + ", year=" + year +"fee"+ fee +'}';
    }
  
}
