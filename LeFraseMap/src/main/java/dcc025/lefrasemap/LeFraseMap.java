/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dcc025.lefrasemap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ice
 */
public class LeFraseMap {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String input = teclado.nextLine().trim();
        char [] strArray = input.toCharArray();
        
        Map<Character, Integer> contCaracter = new HashMap<>();
        
        for(char c : strArray){
            if(contCaracter.containsKey(c)) contCaracter.put(c, contCaracter.get(c) + 1);
            else contCaracter.put(c, 1);
        }
        
        for(Map.Entry entrada : contCaracter.entrySet())
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
    }
}
