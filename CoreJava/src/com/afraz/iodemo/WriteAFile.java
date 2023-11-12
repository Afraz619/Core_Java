/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.iodemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author syeda
 */
public class WriteAFile {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        try {
            // something to write.. in a file
            File f=new File("D:\\mydata.txt");
            fos = new FileOutputStream(f);
            fos.write(65);
            System.out.println("file has been written..");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
               ex.printStackTrace();
            }
        }
    }
}
