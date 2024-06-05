package week9;

import week9.BangunDatar;

public class BangunRuang extends BangunDatar{
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi){
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int volume(){
        return super.getsisi()*super.getsisi()*tinggi;
    }
}
