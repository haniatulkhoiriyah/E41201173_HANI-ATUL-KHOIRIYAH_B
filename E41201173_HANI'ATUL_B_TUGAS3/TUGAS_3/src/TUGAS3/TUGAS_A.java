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
import java.util.Scanner;
public class TUGAS_A {
   public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai Batas Awal = ");
        int nilaiAwal = input.nextInt();
        System.out.print("Masukkan Nilai Batas Akhir = ");
        int nilaiAkhir = input.nextInt();

                System.out.println("Bilangan Genap = ");
                for(int i = nilaiAwal; i <= nilaiAkhir; i++){
                    if (i%2==0)
                        System.out.print(i + " ");
                }
            }  
}
