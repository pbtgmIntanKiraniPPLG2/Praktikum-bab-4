/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segitigaberdampingan;
import javax.swing.*;
/**
 *
 * @author intan
 */
public class SegitigaBerdampingan {

   
    public static void main(String[] args) {
        // Input angka dari pengguna
        String angka = JOptionPane.showInputDialog("Masukkan Angka Yang Anda Inginkan: ");
        int n = Integer.parseInt(angka);
        
        // Pola Segitiga Ganda Berdampingan
        System.out.println("Pola Segitiga Ganda Berdampingan");
        for (int i = n; i >= 1; i--) {
            // Cetak segitiga pertama
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // Cetak spasi di antara dua segitiga
            System.out.print(" ");
            
            // Cetak segitiga kedua
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}


