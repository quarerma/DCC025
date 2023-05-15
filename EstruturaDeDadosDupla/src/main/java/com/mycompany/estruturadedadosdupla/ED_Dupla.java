/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estruturadedadosdupla;

import java.util.*;

/**
 *
 * @author ice
 */
public class ED_Dupla<T1,T2>{
    private ArrayList<T1> est1;
    private ArrayList<T2> est2;
    
    public ED_Dupla(){
        this.est1 = new ArrayList<>();
        this.est2 = new ArrayList<>();
    }   

    public void adiciona(T1 elemento_1, T2 elemento_2)
    {
        est1.add(elemento_1);
        est2.add(elemento_2);
    }

    public void removeFinal()
    {
        est1.remove(est1.size() - 1);
        est2.remove(est2.size() - 1);
    }
    
    public void removeElemento(T1 elemento)
    {
        if(!ehVazia())
        {
        int ind = this.est1.indexOf(elemento);
        
        this.est1.remove(ind);
        this.est2.remove(ind);
        }
    }
    public void imprime()
    {
        for(int i = 0; i < this.est1.size(); i++)
        {
            System.out.println("Cidade: " + this.est1.get(i)+ "-> DDD: " + this.est2.get(i));
        }
    }
    public boolean ehVazia()
    {
        return est1.isEmpty() && est2.isEmpty();
    }
}
