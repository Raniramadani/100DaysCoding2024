package hari022;

public class NewClass {

    public static void main(String[] args) {
        int a = 23;
        int b = 22;
        int result = Integer.compare(a, b);
        Integer objA = a;
        int hashCodeA = objA.hashCode();
        System.out.println(result);
        System.out.println(hashCodeA);
    }
}
