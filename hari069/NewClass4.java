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
public class NewClass4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan = sc.nextInt();
        String hasil = (bilangan > 0) ? "Positif"
                : (bilangan < 0) ? "Negatif" : "Nol";
        System.out.println("Bilangan tersebut adalah: " + hasil);

    }
}
