/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan62.objectorientedlivingthing;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Program ini menampilkan aktivitas seseorang dengan 
 *                     berbasis objek
 */
public abstract class LivingThing {
    public abstract void walk(String nama);
    
    public void breath(String nama) {
        System.out.println(nama + " Sedang Bernafas");
    }
    
    public void eat(String nama) {
        System.out.println(nama + " Sedang Makan");
    }
}