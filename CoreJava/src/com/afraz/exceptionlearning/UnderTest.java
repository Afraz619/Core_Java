/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.afraz.exceptionlearning;

/**
 *
 * @author syeda
 */
public class UnderTest {
    {
        System.out.println("");
    }
    

    public static void main(String[] args) {

        try {
            String st=null;
            System.out.println(st.length());
            int a[] = new int[4];

            a[4] = 100 / 0;

       
        }catch(NullPointerException n){
            n.printStackTrace();
        }
        catch (ArithmeticException e) {
            e.printStackTrace();

        } catch (ArrayIndexOutOfBoundsException a) {
            a.printStackTrace();
        
             } catch (Exception q) {
            q.printStackTrace();
        }
        finally{
            System.out.println("Always executes");
        }    

    }

}
