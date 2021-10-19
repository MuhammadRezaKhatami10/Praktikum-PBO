package TugasOverloading;

public class MainTugasOverloading {
    
    public static void main(String[] args) {
        Segitiga sgt1 = new Segitiga();
        System.out.println("Sudut Pertama : " + sgt1.totalSudut(10));
        System.out.println("Sudut Kedua : " + sgt1.totalSudut(6, 10));
        System.out.println("Keliling Segitiga Pertama : " + sgt1.keliling(10, 20, 15));
        System.out.println("Keliling Segitiga Kedua : " + sgt1.keliling(3, 4));
    }
}
