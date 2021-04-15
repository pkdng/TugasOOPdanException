package bangunGeometri.bangunRuang;

import bangunGeometri.bangunDatar.bangunDatar;

public class Balok implements bangunRuang, bangunDatar {

    @Override
    public double luasPermukaan(double s1, double s2) {
        return 0;
    }

    public double luasPermukaan(double panjang, double lebar, double tinggi) {
        return (2*(panjang*lebar + panjang*tinggi + lebar*tinggi));
    }

    @Override
    public double volume(double s1, double s2) {
        return 0;
    }

    public double volume(double panjang, double lebar, double tinggi) {
        return (panjang*lebar*tinggi);
    }

    @Override
    public double luas(double panjang, double lebar) {
        return (panjang*lebar);
    }

    @Override
    public double keliling(double panjang, double lebar) {
        return (2*panjang + 2*lebar);
    }
}