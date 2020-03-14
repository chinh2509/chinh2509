/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thijava;

/**
 *
 * @author Dell
 */
public class EmployeeFullTime extends SalaryPolicy{
    private double rate;
    public EmployeeFullTime(float baseSalary,double rate) {
        super(baseSalary);
        this.rate=4;
    }
    public double getSalary(){
        return rate * super.baseSalary;
    } 
    @Override
    public String toString(){
        return "SalaryPolicy{" + "Salary:"+'}';
    }
}
