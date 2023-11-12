
package com.afraz.stringdemo;

// creating object or by inheritance=not possible
/*

in java we do create object in two different ways

   first we have = by String literal
By using new keywords
*/

    
public class Test  {
    
   String s;
    public static void main(String[] args) {
       // String s=new String();
        String s= "Hyderabad";//alway index starts from 0
        //space is a  char in java
        String a="computer";
        
       
        System.out.println("Char at::"+s.charAt(3));
        
        System.out.println("1 ="+s.endsWith("bad"));  // Tests if this string ends with the specified suffix
        
        System.out.println("2 ="+s.startsWith("Hyd")); //Tests if this string starts with the specified prefix
        
        System.out.println("3 ="+s.compareTo("Bikram")); //if the string is equal to the other string
        
        System.out.println("4 ="+s.compareToIgnoreCase(a));//if the string is equal to the other string, ignoring case differences
        
        System.out.println("5 ="+s.charAt(2));// returns the character at the specified index in a string.
        
        System.out.println("6 ="+s.codePointAt(2)); //returns the Unicode value of the character at the specified index in a string
        
        System.out.println("7 ="+s.codePointBefore(3));//returns the Unicode value of the character before the specified index in a string
        
        System.out.println("8 ="+s.codePointCount(1, 3));//returns the number of Unicode values found in a string. Use the startIndex and endIndex parameters
        
        System.out.println("9 ="+s.concat(a));//Concatenates the specified string to the end of this string
        
        System.out.println("10 ="+s.contains("y"));//Returns true if and only if this string contains the specified sequence of char values
        
        System.out.println("11 ="+s.contentEquals("abad")); //compares the string to the specified CharSequence
        
        System.out.println("12 ="+s.contentEquals(a));//Compares this string to the specified CharSequence. The result is true if and only if this String represents the same sequence of char values as the specified sequence
        
        System.out.println("13 ="+s.equals(a));
        
        System.out.println("14 ="+s.equalsIgnoreCase(a));
        
        System.out.println("15 ="+s.getBytes());
        
        System.out.println("16 ="+s.indexOf(a));
        
        System.out.println("17 ="+s.isEmpty());
        
        System.out.println("18 ="+s.length());
        
        System.out.println("19 ="+s.lastIndexOf(a));
        
        System.out.println("20 ="+s.toUpperCase());
        
        System.out.println("21 ="+s.replace(s, a));
        
        System.out.println("5 ="+s.intern());
        
        
        
       
    }
    
}
