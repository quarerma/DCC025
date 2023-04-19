/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estruturadedadosdupla;

/**
 *
 * @author ice
 */
public class EstruturaDeDadosDupla {

    public static void main(String[] args) {
        ED_Dupla<String, Integer> ed_str_int = new ED_Dupla<>();
        
        ed_str_int.adiciona("São Paulo", 11);
        ed_str_int.adiciona("Rio de Janeiro", 24);
        ed_str_int.adiciona("Belo Horizonte", 32);
        ed_str_int.adiciona("Porto Alegre", 55);
        
        System.out.println("Imprimindo ");
        ed_str_int.imprime();
        
        ed_str_int.removeElemento("Rio de Janeiro");
        
        System.out.println("Imprimindo sem RJ ");
        ed_str_int.imprime();
        
        ed_str_int.removeFinal();
        System.out.println("Imprimindo sem PA ");
        ed_str_int.imprime();
    }
}
