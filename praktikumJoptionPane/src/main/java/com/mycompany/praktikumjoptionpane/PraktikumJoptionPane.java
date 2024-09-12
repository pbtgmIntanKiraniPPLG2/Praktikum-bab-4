/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumjoptionpane;
import javax.swing.JOptionPane;

/**
 *
 * @author intan
 */
public class PraktikumJoptionPane {

    
    public static void main(String[] args) {
        String inputN = JOptionPane.showInputDialog("Masukkan jumlah angka yang ingin Anda masukkan:");
        int n = Integer.parseInt(inputN);
        
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        
        for (int i = 1; i <= n; i++) {
            String inputAngka = JOptionPane.showInputDialog("Masukkan angka ke-" + i + ":");
            int angka = Integer.parseInt(inputAngka);
            
            if (angka % 2 == 0) {
                JOptionPane.showMessageDialog(null, angka + " adalah bilangan genap");
                jumlahGenap += angka;
            } else {
                JOptionPane.showMessageDialog(null, angka + " adalah bilangan ganjil");
                jumlahGanjil += angka;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Jumlah bilangan genap: " + jumlahGenap);
        JOptionPane.showMessageDialog(null, "Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}


