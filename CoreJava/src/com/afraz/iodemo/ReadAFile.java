/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.iodemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author syeda
 */
public class ReadAFile {
    public static void main(String[] args) {
     //   FileInputStream fis=null;
        try {
            // something to write.. in a file
            File f=new File("D:\\mydata.txt");
          FileInputStream fis=new FileInputStream(f);
               //  int value=fis.read();
         
           // System.out.println((char)value);
            int i=0;
            while ((i=fis.read())!=-1) {                
                System.out.print((char)i);
            }
            
            
            
            fis.close();
            System.out.println("file has been written..");
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    } 
}
