/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javabasicshari;
//1
//abstract class A{
//      abstract  void name(OopsEncapsulationTask2 o);
//      abstract void pass(OopsEncapsulationTask2 o);
//      abstract void nickname(OopsEncapsulationTask2 o);
//}
//
//abstract class B extends A{
//   @Override
//    void name(OopsEncapsulationTask2 o){
//       System.out.println("hari");
//    }
//    
//}
//abstract class C extends A{
//    @Override
//    void pass(OopsEncapsulationTask2 o){
//       System.out.println("hari"); 
//    }
//}
//abstract class D extends A{
//   @Override
//    void nickname(OopsEncapsulationTask2 o){
//      System.out.println("hari");
//    }
//}
// class OopsEncapsulationTask2 extends A {
//    @Override
//    void name(OopsEncapsulationTask2 o){
//        
//    }
//    @Override
//    void pass(OopsEncapsulationTask2 o){
//       
//    }
//    @Override
//    void nickname(OopsEncapsulationTask2 o){
//        
//    }
//     
//    
//    public static void main(String args[]){
//        OopsEncapsulationTask2 en = new OopsEncapsulationTask2();
//        en.name(en);
//        en.nickname(en);
//        en.pass(en);
//        
//    }
//}


//2
/**
 *
 * @author harimani
 */
//abstract class A{
//      abstract  void name(OopsEncapsulationTask2 o);
//      abstract void pass(OopsEncapsulationTask2 o);
//      abstract void nickname(OopsEncapsulationTask2 o);
//}
//
//abstract class B extends A{
//   @Override
//    void name(OopsEncapsulationTask2 o){
//       System.out.println("hari");
//    }
//    
//}
//abstract class C extends A{
//    @Override
//    void pass(OopsEncapsulationTask2 o){
//       System.out.println("hari"); 
//    }
//}
//abstract class D extends A{
//   @Override
//    void nickname(OopsEncapsulationTask2 o){
//      System.out.println("hari");
//    }
//}
// class OopsEncapsulationTask2 extends A {
//    @Override
//    void name(OopsEncapsulationTask2 o){
//        
//    }
//    @Override
//    void pass(OopsEncapsulationTask2 o){
//       
//    }
//    @Override
//    void nickname(OopsEncapsulationTask2 o){
//        
//    }
//     
//    
//    public static void main(String args[]){
//        OopsEncapsulationTask2 en = new OopsEncapsulationTask2();
//        en.name(en);
//        en.nickname(en);
//        en.pass(en);
//        
//    }
//}

//3

//
///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package javabasicshari;
//
///**
// *
// * @author harimani
// */
abstract class A{
      abstract  void name();
      abstract void pass();
      abstract void nickname();
}

abstract class B extends A{
   @Override
    void name(){
       
    }
    
}
class mani extends B{
    void pass(){
        
    }
    void nickname(){
        
    }
}
abstract class C extends A{
    @Override
    void pass(){
       
    }
}
abstract class D extends A{
   @Override
    void nickname(){
      
    }
}
 class OopsEncapsulationTask2 extends A {
    @Override
    void name(){
        System.out.println("hari");
    }
    @Override
    void pass(){
        System.out.println("hari");
    }
    @Override
    void nickname(){
        System.out.println("hari");
    }
     
    
    public static void main(String args[]){
        OopsEncapsulationTask2 en = new OopsEncapsulationTask2();
        en.name();
        en.nickname();
        en.pass();
    }
}
