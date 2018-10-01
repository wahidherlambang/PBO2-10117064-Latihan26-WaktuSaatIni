/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan26.waktusaatini;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk mengetahui 
 * waktu saat ini.
 */
import java.util.*;
import java.text.*;
public class PBO210117064Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date hariSekarang = new Date();
        SimpleDateFormat ft = new 
        SimpleDateFormat("EEEE, d MMM yyyy " + "hh:mm:ss");
         System.out.println("Hari ini adalah hari : " 
                 + ft.format(hariSekarang));
    }
    
}
