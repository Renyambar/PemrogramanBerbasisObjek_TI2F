package Tugas_Jobsheet1;

public class KursiLipat extends Kursi {
    boolean bisaDilipat;
    double berat;

    KursiLipat(String bahan, int jumlahKaki, boolean bisaDilipat, double berat) {
        super(bahan, jumlahKaki);
        this.bisaDilipat = bisaDilipat;
        this.berat = berat;
    }

    void lipat() {
        System.out.println("Kursi lipat sedang dilipat.");
    }

    void buka() {
        System.out.println("Kursi lipat dibuka kembali.");
    }
    
    void cetakInfo() {
        System.out.println("Kursi Lipat:");
        super.cetakInfo();
        System.out.println("BisaDilipat=" + bisaDilipat);
        System.out.println("Berat: " + berat + " kg");
    }
}
