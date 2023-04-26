/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula2.agendaatualizada;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class AgendaAtualizada {

    public static void main(String[] args) {
        List<Pessoas> pessoas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        for(int i = 0; i < 5; i ++)
        {
            String nome = teclado.nextLine().trim();
            int idade = teclado.nextInt();
            
            pessoas.add(new Pessoas(nome, idade));
        }
    }

}
