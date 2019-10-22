/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan45;

/**
 *
 * @author lutfi
 * NAMA : LUTFI RAMADHAN
 * NIM  : 10118908
 * KELAS : IF 11 KARYAWAN
 */
class Printer {
    private int jmlCetak;
    private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama){
        System.out.println("Nama Anda : "+nama);
    }
    
    public void cetak(int jmlCetak, String nama){
        this.jmlCetak = jmlCetak;
        this.nama = nama;
        System.out.println("Hasil Cetak :");
        for (int i = 0; i < this.jmlCetak; i++) {
            System.out.println((i+1)+". "+this.nama);
        }
    }
}
