package hari071;

public class NewClass {
    static int angka = 10;
    public static void a() {
    }
    public static int jumlah(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        a();

        int hasil = jumlah(5, 7);
        System.out.println(hasil);
        System.out.println(angka);
    }
}


