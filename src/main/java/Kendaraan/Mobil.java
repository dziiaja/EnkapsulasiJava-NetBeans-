/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Zikri
 */
public class Mobil extends Kendaraan {
    public Mobil(String nama, int kapasitas) {
        super(nama, kapasitas);
    }
    
    @Override
    public void jalankan() {
        System.out.println(nama + " Berjalan di jalan raya");
    }
}
