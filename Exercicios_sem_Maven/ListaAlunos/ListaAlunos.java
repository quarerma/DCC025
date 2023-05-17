/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufjf.dcc025.listaalunos;

import java.util.ArrayList; 
import javax.swing.JOptionPane;
import java.util.List;

/**
 *
 * @author quarerma
 */
public class ListaAlunos {

    public static List<Pessoas> ordenaPorIdade(List<Pessoas> pessoas)
    {
       
        Pessoas aux;
        
        for(int i = 0; i < pessoas.size(); i ++){
            for(int j = 1; j < pessoas.size() - i; j++)
        {
                if( pessoas.get(j - 1).getAge() > pessoas.get(j).getAge())
                {
                aux = pessoas.get(j - 1);
                pessoas.set(j - 1, pessoas.get(j));
                pessoas.set(j, aux);
                }
        }
        }
        
        return pessoas; 
    }
    
     public static List<Pessoas> ordenaPorNome(List<Pessoas> pessoas)
    {
       
        Pessoas aux;
        
        for(int i = 0; i < pessoas.size() - 1; i ++){
            for(int j = 0; j < pessoas.size() - i - 1; j++)
        
                if( pessoas.get(j).getName().compareTo(pessoas.get(j+1).getName()) > 0)
                {
                aux = pessoas.get(j);
                pessoas.set(j, pessoas.get(j + 1));
                pessoas.set(j + 1, aux);
                }
        }
        
        
        return pessoas; 
}

    
    
    public static void main(String[] args) {
        List<Pessoas> pessoas = new ArrayList<>();
        for(int i = 0; i < 5; i ++)
        {
            String nome = JOptionPane.showInputDialog("Digite o Nome: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Idade"));
            
            pessoas.add(new Pessoas(nome, idade));
        }
        List <Pessoas> pessoasOrdenadasPorIdade = ordenaPorIdade(pessoas);
    
        System.out.println("Pessoas Impressas em Ordem de Idade");
        for(Pessoas pessoa : pessoasOrdenadasPorIdade){
            System.out.println("Nome: " + pessoa.getName() + "-> Idade: " + pessoa.getAge());
        }
      pessoasOrdenadasPorIdade.clear();
        
      List <Pessoas> pessoasOrdenadasPorNome = ordenaPorNome(pessoas);
      
        System.out.println("Pessoas Impressas em Ordem de Nome");
        for(Pessoas pessoa : pessoasOrdenadasPorNome){
            System.out.println("Nome: " + pessoa.getName() + "-> Idade: " + pessoa.getAge());
        }
      pessoasOrdenadasPorNome.clear();
        
    }
}
