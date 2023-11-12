
package com.afraz.thissuperfinal;

public class HelloKeys {
    
   //this,super,final
    
    int a=5; //
    
   public void help(){
        int b=8;//local
        System.out.println("save the values as local help::"+b);
   
        
    }
    
    public void save(){
        int a=8;//local
        this.help();
        System.out.println("save the values as local::"+a);
        System.out.println("save the values as non=static::"+this.a);
        
    }
    public static void main(String[] args) {
        HelloKeys hk=new HelloKeys();
        
        hk.save();
    }
}
