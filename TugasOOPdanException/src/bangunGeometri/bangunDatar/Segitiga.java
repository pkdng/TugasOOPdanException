package bangunGeometri.bangunDatar;

public class Segitiga implements bangunDatar{
    @Override
    public double luas(double alas, double tinggi) {
        return (alas*tinggi)/2;
    }

    @Override
    public double keliling(double s1, double s2) {
        return 0;
    }
}
