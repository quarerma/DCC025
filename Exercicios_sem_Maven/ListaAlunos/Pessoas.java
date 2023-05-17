/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufjf.dcc025.listaalunos;

/**
 *
 * @author quarerma
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
    
    public Pessoas(String nm, int ag)
    {
        name = nm;
        age = ag;
    }
}
