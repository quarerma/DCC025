/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufjf.dcc025.calculajuros;

import javax.swing.JOptionPane;


/**
 *
 * @author quarerma
 */

public class CalculaJuros
{
    public static void main(String[] args) {
       

        double investimentoMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento mensal: "));
        
        double taxaJurosMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento mensal: "));
        taxaJurosMensal /= 100;
      

        double saldoInvestimento = 0;
        for (int i = 1; i <= 12; i++) {
            saldoInvestimento += investimentoMensal;
            saldoInvestimento *= (1 + taxaJurosMensal);
        }

        JOptionPane.showMessageDialog(null, "O saldo do investimento após um ano é: R$" + saldoInvestimento);

        char continuar;
        do {
            continuar = JOptionPane.showInputDialog("Deseja calcular o ano seguinte? (S/N): ").toUpperCase().charAt(0);
            if (continuar == 'S') {
                for (int i = 1; i <= 12; i++) {
                    saldoInvestimento += investimentoMensal;
                    saldoInvestimento *= (1 + taxaJurosMensal);
                }
                JOptionPane.showMessageDialog(null, "O saldo do investimento após mais um ano é: R$ " + saldoInvestimento);
            }
        } while (continuar == 'S');

    }
}