package Backend;

import java.util.ArrayList;
import java.sql.*;

public class Apoteker implements IKaryawan {
    
    private int idApoteker;
    private String namaApoteker;
    private String alamat;
    private String telepon;
    private String jabatan;
    private int gaji;
    
    public int getIdApoteker() {
        return idApoteker;
    }
    
    public void setIdApoteker(int idApoteker){
        this.idApoteker = idApoteker;
    }
    
    public String getNamaApoteker(){
        return namaApoteker;
    }
    
    public void setNamaApoteker(String namaApoteker){
        this.namaApoteker = namaApoteker;
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
    
    public Apoteker(){
        
    }
    
    public Apoteker(String namaApoteker, String alamat, String telepon, String jabatan, int gaji){
        this.namaApoteker = namaApoteker;
        this.alamat = alamat;
        this.telepon = telepon;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }
    
    public Apoteker getById(int id){
        Apoteker ap = new Apoteker();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM apoteker WHERE idapoteker = '" + id + "'");
        
        try {
            while(rs.next()){
                ap = new Apoteker();
                ap.setIdApoteker(rs.getInt("idapoteker"));
                ap.setNamaApoteker(rs.getString("nama"));
                ap.setAlamat(rs.getString("alamat"));
                ap.setTelepon(rs.getString("telepon"));
                ap.setJabatan(rs.getString("jabatan"));
                ap.setGaji(rs.getInt("gaji"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ap;
    }
    
    public ArrayList<Apoteker> getAll(){
        ArrayList<Apoteker> ListApoteker = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM apoteker");
        
        try {
            while(rs.next()){
                Apoteker ap = new Apoteker();
                ap.setIdApoteker(rs.getInt("idapoteker"));
                ap.setNamaApoteker(rs.getString("nama"));
                ap.setAlamat(rs.getString("alamat"));
                ap.setTelepon(rs.getString("telepon"));
                ap.setJabatan(rs.getString("jabatan"));
                ap.setGaji(rs.getInt("gaji"));
                
                ListApoteker.add(ap);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListApoteker;
    }
    
    public ArrayList<Apoteker> search(String keyword){
        ArrayList<Apoteker> ListApoteker = new ArrayList();
        
        String sql = "SELECT * FROM apoteker WHERE "
                + "nama LIKE '%" + keyword + "%' "
                + "OR alamat LIKE '%" + keyword + "%' "
                + "OR telepon LIKE '%" + keyword + "%' "
                + "OR jabatan LIKE '%" + keyword + "%' "
                + "OR gaji LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()){
                Apoteker ap = new Apoteker();
                ap.setIdApoteker(rs.getInt("idapoteker"));
                ap.setNamaApoteker(rs.getString("nama"));
                ap.setAlamat(rs.getString("alamat"));
                ap.setTelepon(rs.getString("telepon"));
                ap.setJabatan(rs.getString("jabatan"));
                ap.setGaji(rs.getInt("gaji"));
                
                ListApoteker.add(ap);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListApoteker;
        
    }
    
    public void save(){
        if(getById(idApoteker).getIdApoteker() == 0){
            String SQL = "INSERT INTO apoteker (nama, alamat, telepon, jabatan, gaji) VALUES("
                    + "'" + this.namaApoteker + "', "
                    + "'" + this.alamat + "', "
                    + "'" + this.telepon + "', "
                    + "'" + this.jabatan + "', "
                    + "'" + this.gaji + "' "
                    + ")";
            this.idApoteker = DBHelper.insertQueryGetId(SQL);
        }
        else {
            String SQL = "UPDATE apoteker SET "
                    +"nama = '" + this.namaApoteker + "', "
                    +"alamat = '" + this.alamat + "', "
                    +"telepon = '" + this.telepon + "', "
                    +"jabatan = '" + this.jabatan + "', "
                    +"gaji = '" + this.gaji + "' "
                    +"WHERE idapoteker = '" + this.idApoteker + "'";
            DBHelper.executeQuery(SQL);
        }
    }
    
    public void delete(){
        String SQL = "DELETE FROM apoteker WHERE idapoteker = '" + this.idApoteker + "'";
        DBHelper.executeQuery(SQL);
    }

    @Override
    public void infoKaryawan() {
        System.out.println("===============================================");
        System.out.println(" Nama Apoteker : " + this.getNamaApoteker());
        System.out.println(" Alamat : " + this.getAlamat());
        System.out.println(" Telepon : " + this.getTelepon());
        System.out.println(" Jabatan : " + this.getJabatan());
        System.out.println(" Gaji : " + this.getGaji());
    }
}
