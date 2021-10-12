package Tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        OrangTua ayah = new OrangTua("Nobisuke Nobi", 30);
        OrangTua ibu = new OrangTua("Tamako Katako", 25);
        Anak a = new Anak("Nobita");
        Sekolah s = new Sekolah(10, ayah, ibu);
        s.setAnak(a, 10);        
        s.setTeman("Takesi");
        s.setTeman("Suneo");
        s.setTeman("Sizuka");
        s.setTeman("Doraemon");
        s.setTeman("Dorami");
        s.setTeman("Aldebaran");
        s.setTeman("Lukman");
        s.setTeman("Rozak");
        s.setTeman("Maimunah");
        s.setTeman("Supri");        
        System.out.println(s.info());
    }
}
