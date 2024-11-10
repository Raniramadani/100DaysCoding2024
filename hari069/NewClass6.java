/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hari069;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class NewClass6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka n: ");
        int a = sc.nextInt();
        System.out.print("Masukkan: " + a );
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < a; i++) {
            int angka = sc.nextInt();
            if (angka > b) {
                b = angka;
            }
        }

        System.out.println(b);

    }
}
