package hari097;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka x: ");
        int x = scanner.nextInt();
        System.out.print("Masukkan angka y: ");
        int y = scanner.nextInt();

        int total = 0;

        if (x > y) {
            System.out.println("Nilai x harus lebih kecil atau sama dengan nilai y.");
        } else {

            for (int i = x; i <= y; i++) {

                if (i % 2 == 0) {
                    total += i;
                }
            }

            System.out.println("Total penjumlahan bilangan genap dari " + x + " ke " + y + " adalah: " + total);
        }
    }

}
