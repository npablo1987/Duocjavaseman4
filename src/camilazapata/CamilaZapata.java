/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camilazapata;
import java.util.Scanner;


public class CamilaZapata {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       try {
       
           String s = null;
           int x = Integer.parseInt("abc");
       
           System.out.println(s.length());
       } catch(NumberFormatException e){
       
           System.out.println("Texto no numero");
       } catch(NullPointerException e){
           System.out.println("Objeto nulo"+e);
       }finally{
       
       
       }

        System.out.println("Prueba");
       
     
        //InputMismatchException
        //ArithmeticException
        
    }

}

