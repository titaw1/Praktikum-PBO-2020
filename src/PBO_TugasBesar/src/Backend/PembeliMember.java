package Backend;

public class PembeliMember extends Pembeli {
    
    private int idMember;
    
    public int getIdMember(){
        return idMember;
    }
    
    public void setIdMember(int idMember){
        this.idMember = idMember;
    }
    
    public PembeliMember(){
        
    }
    
    public PembeliMember(String namaPembeli, String alamat, String telepon, String status, int idMember){
        this.setNamaPembeli(namaPembeli);
        this.setAlamat(alamat);
        this.setTelepon(telepon);
        this.setStatus(status);
        this.idMember = idMember;
    }
    
    public void infoPembeli() {
        super.infoPembeli();
        System.out.println(" ID Member : " + idMember );
    }
}
