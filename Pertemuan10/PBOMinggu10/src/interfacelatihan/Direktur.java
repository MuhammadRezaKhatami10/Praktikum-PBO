package interfacelatihan;

public class Direktur {

    public void beriSertifikatCumlaude(ICumlaude mahasiswa) {
        System.out.println("-------------------------------------------");
        System.out.println("Saya DIREKTUR, memerikan sertifikat cumlaude.");
        System.out.println("Selamat! silahkan perkenalkan diri Anda..");

        mahasiswa.lulus();
        mahasiswa.meraihIPKTinggi();
        System.out.println("-------------------------------------------");
    }

    public void beriSertifikatMawapres(IBerprestasi mahasiswa) {
        System.out.println("----------------------------------------------");
        System.out.println("Saya DIREKTUR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi ?");

        mahasiswa.menjuaraiKompetisi();
        mahasiswa.membuatPublikasiIlmiah();

        System.out.println("----------------------------------------------");
    }
}
