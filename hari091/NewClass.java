package hari091;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();
        if (nama.equalsIgnoreCase("rany")) {
            System.out.println("Hii.. rany!");
        } else if (nama.equalsIgnoreCase("raisya")) {
            System.out.println("Hi.. raisay");
        } else {
            System.out.println("Nama tidak dikenali");
        }

    }
}
