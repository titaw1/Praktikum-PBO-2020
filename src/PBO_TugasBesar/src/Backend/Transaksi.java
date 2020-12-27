package Backend;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Transaksi {
    private int idTransaksi;
    private String tanggalTransaksi;
    private Kasir kasir;
    private Pembeli pembeli;
     private Obat obat;
    private int jumlah;
    private int totalBiaya;
    
    public int getIdTransaksi(){
        return idTransaksi;
    }
    
    public void setIdTransaksi(int idTransaksi){
        this.idTransaksi = idTransaksi;
    }
    
    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
    
    public Obat getObat(){
        return obat;
    }
    
    public void setObat(Obat obat){
        this.obat = obat;
    }
    
    public Kasir getKasir(){
        return kasir;
    }
    
    public void setKasir(Kasir kasir){
        this.kasir = kasir;
    }
    
    public Pembeli getPembeli(){
        return pembeli;
    }
    
    public void setPembeli(Pembeli pembeli){
        this.pembeli = pembeli;
    }
    
    public int getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    
    public int getTotalBiaya(){
        return totalBiaya;
    }
    
    public void setTotalBiaya(int totalBiaya){
        this.totalBiaya = totalBiaya;
    }
    
    public Transaksi(){
        
    }
    
    public Transaksi (String tanggalTransaksi, Kasir kasir, Pembeli pembeli, Obat obat, int jumlah, int totalBiaya){
        this.tanggalTransaksi = tanggalTransaksi;
        this.kasir = kasir;
        this.pembeli = pembeli;
        this.obat = obat;
        this.jumlah = jumlah;
        this.totalBiaya = totalBiaya;
    }
    
    public Transaksi getById(int id){
        Transaksi tr = new Transaksi();
        String query = "SELECT * FROM transaksi t "
                + "LEFT JOIN kasir k ON t.idkasir = k.idkasir "
                + "LEFT JOIN pembeli p ON p.idpembeli = t.idpembeli "
                + "LEFT JOIN obat o ON o.idobat = t.idobat "
                + "WHERE t.idtransaksi = '" +id+ "'";
        ResultSet rs = DBHelper.selectQuery(query);
        
        try {
            while(rs.next()){
                tr = new Transaksi();
                Kasir ka = new Kasir();
                Pembeli pe = new Pembeli();
                Obat ob = new Obat();
                tr.setKasir(ka);
                tr.setPembeli(pe);
                tr.setObat(ob);
                
                tr.setIdTransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTotalBiaya(rs.getInt("totalbiaya"));
                tr.getKasir().setIdKasir(rs.getInt("idkasir"));
                tr.getKasir().setNamaKasir(rs.getString("namakasir"));
                tr.getKasir().setAlamat(rs.getString("alamat"));
                tr.getKasir().setTelepon(rs.getString("telepon"));
                tr.getKasir().setJabatan(rs.getString("jabatan"));
                tr.getKasir().setGaji(rs.getInt("gaji"));
                tr.getPembeli().setIdPembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNamaPembeli(rs.getString("nama"));
                tr.getPembeli().setAlamat(rs.getString("alamat"));
                tr.getPembeli().setTelepon(rs.getString("telepon"));
                tr.getPembeli().setStatus(rs.getString("status"));
                tr.getPembeli().setIdMember(rs.getInt("idmember"));
                tr.getPembeli().setNoAntri(rs.getInt("nomorantri"));
                tr.getObat().setIdObat(rs.getInt("idobat"));
                tr.getObat().setNamaObat(rs.getString("namaobat"));
                tr.getObat().setRincianObat(rs.getString("rincianobat"));
                tr.getObat().setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                tr.getObat().setHarga(rs.getInt("harga"));
                tr.getObat().setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tr;
    }
    
    public ArrayList<Transaksi> getAll(){
        ArrayList<Transaksi> Transaksi = new ArrayList();
        
        String query = "SELECT * FROM transaksi t "
                + "LEFT JOIN kasir k ON t.idkasir = k.idkasir "
                + "LEFT JOIN pembeli p ON p.idpembeli = t.idpembeli "
                + "LEFT JOIN obat o ON o.idobat = t.idobat ";
        ResultSet rs = DBHelper.selectQuery(query);
                
            try {
                while(rs.next()){
                Transaksi tr = new Transaksi();
                Kasir ka = new Kasir();
                Pembeli pe = new Pembeli();
                Obat ob = new Obat();
                tr.setKasir(ka);
                tr.setPembeli(pe);
                tr.setObat(ob);
                
                tr.setIdTransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTotalBiaya(rs.getInt("totalbiaya"));
                tr.getKasir().setIdKasir(rs.getInt("idkasir"));
                tr.getKasir().setNamaKasir(rs.getString("namakasir"));
                tr.getKasir().setAlamat(rs.getString("alamat"));
                tr.getKasir().setTelepon(rs.getString("telepon"));
                tr.getKasir().setJabatan(rs.getString("jabatan"));
                tr.getKasir().setGaji(rs.getInt("gaji"));
                tr.getPembeli().setIdPembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNamaPembeli(rs.getString("nama"));
                tr.getPembeli().setAlamat(rs.getString("alamat"));
                tr.getPembeli().setTelepon(rs.getString("telepon"));
                tr.getPembeli().setStatus(rs.getString("status"));
                tr.getPembeli().setIdMember(rs.getInt("idmember"));
                tr.getPembeli().setNoAntri(rs.getInt("nomorantri"));
                tr.getObat().setIdObat(rs.getInt("idobat"));
                tr.getObat().setNamaObat(rs.getString("namaobat"));
                tr.getObat().setRincianObat(rs.getString("rincianobat"));
                tr.getObat().setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                tr.getObat().setHarga(rs.getInt("harga"));
                tr.getObat().setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
                Transaksi.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Transaksi;
    }
    
    public ArrayList<Transaksi> search(String keyword){
        ArrayList<Transaksi> Transaksi = new ArrayList();
        
        String query = "SELECT * FROM transaksi t "
                + "LEFT JOIN kasir k ON t.idkasir = k.idkasir "
                + "pembeli p ON p.idpembeli = t.idpembeli "
                + "LEFT JOIN obat o ON o.idobat = t.idobat "
                + "WHERE t.tanggaltransaksi LIKE '%" + keyword + "%'"
                + "OR t.jumlah LIKE '%" + keyword + "%'"
                + "OR t.totalbiaya LIKE '%" + keyword + "%'"
                + "OR k.idkasir LIKE '%" + keyword + "%'"
                + "OR k.namakasir LIKE '%" + keyword + "%'"
                + "OR k.alamat LIKE '%" + keyword + "%'"
                + "OR k.telepon LIKE '%" + keyword + "%'"
                + "OR k.jabatan LIKE '%" + keyword + "%'"
                + "OR k.gaji LIKE '%" + keyword + "%'"
                + "OR p.idpembeli LIKE '%" + keyword + "%'"
                + "OR p.nama LIKE '%" + keyword + "%'"
                + "OR p.alamat LIKE '%" + keyword + "%'"
                + "OR p.telepon LIKE '%" + keyword + "%'"
                + "OR p.status LIKE '%" + keyword + "%'"
                + "OR p.idmember LIKE '%" + keyword + "%'"
                + "OR p.nomorantri LIKE '%" + keyword + "%'"
                + "OR o.idobat LIKE '%" + keyword + "%'"
                + "OR o.idresep LIKE '%" + keyword + "%'"
                + "OR o.namaobat LIKE '%" + keyword + "%'"
                + "OR o.rincianobat LIKE '%" + keyword + "%'"
                + "OR o.jumlahkonsumsi LIKE '%" + keyword + "%'"
                + "OR o.harga LIKE '%" + keyword + "%'"
                + "OR o.tanggalkadaluarsa LIKE '%" + keyword + "%'";
        ResultSet rs = DBHelper.selectQuery(query);
                
        try {
            while(rs.next()){
                Transaksi tr = new Transaksi();
                
                tr.setIdTransaksi(rs.getInt("idtransaksi"));
                tr.setTanggalTransaksi(rs.getString("tanggaltransaksi"));
                tr.setJumlah(rs.getInt("jumlah"));
                tr.setTotalBiaya(rs.getInt("totalbiaya"));
                tr.getKasir().setIdKasir(rs.getInt("idkasir"));
                tr.getKasir().setNamaKasir(rs.getString("namakasir"));
                tr.getKasir().setAlamat(rs.getString("alamat"));
                tr.getKasir().setTelepon(rs.getString("telepon"));
                tr.getKasir().setJabatan(rs.getString("jabatan"));
                tr.getKasir().setGaji(rs.getInt("gaji"));
                tr.getPembeli().setIdPembeli(rs.getInt("idpembeli"));
                tr.getPembeli().setNamaPembeli(rs.getString("nama"));
                tr.getPembeli().setAlamat(rs.getString("alamat"));
                tr.getPembeli().setTelepon(rs.getString("telepon"));
                tr.getPembeli().setStatus(rs.getString("status"));
                tr.getPembeli().setIdMember(rs.getInt("idmember"));
                tr.getPembeli().setNoAntri(rs.getInt("nomorantri"));
                tr.getObat().setIdObat(rs.getInt("idobat"));
                tr.getObat().setNamaObat(rs.getString("namaobat"));
                tr.getObat().setRincianObat(rs.getString("rincianobat"));
                tr.getObat().setJumlahKonsumsi(rs.getString("jumlahkonsumsi"));
                tr.getObat().setHarga(rs.getInt("harga"));
                tr.getObat().setTanggalKadaluarsa(rs.getString("tanggalkadaluarsa"));
                
                Transaksi.add(tr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Transaksi;
    }
    
    public void save(){
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        
         if(getById(idTransaksi).getIdTransaksi() == 0){
             try {
                java.util.Date tanggalTransaksi = format.parse(this.tanggalTransaksi);
                java.sql.Date sqlTanggalTransaksi = new java.sql.Date(tanggalTransaksi.getTime());

             String SQL = "INSERT INTO transaksi (tanggaltransaksi, idkasir, idpembeli, idobat, jumlah, totalbiaya) VALUES("
                    + "'" + sqlTanggalTransaksi + "',"
                    + "'" + this.getKasir().getIdKasir() + "', "
                    + "'" + this.getPembeli().getIdPembeli() + "', "
                    + "'" + this.getObat().getIdObat() + "', "
                    + "'" + this.jumlah + "', "
                    + "'" + this.totalBiaya + "' "
                    + ")";

             this.idTransaksi = DBHelper.insertQueryGetId(SQL);
             } catch (Exception e) {
                 e.printStackTrace();
             }
         } else {
             String SQL = "UPDATE transaksi SET "
                    +"tanggaltransaksi = '" + this.tanggalTransaksi + "', "
                    +"idkasir = '" + this.getKasir().getIdKasir() + "', "
                    +"idpembeli = '" + this.getPembeli().getIdPembeli() + "', "
                    +"idobat = '" + this.getObat().getIdObat() + "', "
                    +"jumlah = '" + this.jumlah + "', "
                    +"totalbiaya = '" + this.totalBiaya + "' "
                    +"WHERE idtransaksi = '" + this.idTransaksi + "' ";
            DBHelper.executeQuery(SQL);
         }
    }
    
    public void delete(){
        String SQL = "DELETE FROM transaksi WHERE idtransaksi = '" + this.idTransaksi + "'";
        DBHelper.executeQuery(SQL);
    }
}
