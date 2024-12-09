
package hari099;

import java.util.Scanner;

public class NewClass {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menampilkan menu kepada pengguna
        System.out.println("Kalkulator Sederhana");
        System.out.println("Pilih operasi:");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.print("Masukkan pilihan (1/2/3/4): ");
        int pilihan = input.nextInt();


        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        double hasil = 0;
        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                System.out.println("Hasil penjumlahan: " + hasil);
                break;
            case 2:
                hasil = angka1 - angka2;
                System.out.println("Hasil pengurangan: " + hasil);
                break;
            case 3:
                hasil = angka1 * angka2;
                System.out.println("Hasil perkalian: " + hasil);
                break;
            case 4:
                // Menangani pembagian dengan pengecekan pembagi tidak sama dengan 0
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil pembagian: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan 0 tidak diperbolehkan.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        input.close();
    }
}


