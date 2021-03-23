/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS2;

import java.util.Scanner;
public class TUGAS_E {
    public static void main(String[] args) {
        String nama, menu;
        Scanner input = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
       
        System.out.println("_____________________CAFE CERIA____________________");
        System.out.println("___________________ANEKA MINUMAN___________________");
        System.out.println("    SPESIAL MENU :  "); 
        System.out.println("    1. Soft drinks  ");
        System.out.println("    2. Mix juice    ");
        System.out.println("    3. Nescafe      ");
        System.out.println("    4. Soda milk    ");
        System.out.println("    5. Tea          ");
        System.out.println("---------------------------------------------------");
        System.out.print("Masukkan nama pembeli: ");
        nama = input.nextLine();
        System.out.println(" ");
        System.out.print("Silahkan masukkan pilihan anda: ");
        menu = scan.nextLine();
        
        switch (menu) {
            case "1":
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                System.out.println("Pesanan akan segera kami antar");
                break;
            case "2":
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                System.out.println("Pesanan akan segera kami antar");
                break;
            case "3":
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                System.out.println("Pesanan akan segera kami antar");
                break;
            case "4":
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                System.out.println("Pesanan akan segera kami antar");
                break;
            case "5":
                System.out.println("Minuman yang anda pesan adalah Tea");
                System.out.println("Pesanan akan segera kami antar");
                break;
            default:
                System.out.println("Mohon maaf menu yang anda pilih tidak tersedia");
        } 
        
        System.out.println("Terimakasih " + nama + " telah berkunjung di Cafe Ceria");
    }
}
