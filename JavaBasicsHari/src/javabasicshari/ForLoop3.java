/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

import java.util.Scanner;

/**
 *
 * @author harimani
 */
public class ForLoop3 {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);   
         
         System.out.print("Enter the pyramid to print value: ");
         String Pattern = sc.next();
         System.out.print("Enter the number: ");
         int i =sc.nextInt();
         
         
         for(int row =1;row<=5;row++){
            for(int col=1;col<=5;col++){
       if(col == row || col>row){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }
               
            }  
            System.out.println();
             
         }
         
         
    }
}
