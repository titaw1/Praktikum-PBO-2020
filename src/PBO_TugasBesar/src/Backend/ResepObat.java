package Backend;

import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class ResepObat {
    public String rincianObat;
    public String jumlahKonsumsi;

    public abstract String getRincianObat();
    
    public abstract void setRincianObat(String rincianObat);
    
    public String getJumlahKonsumsi(){
        return this.jumlahKonsumsi;
    }
    
    public void setJumlahKonsumsi(String jumlahKonsumsi){
        this.jumlahKonsumsi = jumlahKonsumsi;
    }

}