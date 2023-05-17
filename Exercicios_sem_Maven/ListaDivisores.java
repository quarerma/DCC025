/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadivisores;

import java.util.Scanner;

/**
 *
 * @author quarerma
 */
public class ListaDivisores {

    public static int numDiv(int val)
    {
        int div = 0;
        for(int i = 1; i <= val; i++) if(val % i == 0) div++;
        
        return div;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int esc = 1;
        int val = 0;
        
        while(esc == 1)
        {
        esc = 0;
        
        System.out.println("Digite 1 valor:");
        val = teclado.nextInt();
    
        int div = numDiv(val);
        
        if(div == 2) System.out.println("Numero Primo");
        else System.out.println("O numero tem "+ div +" divisores");
        
        System.out.println("Se quiser analisar outro número digite 1, caso contrário 0");
        
        esc = teclado.nextInt();
        
        if(esc == 0)
        {
            System.out.println("Programa Finalizado com êxito");
            break;
        }
        
    }
}

}
