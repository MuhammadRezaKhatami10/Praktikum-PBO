/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfacelatihan;

/**
 *
 * @author boy
 */
public class MahasiswaCumlaude {
    public static void main(String[] args) {
       Direktur DirekturPolinema = new Direktur();
       
       Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
       Sarjana sarjanaCumlaude = new Sarjana("Dini");
       PascaSarjana masterCumlaude = new PascaSarjana("Elok");
       
      // DirekturPolinema.beriSertifikatCumlaude(sarjanaCumlaude);
      // DirekturPolinema.beriSertifikatCumlaude(masterCumlaude);
       
       DirekturPolinema.beriSertifikatMawapres(masterCumlaude);
       DirekturPolinema.beriSertifikatMawapres(sarjanaCumlaude);
    }
}
