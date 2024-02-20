/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            // Melakukan input tiga bilangan bulat negatif
            System.out.println("Masukkan bilangan bulat negatif pertama:");
            int b1 = scanner.nextInt();
            System.out.println("Masukkan bilangan bulat negatif kedua:");
            int b2 = scanner.nextInt();
            System.out.println("Masukkan bilangan bulat negatif ketiga:");
            int b3 = scanner.nextInt();
            
            // Rumus penjumlahan
            int hasilTambah = b1 + b2 + b3;
            System.out.println("Hasil Penjumlahan: " + hasilTambah);
            
            // Rumus pengurangan
            int hasilKurang = b1 - b2 - b3;
            System.out.println("Hasil Pengurangan: " + hasilKurang);
            
            // Rumus perkalian
            int hasilKali = b1 * b2 * b3;
            System.out.println("Hasil Perkalian: " + hasilKali);
            
            // Rumus pembagian
            // jika ada pembagian dengan 0 maka tampilkan keterangan tidak bisa dibagi
            if (b2 != 0 && b3 != 0) {
                double hasilBagi = (double) b1 / b2 / b3;
                System.out.println("Hasil Pembagian: " + hasilBagi);
            } else {
                System.out.println("Tidak bisa melakukan pembagian karena terdapat pembagian dengan nol.");
            }
        }
    }
    
}
