package com.afraz.thissuperfinal;
public class Employee {
  int empId; 
  String empName;
  String empAddress;

    public Employee() {
        System.out.println("default donstructor");
    }

    public Employee(int empId, String empName) {
             this(); //this call
        this.empId = empId;
        this.empName = empName;
    }
    
        public Employee(int empId, String empName, String empAddress) {
         this(23, "Raj");//this call ??
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }
       public void save(){
        int a=8;//local
        System.out.println("save the values as local::"+a);
        
        
    }
    //this call
    public static void main(String[] args) {
        Employee emp=new Employee(12,"Ravi");
        emp.save();
    }
  
  
}
