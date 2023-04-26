/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.agendaatualizada;

import java.util.List;

/**
 *
 * @author ice
 */
public class OrdenadorNome extends Ordenador{

    @Override
    public List<Pessoas> ordena(List<Pessoas> pessoas) {
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

    @Override
    public boolean compare(Pessoas pessoa1, Pessoas pessoa2,int ind) {
        return pessoas.get(ind).getName().compareTo(pessoas.get(ind+1).getName()) > 0;
    }
    
}
