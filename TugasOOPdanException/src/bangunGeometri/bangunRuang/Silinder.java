package bangunGeometri.bangunRuang;

import bangunGeometri.bangunDatar.bangunDatar;

public class Silinder implements bangunRuang, bangunDatar {

    private final double phi = 3.14;

    @Override
    public double luasPermukaan(double jari, double tinggi) {
        return (2*phi*jari*(jari+tinggi));
    }

    @Override
    public double volume(double jari, double tinggi) {
        return (phi*Math.pow(jari,2)*tinggi);
    }

    @Override
    public double luas(double jariS, double tinggiS) { //LUAS SELIMUT
        return (2*phi*jariS*tinggiS);
    } //LUAS SELIMUT

    public double luas(double jariA){ //LUAS ALAS (LINGKARAN)
        return (phi*Math.pow(jariA,2));
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }

    public double keliling(double jari2) { //KELILING ALAS (LINGKARAN)
        return 2*phi*jari2;
    }
}
