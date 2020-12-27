package Backend;

import java.util.ArrayList;
import java.sql.*;

public class Kasir implements IKaryawan {
    
    private int idKasir;
    private String namaKasir;
    private String alamat;
    private String telepon;
    private String jabatan;
    private int gaji;
    
    public int getIdKasir(){
        return idKasir;
    }
    
    public void setIdKasir(int idKasir){
        this.idKasir = idKasir;
    }
    
    public String getNamaKasir(){
        return namaKasir;
    }
    
    public void setNamaKasir(String namaKasir){
        this.namaKasir = namaKasir;
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
    
    public String getJabatan(){
        return jabatan;
    }
    
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    
    public int getGaji(){
        return gaji;
    }
    
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    public Kasir(){
        
    }
    
    public Kasir(String namaKasir, String alamat, String telepon, String jabatan, int gaji){
        this.namaKasir = namaKasir;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    public Kasir getById(int id){
        Kasir ka = new Kasir();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kasir WHERE idkasir = '" + id + "'");
        
        try {
            while(rs.next()){
                ka = new Kasir();
                ka.setIdKasir(rs.getInt("idkasir"));
                ka.setNamaKasir(rs.getString("namakasir"));
                ka.setAlamat(rs.getString("alamat"));
                ka.setTelepon(rs.getString("telepon"));
                ka.setJabatan(rs.getString("jabatan"));
                ka.setGaji(rs.getInt("gaji"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ka;
    }
    
    public ArrayList<Kasir> getAll(){
        ArrayList<Kasir> ListKasir = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM kasir");
        
        try {
            while(rs.next()){
                Kasir ka = new Kasir();
                ka.setIdKasir(rs.getInt("idkasir"));
                ka.setNamaKasir(rs.getString("namakasir"));
                ka.setAlamat(rs.getString("alamat"));
                ka.setTelepon(rs.getString("telepon"));
                ka.setJabatan(rs.getString("jabatan"));
                ka.setGaji(rs.getInt("gaji"));
                
                ListKasir.add(ka);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListKasir;
    }
    
    public ArrayList<Kasir> search(String keyword){
        ArrayList<Kasir> ListKasir = new ArrayList();
        
        String sql = "SELECT * FROM kasir WHERE "
                + "namakasir LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR telepon LIKE '%" + keyword + "%' "
                + "OR jabatan LIKE '%" + keyword + "%' "
                + "OR gaji LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()){
                Kasir ka = new Kasir();
                ka.setIdKasir(rs.getInt("idkasir"));
                ka.setNamaKasir(rs.getString("namakasir"));
                ka.setAlamat(rs.getString("alamat"));
                ka.setTelepon(rs.getString("telepon"));
                ka.setJabatan(rs.getString("jabatan"));
                ka.setGaji(rs.getInt("gaji"));
                
                ListKasir.add(ka);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListKasir;
        
    }
    
    public void save(){
        if(getById(idKasir).getIdKasir() == 0){
            String SQL = "INSERT INTO kasir (namakasir, alamat, telepon, jabatan, gaji) VALUES("
                    + "'" + this.namaKasir + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "', "
                    + "'" + this.jabatan + "', "
                    + "'" + this.gaji + "' "
                    + ")";
            this.idKasir = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE kasir SET "
                    +"namakasir = '" + this.namaKasir + "', "
                    +"alamat = '" + this.alamat + "', "
                    +"telepon = '" + this.telepon + "', "
                    +"jabatan = '" + this.jabatan + "', "
                    +"gaji = '" + this.gaji + "' "
                    +"WHERE idkasir = '" + this.idKasir + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM kasir WHERE idkasir = '" + this.idKasir + "'";
        DBHelper.executeQuery(SQL);
    }

    @Override
    public void infoKaryawan() {
        System.out.println("===============================================");
        System.out.println(" Nama Kasir : " + this.getNamaKasir());
        System.out.println(" Alamat : " + this.getAlamat());
        System.out.println(" Telepon : " + this.getTelepon());
        System.out.println(" Jabatan : " + this.getJabatan());
        System.out.println(" Gaji : " + this.getGaji());
    }
}
