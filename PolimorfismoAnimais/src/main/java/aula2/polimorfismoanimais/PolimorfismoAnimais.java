/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula2.polimorfismoanimais;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ice
 */
public class PolimorfismoAnimais {

    public static void main(String[] args) {
        List<Animal> lista_animais = new ArrayList<>();
        Animal a = new Homem();
        Animal b = new Cao();
        Animal c = new Gato();
        Animal d = new Homem();
        Animal e = new Homem();
        Animal f = new Gato();
        Animal g = new Gato();
        Animal h = new Cao();
        Animal i = new Cao();
        Animal j = new Homem();
        lista_animais.add(a); 
        lista_animais.add(b); 
        lista_animais.add(c); 
        lista_animais.add(d); 
        lista_animais.add(e); 
        lista_animais.add(f); 
        lista_animais.add(g); 
        lista_animais.add(h); 
        lista_animais.add(i); 
        lista_animais.add(j); 
        
        for(Animal animal : lista_animais)
            animal.fala();
    }
}
