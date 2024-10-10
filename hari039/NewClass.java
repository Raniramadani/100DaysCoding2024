package hari039;

import java.util.Scanner;

public class NewClass {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();    
        int b = sc.nextInt();
        a = a % b;
        b = b % a;
        System.out.println(a); 
        System.out.println(b);

    }
}
