/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hari093;

/**
 *
 * @author ACER
 */
public class NewClass {
    public static void main(String[] args) {
        
    
     int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            if (i > 0) {
                for (int j = 0; j < (i - 1) * 2 + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
}
}
}