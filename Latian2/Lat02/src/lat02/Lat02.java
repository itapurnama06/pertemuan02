package lat02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author LAB F
 * tgl: 2024-093-25
 */
public class Lat02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader dtIN = new BufferedReader(new InputStreamReader(System.in));
       
       String nama="";
       
       System.out.print("Tuliskan Nama: ");
       try{
            nama = dtIN.readLine();
       }catch(IOException e){
           System.out.println("Terjadi masalah saat mengambil data");
       }
       
       System.out.println("Isi Variabel nama: "+nama);
    }
    
}
