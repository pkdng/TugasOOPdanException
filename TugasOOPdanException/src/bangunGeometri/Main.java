package bangunGeometri;

import bangunGeometri.bangunDatar.Lingkaran;
import bangunGeometri.bangunDatar.Persegi;
import bangunGeometri.bangunDatar.PersegiPanjang;
import bangunGeometri.bangunDatar.Segitiga;
import bangunGeometri.bangunRuang.Balok;
import bangunGeometri.bangunRuang.Kubus;
import bangunGeometri.bangunRuang.Silinder;

import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int pilih;
        char lagi;
        boolean cek;

        do {
            cek=false;
            System.out.print("Menu :\n1. Persegi\n2. Lingkaran\n3. Persegi Panjang\n4. Segitiga\n5. Kubus\n6. Silinder\n7. Balok\n0. Sudahi Saja");
            try {
                System.out.print("\nPilih : ");
                pilih = input.nextInt();
                switch (pilih) {
                    case 1 -> persegi();
                    case 2 -> lingkaran();
                    case 3 -> persegiPanjang();
                    case 4 -> segitiga();
                    case 5 -> kubus();
                    case 6 -> silinder();
                    case 7 -> balok();
                    case 0 -> System.exit(0);
                    default -> System.out.println("\nTidak ada dalam pilihan");
                }
                System.out.print("\nMau lagi? (y/n) : ");
            }catch (Exception e){
                System.out.println("\nInput yang benarrsss");
                cek=true;
            }
            lagi = input.next().charAt(0);
            System.out.println();
        }while (cek || lagi=='y' || lagi=='Y');
    }

    private static void persegi(){
        double sisi;
        Persegi persegi = new Persegi();

        System.out.print("\nMasukkan panjang sisi : ");
        sisi = input.nextDouble();
        System.out.println("\nLuas Persegi = " + persegi.luas(sisi));
        System.out.println("Keliling Persegi = " + persegi.keliling(sisi));
    }

    private static void lingkaran(){
        double jari;
        Lingkaran lingkaran = new Lingkaran();

        System.out.print("\nMasukkan Jari-jari : ");
        jari = input.nextDouble();
        System.out.println("\nLuas Lingkaran = " + lingkaran.luas(jari));
        System.out.println("Keliling Lingkaran = " + lingkaran.keliling(jari));
    }

    private static void persegiPanjang(){
        double panjang, lebar;
        PersegiPanjang pp = new PersegiPanjang();

        System.out.print("\nMasukkan panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextDouble();
        System.out.println("\nLuas Persegi Panjang = " + pp.luas(panjang, lebar));
        System.out.println("Keliling Persegi Panjang = " + pp.keliling(panjang, lebar));
    }

    private static void segitiga(){
        double alas, tinggi;
        Segitiga segitiga = new Segitiga();

        System.out.print("\nMasukkan alas segitiga: ");
        alas = input.nextDouble();
        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = input.nextDouble();
        System.out.println("\nLuas Segitiga = " + segitiga.luas(alas, tinggi)) ;
    }

    private static void kubus(){
        double rusuk;
        Kubus kubus = new Kubus();

        System.out.print("\nMasukkan panjang rusuk : ");
        rusuk = input.nextDouble();
        System.out.println("\nLuas Permukaan Kubus = " + kubus.luasPermukaan(rusuk));
        System.out.println("Volume Kubus = " + kubus.volume(rusuk));
        System.out.println("Luas Persegi = " + kubus.luas(rusuk));
        System.out.println("Keliling Persegi = " + kubus.keliling(rusuk));
    }

    private static void silinder(){
        double jari, tinggi;
        Silinder silinder = new Silinder();

        System.out.print("\nMasukkan jari-jari lingkaran : ");
        jari = input.nextDouble();
        System.out.print("Masukkan tinggi silinder : ");
        tinggi = input.nextDouble();
        System.out.println("\nLuas Permukaan Silinder = " + silinder.luasPermukaan(jari, tinggi));
        System.out.println("Volume Silinder = " + silinder.volume(jari, tinggi));
        System.out.println("Luas Selimut = " + silinder.luas(jari, tinggi));
        System.out.println("Luas Lingkaran = " + silinder.luas(jari));
        System.out.println("Keliling Lingkaran = " + silinder.keliling(jari));
    }

    private static void balok(){
        double panjang, lebar, tinggi;
        Balok balok = new Balok();

        System.out.print("\nMasukkan panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar : ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi : ");
        tinggi = input.nextDouble();
        System.out.println("\nLuas Permukaan Balok = " + balok.luasPermukaan(panjang,lebar,tinggi));
        System.out.println("Volume Balok = " + balok.volume(panjang,lebar,tinggi));
        System.out.println("Luas Persegi Panjang = " + balok.luas(panjang,lebar));
        System.out.println("Keliling Persegi Panjang = " + balok.keliling(panjang,lebar));
    }
}
