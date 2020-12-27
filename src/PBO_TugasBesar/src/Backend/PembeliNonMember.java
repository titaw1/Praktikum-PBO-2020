package Backend;

public class PembeliNonMember extends Pembeli {
    
    private int noAntri;
    
    public int getNoAntri(){
        return noAntri;
    }
    
    public void setNoAntri(int noAntri){
        this.noAntri = noAntri;
    }
    
    public PembeliNonMember(){
        
    }
    
    public PembeliNonMember(String namaPembeli, String alamat, String telepon, String status, int noAntri){
        this.setNamaPembeli(namaPembeli);
        this.setAlamat(alamat);
        this.setTelepon(telepon);
        this.setStatus(status);
        this.noAntri = noAntri;
    }
    
    public void infoPembeli() {
        super.infoPembeli();
        System.out.println(" No Antrian : " + noAntri );
    }
    
}
