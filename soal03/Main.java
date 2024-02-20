/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal03;

public class Main {
    public static void main(String[] args) {
        // Melakukan inisialisasi karakter '4' dan '6'  
        char k1 = '4';
        char k2 = '6';
        
        // Melakukan konversi ascii karakter
        int asciiKarakter1 = (int) k1;
        int asciiKarakter2 = (int) k2;

        // Melakukan operasi penjumlahan
        int hasilPenjumlahan = asciiKarakter1 + asciiKarakter2;

        System.out.println("Ascii Karakter '4': " + asciiKarakter1);
        System.out.println("Ascii Karakter '6': " + asciiKarakter2);
        System.out.println("Hasil Penjumlahan ASCII: " + hasilPenjumlahan);
    }
}
