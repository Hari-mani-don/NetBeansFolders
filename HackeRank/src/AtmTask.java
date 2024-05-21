
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author harimani
 * name, 
 */
public class AtmTask {
    
    public static void main(String args[]){
        Student student = new Student();  //create object in student class
        student.StudentDetails();  //input get from user
     
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("\t\t\tWelcome Mr."+student.name+"\n");
        if(student.dept =='C' || student.dept =='c'){
            System.out.println("Your are selected in 'ECE' Department");
           student.Department(student.year, student.name);
        }else if(student.dept =='S' || student.dept =='s'){
            System.out.println("Your are selected in 'CSE' Department");
            student.Department(student.year,student.name);
            
        }else if(student.dept =='E' || student.dept =='e'){
            System.out.println("Your are selected in 'EEE' Department");
            student.Department(student.year,student.name);
        }else if(student.dept =='M' || student.dept =='m'){
            System.out.println("Your are selected in 'MECH' Department");
            student.Department(student.year,student.name);
        }else{
             System.out.println("Your are selected in 'Wrong' Department !!error");
        }
                System.out.println("-----------------------------------------------------------------------------------------");
    }
            
}

class Student{
    
    //input get variable list
      String name;
       long number;
       char dept;
       int year;
       
       
       //fees list
        float FirstFees = 12000;
          float SecondFees = 20000;
          float ThirdFees = 50000;
          float FourFees = 132000;
          
          //get in scanner
       Scanner sc = new Scanner(System.in);
       
      void StudentDetails(){
          System.out.print("\nEnter your name:");
          name = sc.nextLine();
          System.out.print("\nEnter your Number:");
          number = sc.nextInt();
           DepartmentList();
          System.out.print("\nEnter your Department:");
          dept = sc.next().charAt(1);
          System.out.print("\nEnter your Year:");
          year = sc.nextInt();
      } 
      void Department(int year, String name){
          if(year == 1){
             FirstYear(name);
          }else if(year == 2){
              SecondYear(name);
          }else if(year == 3){
              ThirdYear(name);
          }if(year == 4){
              FinalYear(name);
          }
      }
      void FirstYear(String name){
          System.out.println("\nHi,"+name);
           System.out.println("\n\tSubject List: ");
           System.out.println("\n\t\tTamil");
           System.out.println("\n\t\tEnglish");
           System.out.println("\n\t\tMath");
           System.out.println("\n\n\t\tYour are Fees in First year:"+FirstFees);
           FeesInYear( );
      }
      void SecondYear(String name){
            System.out.println("\nHi,"+name);
           System.out.println("\n\tSubject List: ");
           System.out.println("\n\t\tTamil");
           System.out.println("\n\t\tEnglish");
           System.out.println("\n\t\tMath");
           System.out.println("\n\n\t\tYour are Fees in Second year:"+SecondFees);
           FeesInYear( );
      }
      void ThirdYear(String name){
            System.out.println("\nHi,"+name);
           System.out.println("\n\tSubject List: ");
           System.out.println("\n\t\tTamil");
           System.out.println("\n\t\tEnglish");
           System.out.println("\n\t\tMath");
           System.out.println("\n\n\t\tYour are Fees in Third year:"+ThirdFees);
           FeesInYear( );
      }
      void FinalYear(String name){
            System.out.println("\nHi,"+name);
           System.out.println("\n\tSubject List: ");
           System.out.println("\n\t\tTamil");
           System.out.println("\n\t\tEnglish");
           System.out.println("\n\t\tMath");
           System.out.println("\n\n\t\tYour are Fees in Fourth year:"+FourFees);
           FeesInYear( );   
      }
      void FeesInYear( ){
         System.out.println("\n\t\t----------------------------------------------");
         System.out.println("\t\t\tYear of Fees Structue:");
         System.out.println("\n\t\t\tFirst year:"+FirstFees);
         System.out.println("\t\t\tSecond year:"+SecondFees);
         System.out.println("\t\t\tThird year:"+ThirdFees);
         System.out.println("\t\t\tFourth year:"+FourFees);
         System.out.println("\n\t\t----------------------------------------------");
      }
      
      void DepartmentList(){
          System.out.println("\nDepartment:");
          System.out.println("\n\tECE");
          System.out.println("\n\tMECH");
          System.out.println("\n\tCSE");
          System.out.println("\n\tEEE");
      }
}
