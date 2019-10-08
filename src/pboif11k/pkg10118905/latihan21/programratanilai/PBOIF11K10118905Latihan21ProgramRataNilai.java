/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan21.programratanilai;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina FItriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi:Program Menghitung Rata-rata Nilai
 */
public class PBOIF11K10118905Latihan21ProgramRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Masukkan Banyak Mahasisw:");
        Scanner scanner = new Scanner(System.in);
        int jmlMahasiswa = scanner.nextInt();
        float totNilai = 0;
        
        for (int i = 1; i<= jmlMahasiswa; i ++){
            System.out.println(String.format("Nilai Mahasiswa ke-%d :", i));
            Scanner ascanner = new Scanner(System.in);
            float nilai = scanner.nextInt();
            totNilai += nilai;
        }
        
        System.out.println(String.format(Locale.US,"Maka, nilai Rata-rata nilainya adalah %.1f",  totNilai / jmlMahasiswa));
        System.out.println("Developed by : Anindira Dina Fitriani");
    }
    
}
