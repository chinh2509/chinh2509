/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

/**
 *
 * @author Dell
 */
public class Account {
    private String id;
    private String name;
    private int balance;
    
    public Account(String id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(int balance){
        this.balance = 0;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getBalance(){
        return balance;
    }
    public int setCredit(int amount){
        return balance = balance + amount;
    }
    public int Debit(int amount){
        if(amount <=balance){
        System.out.println("the remaining amount:" + balance);
        return balance =balance - amount;
        }
        else{
            System.out.println("the excceded balance");
        }
        return balance;
    }
    public int transfeTo(Account another,int amount){
        if(amount <=balance){
       
        }else{}
    }
}
