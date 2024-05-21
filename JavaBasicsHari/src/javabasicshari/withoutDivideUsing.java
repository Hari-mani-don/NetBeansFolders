/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

/**
 *
 * @author harimani
 */
public class withoutDivideUsing {
    public static void main(String argsp[]){
        
        PlusTwoDegrees();
       
    }
    static void withoutDivide(){
        //widthout divide
        int a=10;
        int b=4;
        int count=0;
        for(int i =0;b<=a;i++){
             if(a>=b){
               a-=b;
               count++;//1,2,3,4,5
         }
             
        }
        System.out.println(count);
    }
  static void  PlusTwoDegrees(){
        int a =10;
        int b = a;
        for(int i =a+1;i>0;i--){
            if(i>a){
                System.out.println(a);
                System.out.println(i);
            }else{
               
                System.out.println(b);
                 b-=1;
            }
    }
  }
}
