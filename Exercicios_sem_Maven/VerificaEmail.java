/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificaemail;


import java.util.Scanner;

/**
 *
 * @author quarerma
 */
public class VerificaEmail {

   public static boolean verficador(String email)
   {
       int at = 0;       
       //Busca o caractere @ a partir da primeira letra
       at = email.indexOf("@", 1);
       //Checa se o email possui @
       if(at == -1) return false;
       //Checar se possui .com a partir do @
       if(email.indexOf(".com", at + 1) == -1) return false;
       
       return true;
       
       
               
               
   }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um email:");
        String email = teclado.nextLine().trim();
        
        if(!verficador(email)) System.out.println("Enail inválido");
        else System.out.println("Email valido");
    }
}
