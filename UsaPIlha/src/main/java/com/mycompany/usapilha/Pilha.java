/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usapilha;

import java.util.ArrayList;

/**
 *
 * @author ice
 */
public class Pilha<T>{
    private ArrayList<T> pilha;
    
    public Pilha()
    {
        this.pilha = new ArrayList<>();
    }

    public void empilha(T elemento)
    {
        pilha.add(elemento);
    }

    public T desempilha(){
       if(!ehVazia())
           return pilha.remove(pilha.size() - 1);
       else
           return null;
    }
    
    public void imprime(){
        for(T elemento : this.pilha)
        System.out.println(elemento + " ");
    }
    public boolean ehVazia(){
        return pilha.isEmpty();
    }
}
