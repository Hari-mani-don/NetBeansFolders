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
public class ForLoop2 {
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);   
         
         System.out.print("Enter the row: ");
         int i =sc.nextInt();
         System.out.print("Enter the coloum: ");
         int j =sc.nextInt();
         
        int val =1;
        int temp = j;
         for(int row =1;row<=i;row++){
            for(int col =1;col<=j;col++){
                if(row==col || temp == col){
                    System.out.print(val);
                    
                }else{
                    System.out.printf(" ");
                }
                val++;
               
            }  
            System.out.println();
             temp--;
         }
        
    }
}
