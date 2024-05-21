/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

/**
 *
 * @author harimani
 */
public class Pattern {
    public static void main(String args[]){
        
        for(int row =0;row<2*5-1;row++){
            for(int col =1;col<5;col++){
                int condition = row<5? 5:5-row+1;
                if(col<condition-row){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
