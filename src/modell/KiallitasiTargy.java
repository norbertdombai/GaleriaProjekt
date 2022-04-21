
package modell;


import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


public abstract class KiallitasiTargy {
    String keszto;
    String cim;
    String letrehozas;
    
    public static void main(String args[]) {
      Date letrehozas = new Date( );
      SimpleDateFormat ft = 
      new SimpleDateFormat ("yyyy.MM.dd");
   }

    public String getKeszto() {
        return keszto;
    }

    public String getCim() {
        return cim;
    }

    public String getLetrehozas() {
        return letrehozas;
    }

   
    
    
}
