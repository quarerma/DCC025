/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.usapilha;

/**
 *
 * @author ice
 */
public class UsaPIlha {

    public static void main(String[] args) {
        Pilha<Integer> pilha_int = new Pilha<>();
        Pilha<Double> pilha_double = new Pilha<>();
        
        pilha_int.empilha(1);
        pilha_int.empilha(2);
        pilha_int.empilha(3);
        
        System.out.println("Imprimindo lista");
        pilha_int.imprime();
        
        pilha_int.desempilha();
        pilha_int.desempilha();
        
        System.out.println("Imprimindo lista após remoção");
        pilha_int.imprime();
    }
}
