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
public abstract class Ordenador {

    public abstract List<Pessoas> ordena(List<Pessoas> pessoas);
    public abstract boolean compare(Pessoas pessoa1, Pessoas pessoa2, int ind);

}
