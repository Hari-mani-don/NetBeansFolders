
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harimani
 */
 class  MForLoopPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
       
         System.out.println("Enter the Patter(number / symbol / alphbet) : ");
        String pattern = sc.nextLine();   //*
        
        System.out.println("Enter the number of row: ");
        int number = sc.nextInt();  //5
       
        
        int plus =number;  //5
        int minus = number;  //5
        
        int secondPlus = number/2+1;  //2
        int secondMinus = (number*2) - (number/2)+1; ///7
        
        for(int row = 1;row<=number;row++){
            
            for(int col =1;col<=number*2;col++){
                   //3 > 5/2 =2
                if(row == number/2+1 && (col >= number/2+1 && col<plus)  || plus==col || minus==col 
                        ||( row == number && (row>minus && col<plus)) || row>number/2 && secondPlus==col || secondMinus==col){
                    
                    System.out.print(pattern);
                }else{
                    System.out.print("-");
                }
                
            }
             if(row>number/2){
             secondPlus++;
             secondMinus--;
            }
            plus++;
            minus--;
            System.out.println();
        }
        
    }   
}
