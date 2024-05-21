
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harimani
 */
public class switchCase3 {
    public static void main(String args[]){
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the  UserName: ");
        char userName = scanner.next().charAt(2);
        
        switch(userName){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'O':
            case 'o':
            case 'u':
            case 'U':    
                 System.out.println("It is a Vowel");
                 break;
           
            default:
                System.out.println("It is not a vowel");
                
        }
    }
}
