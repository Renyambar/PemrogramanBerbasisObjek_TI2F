package Tugas_Jobsheet1;

public class KipasAngin {
    String merk;
    int kecepatan;

    KipasAngin(String merk, int kecepatan) {
        this.merk = merk;
        this.kecepatan = kecepatan;
    }

    void nyalakan() {
        System.out.println("Kipas angin " + merk + " dinyalakan pada kecepatan " + kecepatan);
    }

    void matikan() {
        System.out.println("Kipas angin " + merk + " dimatikan.");
    }

    void cetakInfo() {
        System.out.println("Kipas Angin: ");
        System.out.println("Merk: " + merk);
        System.out.println("Kecepatan: " + kecepatan);
    }
}

