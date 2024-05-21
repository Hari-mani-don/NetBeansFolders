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
public class PrimeNumber {
    public static void main(String args[]){
       Scanner sc = new Scanner (System.in);
       
        System.out.print("Enter the number to pring prime number List: ");
       int prime = sc.nextInt();
       int count=0;
       for(int i =2;i<=prime;i++){
           
           for(int j = 2;j<i;j++){
               if(i%j==0){
                   count++;
                   break;
//                   System.out.println(j);
               }
           }
            if(count==0){
              System.out.println(i);
           }
          count=0;  
       }
      
    }
}
