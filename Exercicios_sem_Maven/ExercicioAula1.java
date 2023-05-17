/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufjf.dcc025.exercicioaula1;
import java.util.Scanner;

/**
 *
 * @author quarerma
 */
public class ExercicioAula1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe a quantia de dinheiro em centavos: ");
        int dinheiro = teclado.nextInt();
        int real = 0, half = 0, quarter = 0, dime = 0, nickel = 0, penny = 0, total = dinheiro;
        real = dinheiro / 100;
        dinheiro = dinheiro % 100;
        half = dinheiro / 50;
        dinheiro = dinheiro % 50;
        quarter = dinheiro / 25;
        dinheiro = dinheiro % 25;
        dime = dinheiro / 10;
        dinheiro = dinheiro % 10;
        nickel = dinheiro / 5;
        dinheiro = dinheiro % 5;
        
        System.out.println("Para o valor " + total + " tem-se: " + real + " moeda(s) de 1 real, "  + half + " moeda(s) de 50 centavos, "+ quarter + " moeda(s) de 25 centavos, "  );
        System.out.println( dime + " moeda(s) de 10 centavos, " + nickel + " moeda(s) de 5 centavos, " + dinheiro + " moeda(s) de 1 centavos, "  );
    }
}
