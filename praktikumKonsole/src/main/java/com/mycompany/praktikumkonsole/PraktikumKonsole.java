/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumkonsole;
import java.util.Scanner;

/**
 *
 * @author intan
 */
public class PraktikumKonsole {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka yang ingin Anda masukkan: ");
        int n = scanner.nextInt();
        
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            int angka = scanner.nextInt();
            
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap");
                jumlahGenap += angka;
            } else {
                System.out.println(angka + " adalah bilangan ganjil");
                jumlahGanjil += angka;
            }
        }
        
        System.out.println("Jumlah bilangan genap: " + jumlahGenap);
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
        
        scanner.close();
    }
}

    

