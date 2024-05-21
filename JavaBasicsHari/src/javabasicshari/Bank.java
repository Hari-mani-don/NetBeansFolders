/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author harimani
 */
public class Bank implements Account{
    static double Balance;
    static int option;
  public void deposit(double amount){
      if(amount>0){
           Balance +=amount;
           System.out.println("Deposite Successfully");
       }
       else{
           System.out.println("Please re-enter amount");
       }
       
        
    }
   public void withdraw(double amount){
       if(amount<=Balance){
           Balance-=amount;
           System.out.println("\nWithdraw Successfully");
       }
       else{
           System.out.println("Insufficient Balance");
       }
       
        
    }
   
  static void scanning(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Please Select the option : ");
       System.out.println("\t1.Deposit");
       System.out.println("\t2.Withdraw");
       System.out.println("\t3.Total Balnce");
       System.out.println("\t4.Exit");
       System.out.print("\nEnter your optioin: ");
       option  = sc.nextInt();
   }
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        double amount;
        while(true){
            scanning();
            if(option ==4){
                break;
            }
        switch(option){
           case 1:
               System.out.print("\nEnter deposite amount: ");
                amount = sc.nextDouble();
                bank.deposit(amount);
                
               break;
           case 2 :
                System.out.print("\nEnter Withdraw amount: ");
                amount = sc.nextDouble();
                bank.withdraw(amount);
                
               break;
               
           case 3:
               System.out.println("\nTotal : "+Balance);
               break;
           case 4:
               break;
       }
       
   }
      
      
       
    
   }
}
interface Account{
    void deposit(double amount);
    void withdraw(double amount);
}

