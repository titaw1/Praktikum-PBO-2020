package interfacelatihan;


import interfacelatihan.Mahasiswa;
import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

/**
 *
 * @author tita
 */
public class interfacemain {
    public static void main(String[] args) {
        Rektor pakrektor = new Rektor();
        
        Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        
        pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        pakrektor.beriSertifikatCumlaude(masterCumlaude);
     
    }
}