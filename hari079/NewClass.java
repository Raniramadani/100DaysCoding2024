package hari079;
class a {
    private String nama;  
    public a(String nama) {
        this.nama = nama;
    }
    @Override
    public String toString() {
        return "nama: "+nama ; 
    }
}

public class NewClass {
    public static void main(String[] args) {
        a b = new a("Rany");
        System.out.println(b.toString()); 
    }
}
