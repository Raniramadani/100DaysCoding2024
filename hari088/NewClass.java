package hari088;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        int[] a = {0, 0, 30};
        Scanner sc = new Scanner(System.in);
        System.out.print("x = ");
        int xb = sc.nextInt();
        System.out.print("y = ");
        int yc = sc.nextInt();
        System.out.print("z = ");
        int zd = sc.nextInt();
        a[0] += xb;
        a[1] += yc;
        a[2] += zd;
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
