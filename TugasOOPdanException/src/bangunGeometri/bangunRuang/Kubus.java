package bangunGeometri.bangunRuang;

import bangunGeometri.bangunDatar.bangunDatar;

public class Kubus implements bangunRuang, bangunDatar {

    @Override
    public double luasPermukaan(double rusuk1, double rusuk2) {
        return 0;
    }

    public double luasPermukaan(double rusuk){
        return (6*Math.pow(rusuk,2));
    }

    @Override
    public double volume(double rusuk1, double rusuk2) {
        return 0;
    }

    public double volume(double rusuk){
        return Math.pow(rusuk,3) ;
    }

    @Override
    public double luas(double s1, double s2) {
        return 0;
    }

    public double luas(double sisi) {
        return sisi*sisi;
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }

    public double keliling(double sisi) {
        return 4*sisi;
    }
}
