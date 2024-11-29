package hari089;

import java.util.Scanner;

public class NewClass {

    public static class PosisiPesawat {

        static int[] a = new int[3];

        public static void b(String arah, int nilai) {
            if (arah.equalsIgnoreCase("kanan")) {
                a[0] += nilai;
            } else if (arah.equalsIgnoreCase("kiri")) {
                a[0] -= nilai;
            }
        }

        public static void c(String arah, int nilai) {
            if (arah.equalsIgnoreCase("maju")) {
                a[1] += nilai;
            } else if (arah.equalsIgnoreCase("mundur")) {
                a[1] -= nilai;
            }
        }

        public static void d(String arah, int nilai) {
            if (arah.equalsIgnoreCase("naik")) {
                a[2] += nilai;
            } else if (arah.equalsIgnoreCase("turun")) {
                a[2] -= nilai;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("nilai awal : ");
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();

            sc.nextLine();

            System.out.print("x : ");
            String[] e = sc.nextLine().split(" ");
            b(e[0], Integer.parseInt(e[1]));

            System.out.print("y : ");
            String[] f = sc.nextLine().split(" ");
            c(f[0], Integer.parseInt(f[1]));

            System.out.print("z : ");
            String[] g = sc.nextLine().split(" ");
            d(g[0], Integer.parseInt(g[1]));

            System.out.println("x = " + a[0]);
            System.out.println("y = " + a[1]);
            System.out.println("z = " + a[2]);

            System.out.println("Posisi pesawat di " + a[0] + ", " + a[1] + ", " + a[2]);
        }
    }
}
