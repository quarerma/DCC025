/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.triangulos;

import java.util.Scanner;

/**
 *
 * @author quarerma
 */
public class Triangulos {

    public static boolean ehTriangulo(int s1,int s2,int s3)
    {
        int var = 0;
            if(s1 + s2 > s3) var ++;
            if(s3 + s2 > s1) var ++;
            if(s1 + s3 > s2) var ++;
            if(var == 3) return true;
            return false;
    }
    
    public static void tipoTriangulo(int s1,int s2,int s3)
    {
        if(s1 == s2 && s1 == s3) System.out.println("Triângulo Equilátero");
        else if(s1 == s2 || s1 == s3 || s2 == s3) System.out.println("Triângulo Isóceles");
        else if(s1 != s2 && s1 != s3 && s2 != s3) System.out.println("Triângulo Escaleno");
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s1 = 0, s2 = 0, s3 = 0;
        
        System.out.println("Digite 3 valores:");
        s1 = teclado.nextInt();
        s2 = teclado.nextInt();
        s3 = teclado.nextInt();
        
        if(!ehTriangulo(s1, s2, s3)) System.out.println("Não forma Triângulo");   
        else tipoTriangulo(s1, s2, s3);
    }
}
