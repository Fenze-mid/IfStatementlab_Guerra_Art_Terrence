/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package age.checker;

import java.util.Scanner;
public class AgeChecker {

    public static void main(String[] args) {
      
        Scanner input= new Scanner (System.in);
    System.out.println("What is your age");
       int age = input.nextInt();
       if (age<13){
        System.out.println("You are a child");     
    }else if (age <=19){
        System.out.println("You are a Teenager");  
    }else{
        System.out.println("You are an adult"); 
    }
    
    
    }
    
}

