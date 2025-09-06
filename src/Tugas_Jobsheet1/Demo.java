package Tugas_Jobsheet1;

public class Demo {
    public static void main(String[] args) {
         // Instansiasi objek
        Kursi k = new Kursi("Kayu Jati", 4);
        KursiLipat kursiLipat = new KursiLipat("Kayu Jati", 4, true, 5.0);
        KursiRoda kursiRoda = new KursiRoda("Besi", 4, true, 2);
        KipasAngin kipas = new KipasAngin("Panasonic", 3);
        RiceCooker riceCooker = new RiceCooker("Philips", 1.8);

        
        k.cetakInfo();
        k.duduk();
        k.geser();
        System.out.println("------------------------");
        kursiLipat.cetakInfo();
        kursiLipat.lipat();
        System.out.println("------------------------");
        
        kursiRoda.cetakInfo();
        kursiRoda.dorong();
        kursiRoda.rem();
        System.out.println("------------------------");
        
        kipas.cetakInfo();
        kipas.nyalakan();
        kipas.matikan();
        System.out.println("------------------------");
        
        riceCooker.cetakInfo();
        riceCooker.hangatkan();
        riceCooker.masakNasi();
    }
}
