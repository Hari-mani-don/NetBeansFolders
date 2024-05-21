/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerank;

import java.util.Scanner;

/**
 *
 * @author harimani
 */
public class ForLoop {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        //prime number series
        System.out.println("Enter the numbert: "); 
        int number =scanner.nextInt();
        
        for(int i =2; i<=number/2;i++){
           
            if(i%2==0){
                System.out.println("is not a prime number");
                break;
            }else{
               System.out.println("is a prime number");
               break;
           }
        }
    }
}
