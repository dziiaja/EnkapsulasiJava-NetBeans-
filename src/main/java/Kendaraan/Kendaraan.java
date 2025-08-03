/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kendaraan;

/**
 *
 * @author Zikri
 */

public abstract class Kendaraan {
    protected String nama;
    protected int kapasitas;
   
    public Kendaraan(String nama, int kapasitas) {
        this.nama = nama;
        this.kapasitas = kapasitas;
    }
    public void info() {
        System.out.println("Nama:" + nama);
        System.out.println("Kapasitas: " + kapasitas + " orang");
    }
    public abstract void jalankan();
}

