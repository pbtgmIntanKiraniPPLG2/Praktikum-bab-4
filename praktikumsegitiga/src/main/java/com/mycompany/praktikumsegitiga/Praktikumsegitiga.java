/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumsegitiga;
import javax.swing.*;

/**
 *
 * @author intan
 */
public class Praktikumsegitiga {

    public static void main(String[] args) {
        // Input angka dari pengguna
        String angka = JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan: ");
        int n = Integer.parseInt(angka);
        
        // Pola Segitiga Berdampingan: Menurun dan Naik
        System.out.println("Pola Segitiga Berdampingan: Menurun dan Naik");
        for (int i = n; i >= 1; i--) {
            // Segitiga pertama (menurun ke bawah)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Cetak spasi di antara kedua segitiga
            System.out.print("     "); // Spasi untuk memisahkan kedua segitiga

            // Segitiga kedua (menurun ke atas)
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}

