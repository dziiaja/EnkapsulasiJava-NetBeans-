/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Zikri
 */
public class Pesawat extends Kendaraan implements BisaTerbang {
    public Pesawat(String nama, int kapasitas) {
        super(nama, kapasitas);
    }
    
    @Override
    public void jalankan() {
        System.out.println(nama + " Bergerak dilandasan pacu");
    }
    
    @Override
    public void terbang() {
        System.out.println(nama + " Sedang terbang di udara");
    }
}

