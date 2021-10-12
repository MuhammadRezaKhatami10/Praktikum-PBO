package tugasjs3;

public class Lingkaran {

    public double phi, r;

    public void TampilDataLingkaran() {
        System.out.println("----------------------------------------------");
        System.out.println("-----------------DATA LINGKARAN---------------");
        System.out.println("----------------------------------------------");
        System.out.println("Nilai PHI          : " + phi);
        System.out.println("Nilai r            : " + r);
        System.out.println("Luas Lingkaran     : " + hitungLuas());
        System.out.println("Keliling Lingkaran : " + hitungKeliling());
        System.out.println("----------------------------------------------");
    }

    public double hitungLuas() {
        return r * r * phi;
    }

    public double hitungKeliling() {
        return 2 * r * phi;
    }
}
