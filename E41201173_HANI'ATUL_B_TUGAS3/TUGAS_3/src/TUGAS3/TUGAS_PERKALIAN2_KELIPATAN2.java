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
public class TUGAS_PERKALIAN2_KELIPATAN2 {
    public static void main(String[] args) {
        System.out.println("              Do_While               ");
        System.out.println("    Bilangan perkalian 2 ( 0-100)");
        System.out.println("======================================");
 
        //tugas kelipatan 2
 int angkaAwal = 0;
 angkaAwal= angkaAwal+2;
 int batasAkhir =100;
   do {
       System.out.print(angkaAwal);
       angkaAwal= angkaAwal * 2;
       System.out.print("    ");
       
       
   }while( angkaAwal<=batasAkhir);
   
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("              FOR_LOOP               ");
        System.out.println("    Bilangan kelipatan  2 ( 0-100)");
        System.out.println("====================================");
        
            angkaAwal= 2;
            batasAkhir = 50;
        for( int i = 1; i<= batasAkhir; i++){
            
            System.out.println(i + " x  2 =  " +angkaAwal );
            angkaAwal = angkaAwal+2;
        }
       }
}
