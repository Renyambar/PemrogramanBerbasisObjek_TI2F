package Tugas_Jobsheet1;

public class KursiRoda extends Kursi {
    boolean adaRoda;
    int garansi;

    KursiRoda(String bahan, int jumlahKaki, boolean adaRoda, int garansi) {
        super(bahan, jumlahKaki);
        this.adaRoda = adaRoda;
        this.garansi = garansi;
    }

    void dorong() {
        System.out.println("Kursi roda sedang didorong.");
    }

    void rem() {
        System.out.println("Rem kursi roda diaktifkan.");
    }

    void cetakInfo() {
        super.cetakInfo();
        System.out.println("Kursi Roda: Roda=" + adaRoda);
        System.out.println("Garansi: " + garansi + " tahun");
    }
}

