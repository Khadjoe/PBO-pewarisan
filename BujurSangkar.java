public class BujurSangkar extends Bentuk{
    double sisi;

    public BujurSangkar(double sisi, String warna){
        super(warna);
        this.sisi = sisi;
    }

    public double getSisi() {
        return this.sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double hitungLuas() {
        return this.sisi * this.sisi;
    }

    public void printInfo() {
        System.out.println("Bujursangkar berwarna " + super.warna + ", luas = " + this.hitungLuas());
    }
}