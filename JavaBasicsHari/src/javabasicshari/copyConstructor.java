/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;

/**
 *
 * @author harimani
 */
public class copyConstructor {
    public static void main(String args[]){
        constructor cons = new constructor("hari", "123");
        constructor co = new constructor(cons);
        System.out.println( co.name);
    }
}
class constructor{
    
    String name;
    String pass;
    constructor(String name, String pass){
        this.name = name;
        this.pass= pass;
        System.out.println(this.name);
        System.out.println(this.pass);
    }
     constructor(constructor con){
        this.name = con.name;
        this.pass= con.pass;
        this.name = "mani";
        
        System.out.println(this.name);
        System.out.println(con.pass);
    }
}
