/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Authorandbook;

import static java.lang.Character.UnicodeBlock.of;

/**
 *
 * @author Dell
 */
public class Author {
    private String name;
    private String email;
    private char gender = 'f';
    public Author(String name,String email){
    this.gender = 'm';
    this.name= name;
    this.email= email;
    }
    public Author(char gender){
    this.gender= 'm';
    }
    public String getName(){
    return name;
    }
    public String getEmail(){
    return email;
    } 
    public void setEmail(String email){
    this.email=email;
    }
    public char getGender(){
    return gender;
    }
    @Override
    public String toString(){
        
        return "Author{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }

    private static class or {

        public or() {
        }
    }
}
