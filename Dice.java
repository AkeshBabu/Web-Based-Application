package com.mycompany.week4_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Random;

/**
 *
 * @author u1481162
 */
public class Dice {
    public static void main(String[] args){
    Random rand = new Random();
    System.out.println("Rolling the Dice");
    System.out.println( rand.nextInt(6));
    }
}
