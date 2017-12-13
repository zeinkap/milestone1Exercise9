/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.milestone1exercise9;

import java.util.Random;

/**
 *
 * @author ZZZ
 */
public class HiddenNuts {
    public static void main(String[] args) {
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden ...");
        for (int i = 0; i < hidingSpots.length; i++) {
            if ("Nut".equals(hidingSpots[i])) {
                System.out.println("Found it! It's in spot# " + hidingSpots[i]);
            }
        }
        
    }
}
