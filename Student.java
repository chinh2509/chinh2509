/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author Dell
 */
public class Student {
    private String name;
    private int gpa ;
    
    public Student (String name){
         this.name= "đặng kim thi";
    }
    public Student (int gpa){
         this.gpa=gpa;
    }
    
    
    public String getname(){
       return name;
    }
    public int setgpa(){
       return gpa;
    }
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", gpa=" + gpa + '}';
    }
}
