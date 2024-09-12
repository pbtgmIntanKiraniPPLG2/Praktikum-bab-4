/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumbreak;

/**
 *
 * @author intan
 */
public class Praktikumbreak {

    public static void main(String[] args) {
        for (int angka = 0; angka < 10; angka++) {
            if (angka == 3) {
                continue;  // Lewati iterasi jika angka adalah 3
            }
            if (angka == 7) {
                break;  // Hentikan perulangan jika angka adalah 7
            }
            System.out.println(angka);
        }
    }
}

    

