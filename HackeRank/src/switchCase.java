
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harimani
 */
public class switchCase {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day to check week day or week end: ");
        char day = scanner.next().charAt(0);
        
        switch(day){
            case 'm':
            case 'M':
            case 't':
            case 'T':
            case 'w':
            case 'W':
            case 'F':
                 System.out.println("Weekday");
                 break;
            case 'S':    
            case 's':
                System.out.println("Week End");
                break;
            default:
                System.out.println("Invalid input");
                
        }
    }
}
