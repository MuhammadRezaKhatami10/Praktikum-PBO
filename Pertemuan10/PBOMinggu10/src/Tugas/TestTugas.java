package Tugas;

public class TestTugas {
    public static void main(String[] args) {
        
        Singa sg = new Singa("Singa", 4, "HarrHarrrHarr", "Kuning Keemasaan");
        Keledai kd = new Keledai("Keledai", 4, "Ngiokngiook", "Coklat");
        Gorilla gr = new Gorilla("Gorila", 2, "huuhuuhuu", "Hitam dan Putih");
        
        System.out.println("-------------------------------------------------");
        sg.displayData();
        sg.displayMakan();
        sg.displayBinatang();
        System.out.println("-------------------------------------------------");
        
        kd.displayData();
        kd.displayMakan();
        kd.displayBinatang();
        System.out.println("-------------------------------------------------");
        
        gr.displayData();
        gr.displayMakan();
        gr.displayBinatang();
        System.out.println("-------------------------------------------------");
    }
}
