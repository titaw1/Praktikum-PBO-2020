package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public class Pembeli {
    private int idPembeli;
    private String namaPembeli;
    private String alamat;
    private String telepon;
    private String status;
    private int idMember;
    private int noAntri;
    
    public int getIdPembeli(){
        return idPembeli;
    }
    
    public void setIdPembeli(int idPembeli){
        this.idPembeli = idPembeli;
    }
    
    public String getNamaPembeli(){
        return namaPembeli;
    }
    
    public void setNamaPembeli(String namaPembeli){
        this.namaPembeli = namaPembeli;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    public String getTelepon(){
        return telepon;
    }
    
    public void setTelepon(String telepon){
        this.telepon = telepon;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public int getIdMember(){
        return idMember;
    }
    
    public void setIdMember(int idMember){
        this.idMember = idMember;
    }
    
    public int getNoAntri(){
        return noAntri;
    }
    
    public void setNoAntri(int noAntri){
        this.noAntri = noAntri;
    }
    
    public Pembeli(){
        
    }
    
    public Pembeli (String namaPembeli, String alamat, String telepon, String status, int idMember, int noAntri){
        this.namaPembeli = namaPembeli;
        this.alamat = alamat;
        this.telepon = telepon;
        this.status = status;
        this.idMember = idMember;
        this.noAntri = noAntri;
    }
    
    public Pembeli getById(int id){
        Pembeli pe = new Pembeli();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembeli WHERE idpembeli = '" + id + "'");
        
        try {
            while(rs.next()){
                pe = new Pembeli();
                pe.setIdPembeli(rs.getInt("idpembeli"));
                pe.setNamaPembeli (rs.getString("nama"));
                pe.setAlamat(rs.getString("alamat"));
                pe.setTelepon(rs.getString("telepon"));
                pe.setStatus(rs.getString("status"));
                pe.setIdMember(rs.getInt("idmember"));
                pe.setNoAntri(rs.getInt("nomorantri"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return pe;
    }
    
    public ArrayList<Pembeli> getAll(){
        ArrayList<Pembeli> ListPembeli = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM pembeli");
        
        try {
            while(rs.next()){
                Pembeli pe = new Pembeli();
                pe.setIdPembeli(rs.getInt("idpembeli"));
                pe.setNamaPembeli (rs.getString("nama"));
                pe.setAlamat(rs.getString("alamat"));
                pe.setTelepon(rs.getString("telepon"));
                pe.setStatus (rs.getString("status"));
                pe.setIdMember(rs.getInt("idmember"));
                pe.setNoAntri(rs.getInt("nomorantri"));
                
                ListPembeli.add(pe);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListPembeli;
    }
    
    public ArrayList<Pembeli> search(String keyword){
        ArrayList<Pembeli> ListPembeli = new ArrayList();
        
        String sql = "SELECT * FROM pembeli WHERE "
                + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR telepon LIKE '%" + keyword + "%' "
                + "OR status LIKE '%" + keyword + "%' "
                + "OR idmember LIKE '%" + keyword + "%' "
                + "OR nomorantri LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()){
                Pembeli pe = new Pembeli();
                pe.setIdPembeli(rs.getInt("idpembeli"));
                pe.setNamaPembeli (rs.getString("nama"));
                pe.setAlamat(rs.getString("alamat"));
                pe.setTelepon(rs.getString("telepon"));
                pe.setStatus (rs.getString("status"));
                pe.setIdMember(rs.getInt("idmember"));
                pe.setNoAntri(rs.getInt("nomorantri"));
                
                ListPembeli.add(pe);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListPembeli;
        
    }
    
    public void save(){
        if(getById(idPembeli).getIdPembeli() == 0){
            String SQL = "INSERT INTO pembeli (nama, alamat, telepon, status, idmember, nomorantri) VALUES("
                    + "'" + this.namaPembeli + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "', "
                    + "'" + this.status + "', "
                    + "'" + this.idMember + "', "
                    + "'" + this.noAntri + "' "
                    + ")";
            this.idPembeli = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE pembeli SET "
                    +"nama = '" + this.namaPembeli + "', "
                    +"alamat = '" + this.alamat + "', "
                    +"telepon = '" + this.telepon + "', "
                    +"status = '" + this.status + "' "
                    +"WHERE idpembeli = '" + this.idPembeli + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM pembeli WHERE idpembeli = '" + this.idPembeli + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public void infoPembeli() {
        System.out.println("===============================================");
        System.out.println(" Nama Pembeli : " + this.getNamaPembeli());
        System.out.println(" Alamat : " + this.getAlamat());
        System.out.println(" Telepon : " + this.getTelepon());
        System.out.println(" Status : " + this.getStatus());
        System.out.println(" ID Member : " + this.getIdMember());
        System.out.println(" No Antri : " + this.getNoAntri());
    }
}
