/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan45;

import java.util.Scanner;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
public class Latihan45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Printer p = new Printer();
        Scanner sc = new Scanner(System.in);
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukkan nama anda : ");
        String nama = sc.nextLine();
        System.out.print("Mau cetak nama berapa kali ? : ");
        int jmlCetak = sc.nextInt();
        p.cetak(nama);
        p.cetak(jmlCetak, nama);
    }

}
