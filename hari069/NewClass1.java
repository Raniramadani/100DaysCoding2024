
package hari069;

import java.util.Scanner;

public class NewClass1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a < 0 && b < 0) {
        } else if (a < 0 || b < 0) {
            System.out.println("Salah satu bilangan bernilai negatif");
        } else {
            System.out.println("Kedua bilangan bernilai positif");
        }

    }
}
