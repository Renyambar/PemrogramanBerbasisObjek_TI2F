package Tugas_Jobsheet1;

public class RiceCooker {
     String merk;
    double kapasitas;

    RiceCooker(String merk, double kapasitas) {
        this.merk = merk;
        this.kapasitas = kapasitas;
    }

    void masakNasi() {
        System.out.println("Rice cooker " + merk + " memasak nasi.");
    }

    void hangatkan() {
        System.out.println("Rice cooker " + merk + " menghangatkan nasi.");
    }

    void cetakInfo() {
        System.out.println("Rice Cooker: ");
        System.out.println("Merk=" + merk);
        System.out.println("Kapasitas: " + kapasitas + " liter");
    }
}
