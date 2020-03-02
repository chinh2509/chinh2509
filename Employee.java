/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Dell
 */
public class Employee {
    private int id;
    private String lastname;
    private String firstname;
    private int salary;
    public Employee(int id,int sarary){
        this.id=id;
        this.salary=sarary;            
}
    public Employee(String lastname,String firstname){
        this.firstname="chinh";
        this.lastname="triệu cao";             
}
    public int getId(int id){
        return id;
    }
    public String getFistname(){
        return firstname;
    }
    public String getLastname(){
        return lastname;
    }
    public String getName(String name){
        return name = firstname + lastname;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public double AnnualSalary(){
        return Math.PI * salary*12;
    }
    public int raiceSalary(int percent){
       return percent;
    }
    @Override
    public String toString(){
        
        return "Employee{" + "id=" + id + ", name=" + firstname + lastname + ", salary=" + salary + '}';
    }
}
