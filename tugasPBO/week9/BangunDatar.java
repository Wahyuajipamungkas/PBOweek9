package week9;

public class BangunDatar{
    private int panjang;
    private int lebar;
    private double diameter;
    private int sisi;
    private static final double phi = 3.14;

    public BangunDatar(int sisi){
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(double diameter){
        this.diameter = diameter;
    }

    public int luas(int a){
        return a*a;
    }

    public int luas(int a, int b){
        return a*b;
    }

    public double luas(double a, double b){
        return(a*b)/2;
    }

    public double luas(double a){
        return (double) phi*a*a;
    }

    public int getsisi(){
        return sisi;
    }

    public int getpanjang(){
        return panjang;
    }

    public int getlebar(){
        return lebar;
    }

    public int kelilingpersegipanjang(int a, int b){
        return 2 * (a+b);
    }

    public double kelilinglingkaran(double d){
        return (double) 2*phi*d;
    }



}