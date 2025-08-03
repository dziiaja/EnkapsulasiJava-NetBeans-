/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Zikri
 */
public class Kapal extends Kendaraan implements BisaBerlayar{
    public Kapal(String nama, int kapasitas) {
        super(nama, kapasitas);
    }
    
    @Override
    public void jalankan(){
        System.out.println(nama + "Berlayar di Pelabuhan");
    }
    @Override
    public void berlayar(){
        System.out.println(nama + "Sedang mengarungi Samudra");
    }
    
}
