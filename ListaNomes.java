/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listanomes;

import java.util.Scanner;

/**
 *
 * @author quarerma
 */
public class ListaNomes {
    
    public static void leia(String[] nomes,int[] idade)
    {
        Scanner teclado = new Scanner(System.in);
               
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Nome da Pessoa " + (i+1));
            nomes[i] = teclado.nextLine().trim();
            System.out.println("Idade da Pessoa " + (i+1));
            idade[i] = teclado.nextInt();
        }
    }
    
    public static void ordemAlfabetica(String[] nomes, int[] idade)
    {
        
        String menor = nomes[i];
        String menorAnt =  nomes[i];
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                if(menor.compareTo(nomes[i]) > 0);
                menor = nomes[i];
            }
        }
    }
    public static void ordemCrescente(String[] nomes, int[] idade)
    {
        
    }
    
        

    public static void main(String[] args) {
       String[] nomes = new String[5];
       int[] idade = new int[5];
       
        System.out.println("Digite o nome e a idade das pessoas em questão ");
        
        
        
    } 
}
