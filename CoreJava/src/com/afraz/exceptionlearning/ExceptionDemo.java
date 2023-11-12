
package com.afraz.exceptionlearning;

/**
 *
 * @author syeda
 */
public class ExceptionDemo {
    
    Throwable t;
    Exception e;
    public static void main(String[] args) {
        try {
            int a=100/0;//thid throwing exception while execution 
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception occured due to::"+e);
        }
       
        System.out.println("Hello1");
        System.out.println("Hello2");
        System.out.println("Hello3");
        System.out.println("Hello4");
        System.out.println("Hello5");
        System.out.println("Hello6");
        System.out.println("Hello7");
        System.out.println("Hello8");
    
        
    }
    
}
