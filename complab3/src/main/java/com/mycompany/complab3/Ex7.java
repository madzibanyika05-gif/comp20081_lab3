/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.complab3;

/**
 *
 * @author ntu-user
 */
import java.util.LinkedList;

public class Ex7 {
    public static void main(String[] args){
    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // add() method without the index parameter
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);

    // add() method with the index parameter
    animals.add(1, "Horse");
    System.out.println("Updated LinkedList: " + animals);
    
    // get the element from the linked list
    String str = animals.get(1);
    System.out.print("Element at index 1: " + str);
    
    // change elements at index 3
    animals.set(3, "Elephant");
    System.out.println("Updated LinkedList: " + animals);
    
    // remove elements from index 1
    str = animals.remove(1);
    System.out.println("Removed Element: " + str);
  }
}
