/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS3;

/**
 *
 * @author ACER
 */
public class TUGAS_B {
    public static void main(String[] args) {
        System.out.println("              Do_While               ");
        System.out.println("    Bilangan kelipatan 2 ( 1-100)");
        System.out.println("======================================");
        
    int nilaiAwal = 1;
    int nilaiAkhir = 100;
        do {
        System.out.print(nilaiAwal);
        nilaiAwal = nilaiAwal * 2;
        System.out.print("    ");
    } while( nilaiAwal <= nilaiAkhir);
    }
}
