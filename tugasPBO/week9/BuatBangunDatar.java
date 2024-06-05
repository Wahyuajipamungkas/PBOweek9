package week9;

import java.util.Scanner;

import week9.BangunDatar;

public class BuatBangunDatar{
    public static void main(String[] args) {
        BangunDatar persegi = new BangunDatar(0);
    
        
        System.out.println("Nilai Luas Persegi Panjang:" + persegi.luas(8));
        System.out.println("Nilai Keliling Persegi pajang: " + persegi.kelilingpersegipanjang(3, 4));
        System.out.println("Nilai Luas Lingkaran:" + persegi.luas(2.8));   
        System.out.println("Nilai Keliling Lingkaran:" + persegi.kelilinglingkaran(8));     


    }
}