/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr3_m8;

import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class Pr3_m8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introdueix numero");
        int n1=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n2=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n3=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n4=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n5=entrada.nextInt();

        
        System.out.println("Introdueix numero");
        int n6=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n7=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n8=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n9=entrada.nextInt();
        
        System.out.println("Introdueix numero");
        int n10=entrada.nextInt();
        
        int max=0;
        
        if (n1>max){
            max=n1;
        }
        if (n2>max){
            max=n2;
        }
        if (n3>max){
            max=n3;
        }
        if (n4>max){
            max=n4;
        }
        if (n5>max){
            max=n5;
        }
  if (n6>max){
            max=n6;
        }
  if (n7>max){
            max=n7;
        }
  if (n8>max){
            max=n8;
        }
  if (n9>max){
            max=n9;
        }
  if (n10>max){
            max=n10;
        }
        
        System.out.println("El mes gran es "+max);
    }
    
}

