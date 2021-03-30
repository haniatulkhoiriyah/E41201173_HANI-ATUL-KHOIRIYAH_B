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
public class TUGAS_C {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Masukkan Banyaknya Data Nilai : ");
        int banyak = scan.nextInt();
        int nilai [] = new int [banyak] ;
        int hasil = 0;
        float rata2;
        
        for(int i = 0; i < nilai.length; i ++){
            System.out.print("Masukkan data Nilai ke-" + (i+1) + " = ");
            nilai[i] = scan.nextInt();
            hasil += nilai[i];
        }
        System.out.println("");
        
        int max, min;
        max = nilai[0];
        min = nilai[0];
        
        for (int i = 0; i < nilai.length; i++){
        if (nilai[i] > max){
            max = nilai[i];
        }else if(nilai[i] < min){
            min = nilai[i];
            }   
        }
        
        rata2 = hasil/banyak;
        
        System.out.println("Nilai Minimum = " + min);
        System.out.println("Nilai Maximum = " + max);
        System.out.println("Nilai rata-ratanya adalah = " + rata2);
    }
}
