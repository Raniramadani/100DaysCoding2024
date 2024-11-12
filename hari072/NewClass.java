
package hari072;

public class NewClass {
    public static int a(int b) {
        if (b == 0) {
            return 1;
        } else { 
            return b * a(b - 1);
        }
    }

    public static void main(String[] args) {
        int c = 8;
       System.out.println(a(c));
    }
        }

