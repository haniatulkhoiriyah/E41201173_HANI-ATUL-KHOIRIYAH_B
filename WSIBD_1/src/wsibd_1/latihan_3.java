/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsibd_1;
class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        this.judul = judul;
        this.jumlah = jumlah;
    }
    
    public void showInfoBuku() {
        System.out.println("Informasi Buku");
        System.out.println("Judul : " +judul);
        System.out.println("Jumlah :" +jumlah);
    }
}

public class latihan_3 {
    public static void main (String[] args) {
        buku bl = new buku();
        bl.setInfoBuku("JAVA TUTORIAL", 200);
        bl.showInfoBuku();
    }
}
