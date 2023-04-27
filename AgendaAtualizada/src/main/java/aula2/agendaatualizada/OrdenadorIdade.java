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
public class OrdenadorIdade extends Ordenador{

    @Override
    public List<Pessoas> ordena(List<Pessoas> pessoas) {
        Pessoas aux;
        
        for(int i = 0; i < pessoas.size(); i ++){
            for(int j = 1; j < pessoas.size() - i; j++)
        {
                if( compare(pessoas.get(j-1), pessoas.get(j)))
                {
                aux = pessoas.get(j - 1);
                pessoas.set(j - 1, pessoas.get(j));
                pessoas.set(j, aux);
                }
        }
        }
        return pessoas;
    }

    @Override
    public boolean compare(Pessoas pessoa1, Pessoas pessoa2) {
        return pessoa1.getAge() > pessoa2.getAge();
    }
    
}
