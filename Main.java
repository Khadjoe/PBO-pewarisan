public class Main {
    public static void main(String[] args) {
        System.out.println("--- Hasil Eksekusi Program ---");
        
        Bentuk b = new Bentuk("Biru");
        BujurSangkar bs = new BujurSangkar(5.0, "Hijau");
        Lingkaran l = new Lingkaran(5.0, "Kuning");
        Silinder s = new Silinder(10.0, 7.0, "Merah");
        
        b.printInfo();
        bs.printInfo();
        l.printInfo();
        s.printInfo();
    }
}