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
public class Recursion {

    public static void main(String args[]) {
//       hari(169);
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter 5 number: ");
//            int arr[]= new int[5];
//            for(int i=0;i<5;i++){
//                
//                arr[i]=sc.nextInt();
//            }
//            
//            GreaterLesser(arr);
//             Operation(1);
//        sumOfValue("9h2a45r9i");
//        multiply(3);
//        fibonaci(10);
//                 StringSpace("harimani done 8");
//          multipleTribple(3);
           pattern1();
    }

//    static void hari(int number) {
//        if (number >= 1) {
//            System.out.println(number);
//            hari(number - 1);
//        }
//
//    }
//    static void GreaterLesser(int arr[]) {
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println("lowerst number is " + arr[4]);
//        System.out.println("highest number is " + arr[0]);
//    }
//    static void sumOfValue(String name) {
//        int sum = 0;
//       
//       
//        for (int i = 0; i < name.length(); i++) {
//            int a =(int)name.charAt(i);
//            
//            if (a > 47 && a <= 58) {
//                
//                sum+= (int)name.charAt(i)-48;
//               
//            }
//        }
//        System.out.println("Sum of values: " + sum);
//    }
//   static void Operation(int i){
//        
//        if(i==1){
//           System.out.println("hari");
//           Operation(i-1);
//        }else{
//            System.out.println("done");
//        }
//    
//    }
//    static void multiply(int number){
//        for(int i =1;i<=10;i++){
//            int multiple = i * number;  //35
//            int value = multiple %10;
//
//            if( value !=5){
//               if(value!=7){
//                    System.out.println(i+"x"+number+" =" +i*number);
//               }
//            }
//            multiple =0;
//        }
//    }
//    static void fibonaci(int number) {
//        int a = 0;
//        int b = 1;
//        int c = a + b;
//        for (int i = 0; i < number + 2; i++) {
//            if (i > 1) {
//                System.out.println(c);
//                a = b;
//                b = c;
//                c=a+b;
//               
//            }else{
//                System.out.println(i);
//            }
//        }
//    }
    
    static void StringSpace(String name){
       
        for(int i =0;i<name.length();i++){
          
            if(name.charAt(i)!=' '){
                System.out.print(name.charAt(i));
            }
        }
    }
   static void multipleTribple(int number){
        int value =number; //3
       for(int i =1;i<=10;i++){
           value*=i;  //3, 6, 18, 54
           System.out.println(i+"x"+value+"="+i * value);
       }
    }
   static void pattern1(){
      for(int row =0;row<2*5;row++){
            for(int col =1;col<=5;col++){
                int condition = row<5? 5-row:(row+2)-5;
                if(col<condition){
                    System.out.print(" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
   }
}
