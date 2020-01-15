/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author IDH-PC
 */
@ManagedBean (name = "nilai", eager = true)
@RequestScoped
public class kalkulator {
    public int nilai1,nilai2,hasilPenjumlahan,hasilPengurangan,hasilPerkalian,hasilPembagian;

    public int getHasilPenjumlahan() {
       hasilPenjumlahan = nilai1 + nilai2;
        return hasilPenjumlahan;
    }

    public void setHasilPenjumlahan(int hasilPenjumlahan) {
        this.hasilPenjumlahan = hasilPenjumlahan;
    }


    public int getNilai1() {
        return nilai1;
    }

    public void setNilai1(int nilai1) {
        this.nilai1 = nilai1;
    }

    public int getNilai2() {
        return nilai2;
    }

    public void setNilai2(int nilai2) {
        this.nilai2 = nilai2;
    }
    /**
     * Creates a new instance of kalkulator
     */
    public kalkulator() {
    }

    public int getHasilPengurangan() {
        hasilPengurangan = nilai1 - nilai2;
        return hasilPengurangan;
    }

    public void setHasilPengurangan(int hasilPengurangan) {
        this.hasilPengurangan = hasilPengurangan;
    }

    public int getHasilPerkalian() {
        hasilPerkalian = nilai1 * nilai2;
        return hasilPerkalian;
    }

    public void setHasilPerkalian(int hasilPerkalian) {
        this.hasilPerkalian = hasilPerkalian;
    }

    public int getHasilPembagian() {
        hasilPembagian = nilai1 / nilai2;
        return hasilPembagian;
    }

    public void setHasilPembagian(int hasilPembagian) {
        this.hasilPembagian = hasilPembagian;
    }
    
}
