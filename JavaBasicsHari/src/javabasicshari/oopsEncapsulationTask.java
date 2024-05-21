/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

import java.util.Scanner;

abstract class A{
    private String name;
    private String password;
    
    abstract void username(String name, User o);
    abstract void Pass(String pass, User o);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}

class User extends A{
    
    @Override
    void username(String name, User use){
        setName(name);
    }
    @Override
    void Pass(String pass, User use){
        setPassword(pass);
    }
}
class oopsEncapsulationTask{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
    
   
    
   
    System.out.println("Enter your name:");
    String name = sc.nextLine();
    System.out.print("Enter your Password: ");
    String password = sc.nextLine();
    User use = new User();
    
    use.username(name, use);
    
    use.Pass(password, use);
     
   
    System.out.println( use.getName());
    System.out.println( use.getPassword());
   
                
    }
}

