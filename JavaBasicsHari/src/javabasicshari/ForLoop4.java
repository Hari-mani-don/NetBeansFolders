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
public class ForLoop4 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the pyramid to print value: ");
        String Pattern = sc.next();
        System.out.print("Enter the number: ");
        int input = sc.nextInt();
         int plus =input;
         int minus = input;
        for (int row = 1; row <= input; row++) {
            
            for (int col = 1; col <= input*2; col++) {
                  if( col==minus || col==plus ){
                      System.out.print(Pattern);
                      
                  }else{
                      System.out.print(" ");
                  }
            }
            System.out.println();
           plus++;
           minus--;
            
        }
    }
}
