/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumdowhile;

/**
 *
 * @author intan
 */
public class Praktikumdowhile {


    public static void main(String[] args) {
        int i = 1;
        int total = 0;

        System.out.println("\nPerulangan menggunakan do-while:");
        do {
            System.out.println(i);
            total += i;
            i++;
        } while (i <= 10);

        System.out.println("Total dari 1 sampai 10: " + total);
    }

    }

