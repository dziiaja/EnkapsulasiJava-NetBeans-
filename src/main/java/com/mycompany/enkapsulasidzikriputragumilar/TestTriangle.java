/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.enkapsulasidzikriputragumilar;

/**
 *
 * @author Zikri
 */
import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi 1 triangle: ");
        double side1 = input.nextDouble();

        System.out.print("Masukkan sisi 2 triangle: ");
        double side2 = input.nextDouble();

        System.out.print("Masukkan sisi 3 triangle: ");
        double side3 = input.nextDouble();

        System.out.print("Masukkan warna triangle: ");
        String color = input.next();

        System.out.print("Apakah triangle terisi (true/false): ");
        boolean filled = input.nextBoolean();

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println("\n" + triangle.toString());
        System.out.println("Luas: " + triangle.getArea());
        System.out.println("Keliling: " + triangle.getPerimeter());
        System.out.println("Warna: " + triangle.getColor());
        System.out.println("Terisi: " + triangle.isFilled());
    }
}
