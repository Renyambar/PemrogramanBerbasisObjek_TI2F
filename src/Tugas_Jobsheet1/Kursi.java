package Tugas_Jobsheet1;

public class Kursi {
    String bahan;
    int jumlahKaki;

    Kursi(String bahan, int jumlahKaki) {
        this.bahan = bahan;
        this.jumlahKaki = jumlahKaki;
    }

    void duduk() {
        System.out.println("Duduk di kursi berbahan " + bahan);
    }

    void geser() {
        System.out.println("Menggeser kursi dengan " + jumlahKaki + " kaki.");
    }

    void cetakInfo() {
        System.out.println("Kursi: ");
        System.out.println("Bahan: " + bahan);
        System.out.println("Jumlah kaki: " + jumlahKaki);
    }
}
