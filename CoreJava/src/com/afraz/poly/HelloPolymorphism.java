
package com.afraz.poly;


public class HelloPolymorphism {
    
    int add(int a,int b){
        int addition=a+b;
        System.out.println("values are ::"+addition);
        return addition;
    }
    
     double add(double a,double b,double c){
        double addition=a+b+c;
        System.out.println("values are double::"+addition);
        return addition;
    }
    public static void main(String[] args) {
        HelloPolymorphism obj=new HelloPolymorphism();
        int addans = obj.add(4, 5);
        double dans = obj.add(3.12,2.22,5.44);
//        System.out.println("answer"+addans+"  "+dans);
    }
}
