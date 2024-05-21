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
public class unary {
     int max(int a, int b, int c){
        
        int num = a>b && a>c?a:b>a && b>c? b:c;
        return num;
    }
    public static void main(String argsp[]){
       
       
        int b =100;
        int c =30;
        unary u = new unary();
        u.alphaNumeric();
        
        
//      System.out.println("Maximum number is: "+ u.max(a, b, c));
     
    }
    
  void  alphaNumeric(){
        int a = 1;
//        char a = 'b';
        
        System.out.println((a>='a' && a<='z') || ( a>='A' && a<='Z')?"is character":"is number" );
     
        
    }
   
}
