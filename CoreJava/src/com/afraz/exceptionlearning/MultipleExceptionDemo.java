package com.afraz.exceptionlearning;


public class MultipleExceptionDemo {
    
    public static void main(String[] args) {
        
        try{
        int a[]=new int[4];
        
        a[4]=100/0;
          
        }
        catch(ArithmeticException  | ArrayIndexOutOfBoundsException a){
            a.printStackTrace();
            
        }
//        catch(ArrayIndexOutOfBoundsException a){
//            a.printStackTrace();
//        }
      
        
}
    
}
