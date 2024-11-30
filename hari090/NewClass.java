package hari090;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nilai Awal: ");
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int x = Integer.parseInt(b[0]);
        int y = Integer.parseInt(b[1]);
        int z = Integer.parseInt(b[2]);

        System.out.print("Pengendalian: ");
        String c = sc.nextLine();

        for (int i = 0; i < c.length(); i++) {
            char d = c.charAt(i);

            if (d == 'a') {
                x -= 5; 
            } else if (d == 'D') {
                x += 5; 
            } else if (d == 'R') {
                y += 5; 
            } else if (d == 'E') {
                y -= 5; 
            } else if (d == 'W') {
                z += 5; 
                if (z > 40) {
                    z = 40;
                }
            } else if (d == 's') {
                z -= 5; 
            }

            if (z <= 0) {
                System.out.println("Pesawat jatuh! Posisi akhir: " + x + " " + y + " " + z);
                return;
            }
        }

        System.out.println("Posisi: " + x + " " + y + " " + z);
    }
}
