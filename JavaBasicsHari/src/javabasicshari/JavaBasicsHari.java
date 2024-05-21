/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javabasicshari;

/**
 *
 * @author harimani
 */
public class JavaBasicsHari {
     
   
   
    public static void main(String[] args) {
         B bclass = new B();  //variable class
         bclass.a = 200;
         bclass.b =100;
         
        
         
      C Cclass = new C();
      Cclass.add();
      
       D Dclass = new D();
      Dclass.sub(bclass.a, bclass.b);
  
        E Eclass = new E();
      int a =  Eclass.mul();
      
     System.out.println("The value of A & B: "+a);
      F Fclass = new F();
    int b =  Fclass.div(bclass.a, bclass.b);
        System.out.println("The value of A & B: "+b);
      
    }
    public void hari(){
         B bclass = new B();  //variable class
         int bc = 10;
                bclass.b  = 100;
    }

    
}

 class B{
    int a ;
    int b ;
    
}
class C{
    void add(){  //non-return type without argument
        
       B bclass = new B();
       bclass.a=100;
       bclass.b=200;
        System.out.println("The value of A & b: "+(bclass.a + bclass.b));
    }
}
class D{
    
   void  sub(int a, int b){  //non-return type with argument
       
        System.out.println("The value of A & b: "+(a - b));
    }
}
class E{
    int mul() {  //retrun type without argument
          B bclass = new B();
         bclass.a=100;
         bclass.b=200;
        D java = new D();
        
        return bclass.a* bclass.b;
    }
}
class F{
    int div(int a, int b) {  //retrun type with argument
      
        
        return a / b;
      
    }
}