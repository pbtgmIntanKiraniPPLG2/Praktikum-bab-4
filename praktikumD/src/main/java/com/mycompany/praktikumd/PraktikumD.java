/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumd;

/**
 *
 * @author intan
 */
public class PraktikumD {

    public static void main(String[] args) {
        int hasil = factorial(5) + factorial(4);
        System.out.println("Hasil dari 5! + 4! : " + hasil);
    }
    
    // Fungsi untuk menghitung faktorial
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}


