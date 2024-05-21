
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harimani
 */
public class ForLoop {
  
    public static void main(String argsp[]){
        
//        for(int a=2;a<=50 ;a=a+2){
//            System.out.println("iterate:"+a);
//        }
//        
//        for(int a=60;a>1;a-=3){
//            System.out.println("divided of 3:"+a);
//        }
        Scanner scanner = new Scanner(System.in);
        
        //input get from user
//        System.out.println("please enter the value :");
//        int value = scanner.nextInt() + 5;
        
//        for(int val = value;val>0;val--){
//            System.out.println(val+" time of : "+value);
//        }

        //Sum of n numbers
                System.out.println("please enter the value :");

          int value = scanner.nextInt();
          int sum =0;
          for(int i = 0 ;i<=value;i++){
              sum+=i;
          }
          System.out.println("Sum of value:"+sum);
    }
}
