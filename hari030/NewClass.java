package hari030;
import java.math.BigDecimal;
public class NewClass {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("15.0");
        BigDecimal b = new BigDecimal("15.0");
        System.out.println(a.add(b));
        System.out.println(b.equals(a));
    }
    
}
