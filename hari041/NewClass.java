package hari041;

import static java.lang.Math.PI;
import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jari-jari: ");
        int jariJari = sc.nextInt();
        System.out.print("Input satuan: ");
        String satuan = sc.next();
        System.out.println("==================== HASIL ====================");
        float keliling = (float) (2 * PI * jariJari);
        float luas = (float) (PI * jariJari * jariJari);
        System.out.println("Jari-jari   : " + jariJari + " " + satuan);
        System.out.println("Keliling    : "+ keliling +" " + satuan);
        System.out.println("Luas        : "+ luas + " "+ satuan + "^2");

    }
}
