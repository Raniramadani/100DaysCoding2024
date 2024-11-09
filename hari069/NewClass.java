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
public class NewClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a <= 0) {
            System.out.println("air membeku");
        }else if (a > 0 && a < 100){
            System.out.println("air dalama keadaan cair");
        }else{
            System.out.println("air mendidih");
        }
    }
}
