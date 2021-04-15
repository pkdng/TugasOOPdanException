package bangunGeometri.bangunDatar;

public class PersegiPanjang implements bangunDatar{

    @Override
    public double luas(double panjang, double lebar) {
        return panjang*lebar;
    }

    @Override
    public double keliling(double panjang, double lebar) {
        return 2*panjang + 2*lebar;
    }
}
