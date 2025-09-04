/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package camilazapata;
import java.util.Scanner;


public class CamilaZapata {

   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 4;
        
        try{
        
            System.out.println("ingrese el valor de A:");
            a = sc.nextInt();
                
            System.out.println("ingrese el valor de B:");
            b = sc.nextInt();
       
            int resultado = a / b;
        
            System.out.println("Resultado:"+resultado);
        }catch(Exception e ){
            System.out.println(""+e);
        }
        

       
     
        //InputMismatchException
        //ArithmeticException
        
    }

}

