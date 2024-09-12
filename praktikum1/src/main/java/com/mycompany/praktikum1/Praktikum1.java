/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum1;

/**
 *
 * @author intan
 */
public class Praktikum1 {

   
    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        System.out.println("Perulangan menggunakan while:");
        while (i <= 10) {
            System.out.println(i);
            total += i;
            i++;
        }

        System.out.println("Total dari 1 sampai 10: " + total);
    }
}

