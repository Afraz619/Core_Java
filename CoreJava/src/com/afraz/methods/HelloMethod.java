
package com.afraz.methods;
public class HelloMethod {
    
    //in any application-data , logic- method is the way-
    
    // non static
   int  addTwoNum(){
       int a=3;
       int b=5;
       
     int values=a+b;  
     {
       System.out.println("Enter a positive number");
     }  
     return values;
    }
   //static method
   //static
   
   static int substract(){
       int a=44;
       
       int b=22;
       
       int c=a-b;
       
       return c;
   }
   
   void save(){
       System.out.println("saving the values..");
   }
   
   
   
   //how to call the method
   
    public static void main(String[] args) {
        HelloMethod mhObj=new HelloMethod();
       int addedValues= mhObj.addTwoNum();
       
        System.out.println("added values are ::"+addedValues);
        
        System.out.println(HelloMethod.substract());
        
        mhObj.save();
        int ans=mhObj.addTwoNum();
        System.out.println("answer"+ans);

        
        
    }
    
   //Assignment=
    //8-constructor-- 
   /* write a method to calculate SI;
    *aver   age values
    *%
    */
    //example on all conditionals =control statements
}
