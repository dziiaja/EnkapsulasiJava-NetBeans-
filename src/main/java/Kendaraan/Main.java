/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Zikri
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan[] daftarKendaraan = {
            new Mobil("Mobil SUV", 5),
            new Pesawat("Pesawat Boeing 737", 180),
            new Kapal("Kapal pesiar", 3000)
        };
        
        for (Kendaraan kendaraan : daftarKendaraan) {
            kendaraan.info();
            kendaraan.jalankan();
            
            if (kendaraan instanceof BisaTerbang) {
                ((BisaTerbang) kendaraan).terbang();
            }
            if (kendaraan instanceof BisaBerlayar) {
                ((BisaBerlayar) kendaraan).berlayar();
            }
            System.out.println("-----------------------------------------");
        }
    }
}

