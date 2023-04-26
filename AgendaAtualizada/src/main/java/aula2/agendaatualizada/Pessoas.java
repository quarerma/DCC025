/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2.agendaatualizada;

/**
 *
 * @author ice
 */
public class Pessoas {
    private String name = " ";
    private int age = 0;
    
    public int getAge(){
         return age;   
    }
    public String getName(){
        return name;
    }
    
    public Pessoas(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}
