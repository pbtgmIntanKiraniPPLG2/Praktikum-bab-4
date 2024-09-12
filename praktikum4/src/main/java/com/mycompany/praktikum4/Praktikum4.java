/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikum4;

/**
 *
 * @author intan
 */
public class Praktikum4 {
    public static void main(String[] args) {
        String names[] = {"Joko", "Bhekti", "Hendi", "Prasekti"};

        // Perulangan Pertama - berhenti ketika menemukan "Bhekti"
        System.out.println("Perulangan Pertama (Berhenti saat menemukan Bhekti):");
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Bhekti")) {
                System.out.println("Berhenti di: " + names[i]);
                break; // Berhenti ketika menemukan "Bhekti"
            }
            System.out.println(names[i]);
        }

        // Perulangan Kedua - lanjut ketika menemukan "Bhekti"
        System.out.println("\nPerulangan Kedua (Lanjut saat menemukan Bhekti):");
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("Bhekti")) {
                System.out.println("Melewati: " + names[i]);
                continue; // Lanjutkan ketika menemukan "Bhekti"
            }
            System.out.println(names[i]);
        }
    }
}
