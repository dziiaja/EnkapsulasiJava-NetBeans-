/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasidzikriputragumilar;

/**
 *
 * @author Zikri
 */
public class Segitiga extends Bangundatar {
    int alas;
    int tinggi;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public float luas() {
        return 0.5f * this.alas * this.tinggi;
    }

    @Override
    public float keliling() {
        return 0; 
    }
}

