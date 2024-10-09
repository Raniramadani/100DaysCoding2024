/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hari038;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("masukan angka1: ");
        int a = sc.nextInt();
        System.out.print("masukan angka2: ");
        int b = sc.nextInt();
        System.out.println(a *= b);
        System.out.println(b /= a);
    }
}
