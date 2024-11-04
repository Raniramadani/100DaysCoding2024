package hari064;

public class NewClass {
    public static void main(String[] args) {
        a: 
        for (int i = 2; i < 15; i++) {
            System.out.println(i);
            for (int j = 3; j < 10; j++) {
                System.out.println(j);
                    break a; 
                }
            }
        }
    }


