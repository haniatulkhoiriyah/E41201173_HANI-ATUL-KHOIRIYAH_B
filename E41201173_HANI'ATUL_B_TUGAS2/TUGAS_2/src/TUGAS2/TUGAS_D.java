/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

import java.util.Scanner;
public class TUGAS_D {
      public static void main(String[] args) {
       int harga1, harga2, harga3, harga4, harga5;
       String total;
       String nama;
       
       Scanner cc=new Scanner (System.in);
       
        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza < KAP >        ");
        System.out.println("         Promo Belanja Berhadiah            ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama      ");
        System.out.println("      Dengan harga minimum Rp 1000,00       ");
        System.out.println("--------------------------------------------");
       
        System.out.print("Masukkan nama pembeli : ");
        nama = cc.nextLine();
        System.out.println("");
        System.out.print("Masukkan harga barang ke-1        :   ");
        harga1 = cc.nextInt();
        System.out.print("Masukkan harga barang ke-2        :   ");
        harga2 = cc.nextInt();
        System.out.print("Masukkan harga barang ke-3        :   ");
        harga3 = cc.nextInt();
        System.out.print("Masukkan harga barang ke-4        :   ");
        harga4 = cc.nextInt();
        System.out.print("Masukkan harga barang ke-5        :   ");
        harga5 = cc.nextInt();
        
        int jumlah = harga1 + harga2 + harga3 + harga4 + harga5;
        System.out.println("Total pembelian atas nama " + nama + " adalah " + jumlah);
        
        if (jumlah >= 100000){
            total = "Anda mendapatkan hadiah 1 buah mug cantik";
            System.out.println("");
            System.out.println("Selamat....");
            System.out.println(total);
        }else{
            total = " ";
        }
        System.out.println(" ");
        System.out.println("--------------------------------------------");
        System.out.println("                Terima Kasih                ");
        System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
    }
    
}
