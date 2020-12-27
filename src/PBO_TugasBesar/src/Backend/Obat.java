package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Obat extends ResepObat{
    
    private int idObat;
    private String namaObat;
    private int harga;
    private String tanggalKadaluarsa;
    
    
    public int getIdObat(){
        return idObat;
    }
    
    public void setIdObat(int idObat){
        this.idObat = idObat;
    }
    
    public String getNamaObat(){
        return namaObat;
    }
    
    public void setNamaObat(String namaObat){
        this.namaObat = namaObat;
    }
    
    public int getHarga(){
        return harga;
    }
    
    public void setHarga(int harga){
        this.harga = harga;
    }
    
    public String getTanggalKadaluarsa() {
        return tanggalKadaluarsa;
    }

    public void setTanggalKadaluarsa(String tanggalKadaluarsa) {
        this.tanggalKadaluarsa = tanggalKadaluarsa;
    }
    
    public Obat(){
        
    }
    
    public Obat(String namaObat, String rincianObat, String jumlahKonsumsi, int harga, String tanggalKadaluarsa){
        this.namaObat = namaObat;
        this.harga = harga;
        this.tanggalKadaluarsa = tanggalKadaluarsa;
        this.rincianObat = rincianObat;
        this.jumlahKonsumsi = jumlahKonsumsi;
    }
    
    public Obat getById(int id){
        Obat ob = new Obat();
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat WHERE idobat = '" + id + "'");
        
        try {
            while(rs.next()){
                ob = new Obat();
                ob.setIdObat(rs.getInt("idobat"));
                ob.setNamaObat(rs.getString("namaobat"));
                ob.setRincianObat(rs.getString("rincianobat"));
                ob.setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                ob.setHarga(rs.getInt("harga"));
                ob.setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ob;
    }
    
    public ArrayList<Obat> getAll(){
        ArrayList<Obat> ListObat = new ArrayList();
        
        ResultSet rs = DBHelper.selectQuery("SELECT * FROM obat");
        
        try {
            while(rs.next()){
                Obat ob = new Obat();
                ob.setIdObat(rs.getInt("idobat"));
                ob.setNamaObat(rs.getString("namaobat"));
                ob.setRincianObat(rs.getString("rincianobat"));
                ob.setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                ob.setHarga(rs.getInt("harga"));
                ob.setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
                
                ListObat.add(ob);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return ListObat;
    }
    
    public ArrayList<Obat> search(String keyword){
        ArrayList<Obat> ListObat = new ArrayList();
        
        String sql = "SELECT * FROM obat WHERE "
                + "namaobat LIKE '%" + keyword + "%' "
                + "OR rincianobat LIKE '%" + keyword + "%' "
                + "OR jumlahkonsumsi LIKE '%" + keyword + "%' "
                + "OR harga LIKE '%" + keyword + "%' "
                + "OR tanggalkadaluarsa LIKE '%" + keyword + "%' ";
        
        ResultSet rs = DBHelper.selectQuery(sql);
        
        try {
            while(rs.next()){
                Obat ob = new Obat();
                ob.setIdObat(rs.getInt("idobat"));
                ob.setNamaObat(rs.getString("namaobat"));
                ob.setRincianObat(rs.getString("rincianobat"));
                ob.setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                ob.setHarga(rs.getInt("harga"));
                ob.setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
                
                ListObat.add(ob);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return ListObat;
        
    }
    
    public void save(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
        if(getById(idObat).getIdObat() == 0){
            try {
                java.util.Date tanggalKadaluarsa = format.parse(this.tanggalKadaluarsa);
                java.sql.Date sqlTanggalKadaluarsa = new java.sql.Date(tanggalKadaluarsa.getTime());

             String SQL = "INSERT INTO obat (namaobat, rincianobat, jumlahkonsumsi, harga, tanggalkadaluarsa) VALUES("
                    + "'" + this.namaObat + "', "
                    + "'" + this.rincianObat + "', "
                    + "'" + this.jumlahKonsumsi + "', "
                    + "'" + this.harga + "', "
                    + "'" + sqlTanggalKadaluarsa + "' "
                    + ")";
             this.idObat = DBHelper.insertQueryGetId(SQL);
             
            } catch (Exception e) {
                 e.printStackTrace();
            }
        } else {
             String SQL = "UPDATE obat SET "
                    + "namaobat = '" + this.namaObat + "', "
                    + "rincianobat = '" +this.rincianObat+ "', "
                    + "jumlahkonsumsi = '" +this.jumlahKonsumsi+ "', "
                    + "harga = '" + this.harga + "', "
                    +"tanggalkadaluarsa = '" + this.tanggalKadaluarsa + "'"
                     +"WHERE idobat = '" + this.idObat + "'";
            DBHelper.executeQuery(SQL);
         }
    }
    
    public void delete(){
        String SQL = "DELETE FROM obat WHERE idobat = '" + this.idObat + "'";
        DBHelper.executeQuery(SQL);
    }
    
    public void infoObat() {
        System.out.println("===============================================");
        System.out.println(" Nama Obat : " + this.getNamaObat());
        System.out.println(" Rincian Obat : "+this.getRincianObat());
        System.out.println(" Jumlah Konsumsi : "+this.getJumlahKonsumsi());
        System.out.println(" Harga : " + this.getHarga());
        System.out.println(" Tanggal Kadaluarsa : " + this.getTanggalKadaluarsa());
    }

    @Override
    public String getRincianObat() {
        return this.rincianObat;
    }

    @Override
    public void setRincianObat(String rincianObat) {
        this.rincianObat = rincianObat;
    }

}

