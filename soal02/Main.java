/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal02;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Melakukan input jumlah uang
        System.out.print("Masukkan jumlah uang: ");
        int uang = scanner.nextInt();
        
        // Memeriksa apakah pasangan tidak ada kelas kuliah
        System.out.print("Apakah pasangan Anda sedang tidak ada kelas kuliah? (y/n): ");
        String input = scanner.next();
        boolean tidakAdaKelasKuliah = input.equalsIgnoreCase("y");
        
        // Melakukan validasi apakah semua kondisi terpenuhi
        if (uang > 10000 && tidakAdaKelasKuliah) {
            System.out.println("Anda akan keluar membeli migacoan.");
        } else {
            System.out.println("Anda tidak akan keluar membeli migacoan.");
        }
        
        scanner.close();
    }
}
