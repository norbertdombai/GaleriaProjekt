
package modell;

import java.io.File;


public class Festmeny {
    
 public static void main(String[] args) {
        File file = new File("kep.txt");
        File directory = new File("C:\\SZÁMALK\\GaleriaProjekt\\");

         if(file.isFile()){
                    System.out.println(file + "megejelnítés folyamatban");
                }else{
                     System.out.println(file + "nem lehet megjeleníteni");
                }

  
}

    Festmeny() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
