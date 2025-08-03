/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasidzikriputragumilar;

/**
 *
 * @author Zikri
 */
public class ProgramUtama {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa();
        
        siswa1.nama = "Dzikri";
        siswa1.nilai_basisdata = 100;
        siswa1.nilai_quiz = 100;
        siswa1.setNis("2324120115");
        
        System.out.println("Data Siswa");
        System.out.println("Nama: " + siswa1.nama);
        System.out.println("NIS: " + siswa1.getNis());
        System.out.println("Nilai BasisData: " + siswa1.nilai_basisdata);
        System.out.println("Nilai Quiz: " + siswa1.nilai_quiz);
    }
}
