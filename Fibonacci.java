/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufjf.dcc025.fibonacci;



import javax.swing.JOptionPane;
/**
 *
 * @author quarerma
 */
public class Fibonacci {

     public static void main(String[] args) {
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para operação: "));
        
        for (int i = 1; i <= num; i++) {
            JOptionPane.showMessageDialog(null,fibonacci(i) + " ");
            
            //Para imprimir no terminal
            //System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }
}
