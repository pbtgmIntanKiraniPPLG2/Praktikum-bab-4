/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumfor;

/**
 *
 * @author intan
 */
public class Praktikumfor {
    
    public static void main(String[] args) {
        int total = 0;

        System.out.println("\nPerulangan menggunakan for:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            total += i;
        }

        System.out.println("Total dari 1 sampai 10: " + total);
    }

    }

