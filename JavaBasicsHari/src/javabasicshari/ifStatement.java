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
public class ifStatement {
    public static void main(String Hari[]){
          Scanner sc = new Scanner(System.in);   
         
         System.out.print("Enter the row: ");
         int i =sc.nextInt();
         System.out.print("Enter the coloum: ");
         int j =sc.nextInt();
         
         int plus = i +j;
         for(int row =0;row<i*j;row++){
             if(row % j ==0){
                 System.out.println();
             }
             
             if( (plus+row) <10 ){
              System.out.printf("%-5d",plus);
            }else if(plus *row < 10){
                  System.out.printf("%-5d",plus);
            }else if(plus % 2 ==0){
                  System.out.printf("%-5d",plus);
            }else if(plus % 3==0){
                  System.out.printf("%-5d",plus);
            }else{
                 System.out.printf("%-5d",row);
            }
           plus++;
            
         }
          
          }
    
    
    }

