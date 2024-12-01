package hari091;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("masukkan inputan : ");
        String nama = scanner.nextLine();
        if (nama.equalsIgnoreCase("you")) {
            System.out.println("kamu dan aku");
        } else if (nama.equalsIgnoreCase("I")) {
            System.out.println("aku dan kamu");
        } else {
            System.out.println("tidak ada");
        }

    }
}
