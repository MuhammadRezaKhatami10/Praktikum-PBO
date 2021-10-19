package TugasOverriding;

public class MainTugasOverriding {

    public static void main(String[] args) {
        Manusia man1 = new Manusia();
        man1.bernafas();
        man1.makan();

        man1 = new Dosen();
        man1.makan();

        man1 = new Mahasiswa();
        man1.makan();

        Mahasiswa mhs = new Mahasiswa();
        mhs.tidur();
        mhs.makan();
    }
}
