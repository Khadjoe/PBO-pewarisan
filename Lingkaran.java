public class Lingkaran extends Bentuk{
    double radius;

    Lingkaran(double radius, String warna){
        super(warna);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double r) {
        this.radius = r;
    }

    public double hitungLuas(){
        return Math.PI * radius * radius;
    }

    public void printInfo() {
        System.out.println("Lingkaran " + super.warna + ", luas = " + this.hitungLuas());
    }
}