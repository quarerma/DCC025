/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author ice
 */
public class Calculadora {
    
    public static float soma(float x){
        float num1 = 0;
        String numero1 = JOptionPane.showInputDialog("Digite um número para operação: ");
        num1 = Float.parseFloat(numero1);
        
        return x+num1;
    }
    public static float sub(float x){
        float num1 = 0;
        String numero1 = JOptionPane.showInputDialog("Digite um número para operação: ");
        num1 = Float.parseFloat(numero1);
    
        return x-num1;
    }
    public static float mult(float x){
        float num1 = 0;
        String numero1 = JOptionPane.showInputDialog("Digite um número para operação: ");
        num1 = Float.parseFloat(numero1);
    
        return x*num1;
    }
    public static float div(float x){
        float num1 = 0;
        String numero1 = JOptionPane.showInputDialog("Digite um número para operação: ");
        num1 = Float.parseFloat(numero1);
        
        if(num1 == 0) {
            JOptionPane.showMessageDialog(null, "Divisão por 0, programa finalizado");
            System.exit(0);
        }
        return x / num1;
    }

    public static void main(String[] args) {
        float num1 = 0;
        String numero1 = JOptionPane.showInputDialog("Digite um número para iniciar a calculadora: ");
        num1 = Float.parseFloat(numero1);
        String [] options = {"Soma", "Subtração", "Multiplicação", "Divisão","Reiniciar", "Sair"};
        int x = 0;
        do
        {
            x = JOptionPane.showOptionDialog(null, "Escolha a operação a ser realizada",
                "Clique em um Botao",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch(x){
                case 0:
                    num1 = soma(num1);
                    JOptionPane.showMessageDialog(null, "Resultado da Soma: " + num1);
                    break;
                case 1:
                    num1 = sub(num1);
                    JOptionPane.showMessageDialog(null, "Resultado da Subtração: " + num1);
                    break;
                case 2:
                    num1 = mult(num1);
                    JOptionPane.showMessageDialog(null, "Resultado da Multiplicação: " + num1);
                    break;
                case 3:
                    num1 = div(num1);
                    JOptionPane.showMessageDialog(null, "Resultado da Divisão: " + num1);
                    break;
                case 4:
                    String numero2 = JOptionPane.showInputDialog("Digite um novo número:");
                    num1 = Float.parseFloat(numero2);
                    break;
                case 5: 
                    System.exit(0);          
                }               
        }while (true);
    }
}
