package bangunGeometri.bangunDatar;

public class Lingkaran implements bangunDatar{

    private final double phi = 3.14;

    @Override
    public double luas(double s1, double s2) {
        return 0;
    }

    public double luas(double jari){
        return (phi*Math.pow(jari,2));
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }

    public double keliling(double jari) {
        return (2*phi*jari);
    }
}
