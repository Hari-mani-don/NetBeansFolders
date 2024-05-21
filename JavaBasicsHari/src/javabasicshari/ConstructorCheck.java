/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

/**
 *
 * @author harimani
 */
public class ConstructorCheck {
    public static void main(String args[]){
        consgtructor con = new consgtructor();
    }
}
class cons{
    cons(int a){
         System.out.println("done");
    }
     cons(){
         
     }
}
class consgtructor extends cons {
    consgtructor(){
      
        super(2);
        System.out.println("hair");
    }
   
}