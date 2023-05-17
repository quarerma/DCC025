/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufjf.dcc025.calculodistancia;

import javax.swing.JOptionPane;

/**
 *
 * @author quarerma
 */
public class CalculoDistancia {

    public static double le(String cord){
        return  Double.parseDouble(JOptionPane.showInputDialog("Digite a coordenada " + cord + ":"));
    }
    
    public static double dist(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow((x2 - x1), 2) - Math.pow((y2 - y1),2));
    }
    public static void main(String[] args) {
        double x1 = le("X1");        
        double y1 = le("Y1");        
        double x2 = le("X2");        
        double y2 = le("Y2");        
        
        JOptionPane.showMessageDialog(null, "Distância calculada entre os pontos é de: " + dist(x1, y1, x2, y2));
    }
}
