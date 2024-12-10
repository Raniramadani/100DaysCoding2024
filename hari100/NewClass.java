package hari100;

import java.time.LocalTime;
import java.util.Scanner;

public class NewClass {
    
    public static void main(String[] args) {
        // Membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Mendapatkan waktu saat ini
        LocalTime waktuSekarang = LocalTime.now();

        // Menentukan salam berdasarkan waktu
        String salam;
        if (waktuSekarang.isBefore(LocalTime.NOON)) {
            salam = "Selamat pagi";
        } else if (waktuSekarang.isBefore(LocalTime.of(17, 0))) {
            salam = "Selamat siang";
        } else {
            salam = "Selamat malam";
        }

        System.out.println("=====================================");
       
        System.out.println("      " + salam + ", " + nama);
        System.out.println("      Program Anda Telah Selesai");
        System.out.println("=====================================");
        scanner.close();
    }
}


