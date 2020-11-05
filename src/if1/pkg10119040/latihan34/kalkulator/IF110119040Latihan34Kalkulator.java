/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan34.kalkulator;
    import java.util.Scanner;
    import if1.pkg10119040.latihan34.kalkulator.calculator;
/**
 *
 * @author Acer
 * Nama : Agus Deri Dermwan
 * Kelas: IF1
 * NIM  : 10119040
 * program membuat perhitungan kalkulator
 */
public class IF110119040Latihan34Kalkulator {
   
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculator kal = new calculator();
        
        //
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("==========Aplikasi Kalkulator Bilangan=========");
        System.out.println("Masukan Angka ke-1 : ");
        kal.value1 = keyboard.nextDouble();
        
        System.out.println("Masukan Angka ke-2 : ");
        kal.value2 = keyboard.nextDouble();
        
        //
        System.out.println("");
        System.out.println("Hasil Pertambahan : " + kal.tambahBilangan());
        
        System.out.println("Hasil Pengurangan : " + kal.kurangBilangan());
        
        System.out.println("Hasil Perkalian : " + kal.kaliBilangan());
        
        System.out.println("Hasil Pembagian : " + kal.bagiBilangan());
        
        System.out.println("Hasil Sisa : " + kal.sisaBilangan());
    }
    
}
